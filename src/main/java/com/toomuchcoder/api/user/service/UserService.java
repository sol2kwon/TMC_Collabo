package com.toomuchcoder.api.user.service;

import com.toomuchcoder.api.auth.domain.Messenger;
import com.toomuchcoder.api.user.domain.User;
import com.toomuchcoder.api.user.domain.UserDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;


import java.util.List;
import java.util.Optional;

/**
 * packageName: com.toomuchcoder.api.user.service
 * fileName        : UserService.java
 * author          : solyikwon
 * date            : 2022-06-01
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-01         solyikwon      최초 생성
 **/

public interface UserService {
    List<User> findAll();

    List<User> findAll(Sort sort);

    Page<User> findAll(Pageable pageable);

    Messenger count();

    //void delete(UserDTO user) throws Exception;
    Messenger deleteAll();

    Messenger save(UserDTO user);

    Optional<User> findByToken(UserDTO user);

    Messenger existsById(String userid);

    UserDTO login(UserDTO paramUser);

    //커스텀
    Optional<User> findByUsername(String username);
    Messenger update(UserDTO user);

    Messenger logout();

    void delete(UserDTO user) throws Exception;






}
