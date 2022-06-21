package com.toomuchcoder.api.post.controllers;

import com.toomuchcoder.api.post.services.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName: com.toomuchcoder.api.post.controllers
 * fileName        : PostController.java
 * author          : solyikwon
 * date            : 2022-06-03
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-03         solyikwon      최초 생성
 **/
@RestController
@RequiredArgsConstructor
public class PostController {
    private final PostService service;
}
