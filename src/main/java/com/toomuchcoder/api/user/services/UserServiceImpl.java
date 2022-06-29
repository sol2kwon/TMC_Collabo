package com.toomuchcoder.api.user.services;

import com.toomuchcoder.api.auth.config.AuthProvider;
import com.toomuchcoder.api.auth.domain.Messenger;
import com.toomuchcoder.api.auth.exeption.SecurityRuntimeException;
import com.toomuchcoder.api.user.domains.Role;
import com.toomuchcoder.api.user.domains.User;
import com.toomuchcoder.api.user.domains.UserDTO;
import com.toomuchcoder.api.user.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.toomuchcoder.api.common.Lambda.longParse;
import static com.toomuchcoder.api.common.Lambda.string;

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
    private final UserRepository repository;
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
    }

    @Override
    public Messenger count() {

        return Messenger.builder().message(string(repository.count())).build();
    }

    @Override
    public Messenger update(User user) {
        return Messenger.builder().message("업데이트 완료").build();

    }

    @Override
    public Messenger delete(User user) {
        repository.delete(user);
        return Messenger.builder().message("").build();
    }

    @Override
    public Messenger save(UserDTO user) {
        String result = "";
        if (repository.findByUsername(user.getUsername()).isEmpty()) {
            List<Role> list = new ArrayList<>();
            list.add(Role.USER);
            repository.save(User.builder()
                    .username(user.getUsername())
                    .name(user.getName())
                    .birth(user.getBirth())
                    .phone(user.getPhone())
                    .password(encoder.encode(user.getPassword()))
                    .roles(list).build());
            result = "SUCCESS";
        } else {
            result = "FAIL";
        }
        return Messenger.builder().message(result).build();
    }

    @Override
    public Optional<User> findById(String userid) {
        return repository.findById(0L);
    }

    @Override
    public Messenger existsById(String userid) {
        return repository.existsById(longParse(userid))
                ? Messenger.builder().message("EXIST").build()
                : Messenger.builder().message("NOT_EXIST").build();
    }

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
       return Messenger.builder().build();
    }

}
