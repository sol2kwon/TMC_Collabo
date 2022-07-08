package com.toomuchcoder.api.user.services;

import com.toomuchcoder.api.auth.config.AuthProvider;
import com.toomuchcoder.api.auth.domain.Messenger;
import com.toomuchcoder.api.auth.exeption.SecurityRuntimeException;
import com.toomuchcoder.api.common.Blank.StringUtils;
import com.toomuchcoder.api.user.domains.*;
import com.toomuchcoder.api.user.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.toomuchcoder.api.common.Box.Lambda.longParse;
import static com.toomuchcoder.api.common.Box.Lambda.string;

/**
 * packageName: com.toomuchcoder.api.user.service
 * fileName        : UserServiceImpl.java
 * author          : solyikwon
 * date            : 2022-06-01
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-01         solyikwon      최초 생성
 **/
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository repository ;
    private final PasswordEncoder encoder;
    private final AuthProvider provider;//토큰 사용
    private final ModelMapper modelMapper;//맵핑

    @Override
    public UserDTO login(UserDTO paramUser) {
        try {
            UserDTO returnUser = new UserDTO();
            String username = paramUser.getUsername();
            User findUser = repository.findByUsername(username).orElse(null);
            if (findUser != null) {
                boolean checkPassword = encoder.matches(paramUser.getPassword(), findUser.getPassword());
                if (checkPassword) {
                    returnUser = modelMapper.map(findUser, UserDTO.class);
                    String token = provider.createToken(username, returnUser.getRoles());
                    returnUser.setToken(token);
                    findUser = modelMapper.map(returnUser, User.class); // 토큰
                    repository.save(findUser); // 토큰
                } else {
                    String token = "FAILURE";
                    returnUser.setToken(token);
                }
            }
            return returnUser;
        } catch (Exception e) {
            throw new SecurityRuntimeException("유효하지 않은 아이디/비밀번호", HttpStatus.UNPROCESSABLE_ENTITY);
        }
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    } //회원조회

    @Override
    public Messenger count() {return Messenger.builder().message(string(repository.count())).build();}//회원수 조회



    @Override @Transactional
    public Messenger update(final UserDTO user) {
        Optional<User> basicUser = repository.findByUsername(user.getUsername());
        User userdb = basicUser.get();
        if(StringUtils.isNotBlank(user.getBirth())) user.setBirth(user.getBirth());
        if(StringUtils.isNotBlank(user.getNickname())&& !repository.existsByNickname(user.getNickname())) user.setNickname(user.getNickname());
        if(StringUtils.isNotBlank(user.getPhone())&& !repository.existsByPhone(user.getPhone())) user.setPhone(user.getPhone());
        if(StringUtils.isNotBlank(user.getPassword())) user.setPassword(user.getPassword());
        if(StringUtils.isNotBlank(user.getUsername())&& !repository.existsByUsername(user.getUsername())) user.setUsername(user.getUsername());
        repository.save(userdb);
        return Messenger.builder().message("업데이트 완료").build();
    }//회원 정보 수정 데이터가 들어오면 해당 항목에 들어가서 값 저장


    @Override
    public Messenger delete(UserDTO user)  {
        User userdelete =repository.findByToken(user.getToken()).orElse(null);
        repository.delete(userdelete);
        return Messenger.builder().message("탈퇴 완료").build();
    }//유저의 토큰값 삭제//해당 회원 탈퇴



    @Override
    public Messenger deleteAll() {
        repository.deleteAll();
        return Messenger.builder().message("회원 전체 삭제").build();
    }//회원 전체 삭제

    @Override
    public Messenger save(UserDTO user) {
        System.out.println("서비스로 전달된 회원가입 정보: "+user.toString());
        String result = "";
        if (repository.findByUsername(user.getUsername()).isEmpty()) {
            List<Role> list = new ArrayList<>();
            list.add(Role.USER);
            repository.save(User.builder()
                    .username(user.getUsername())
                    .name(user.getName())
                    .birth(user.getBirth())
                    .phone(user.getPhone())
                    .nickname(user.getNickname())
                    .password(encoder.encode(user.getPassword()))
                    .roles(list).build());
            result = "SUCCESS";
        } else {
            result = "FAIL";
        }
        return Messenger.builder().message(result).build();
    }//회원가입


    @Override
    public Optional<User> findByToken(UserDTO user) {
        return repository.findByToken(user.getToken());
    }//유저의 토큰 찾기

    @Override
    public Messenger existsById(String userid) {
        return repository.existsById(longParse(userid))
                ? Messenger.builder().message("EXIST").build()
                : Messenger.builder().message("NOT_EXIST").build();
    }//중복 유저 아이디 확인

    @Override
    public List<User> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return null;
    }

    @Override
    public Messenger logout() {
       return Messenger.builder().message("로그아웃 완료").build();
    }

}
