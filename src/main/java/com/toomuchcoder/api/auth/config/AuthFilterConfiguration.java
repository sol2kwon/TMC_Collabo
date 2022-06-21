package com.toomuchcoder.api.auth.config;

import lombok.RequiredArgsConstructor;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.DefaultSecurityFilterChain;

/**
 * packageName: com.toomuchcoder.api.auth.config
 * fileName        : AuthFilterConfiguration.java
 * author          : solyikwon
 * date            : 2022-06-07
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-07         solyikwon      최초 생성
 **/
//내부
@RequiredArgsConstructor//부모자식 관계 컴포지트 패턴
public class AuthFilterConfiguration  extends SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity> {
    @Override
    public void configure(HttpSecurity builder) throws Exception {
        super.configure(builder);
    }
}
