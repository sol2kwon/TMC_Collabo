package com.toomuchcoder.api.common;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * packageName: com.toomuchcoder.api
 * fileName        : HomeController.java
 * author          : solyikwon
 * date            : 2022-06-08
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-08         solyikwon      최초 생성
 **/
@RestController
public class HomeController {
        @GetMapping("/")
        public String now(){
            return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
        }
}
