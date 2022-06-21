package com.toomuchcoder.api.auth.domain;

import lombok.Builder;
import lombok.Getter;

/**
 * packageName: com.toomuchcoder.api.auth.domain
 * fileName        : Messenger.java
 * author          : solyikwon
 * date            : 2022-06-05
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-05         solyikwon      최초 생성
 **/
@Getter
@Builder
public class Messenger {
    private String message,code,token;
    private  int status;
}
