package com.toomuchcoder.api.auth.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.toomuchcoder.api.user.domain.User;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * packageName: com.toomuchcoder.api.auth.domain
 * fileName        : Auth.java
 * author          : solyikwon
 * date            : 2022-06-05
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-05         solyikwon      최초 생성
 **/
@Getter
@RequiredArgsConstructor
public class Auth implements UserDetails {
    private final long userid;
    private final String username;
    private final String name;
    @JsonIgnore private final String password;
    private final String phone;
    private final String email;


    public static Auth build(User user){
        List<GrantedAuthority> authorities = user.getRoles().stream()
                .map(role -> new SimpleGrantedAuthority(role.getAuthority()))
                .collect(Collectors.toList());
        return new Auth(user.getUserid(), user.getUsername(), user.getUsername(),user.getPassword(), user.getPhone(),user.getEmail(), authorities);
    }

    private  final Collection<? extends GrantedAuthority> authorities;

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}

