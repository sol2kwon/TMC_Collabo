package com.toomuchcoder.api.post.controllers;

import com.toomuchcoder.api.auth.domain.Messenger;
import com.toomuchcoder.api.post.domains.Post;
import com.toomuchcoder.api.post.domains.PostDTO;
import com.toomuchcoder.api.post.services.PostService;
import com.toomuchcoder.api.user.domains.User;
import com.toomuchcoder.api.user.domains.UserDTO;
import com.toomuchcoder.api.user.services.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
@RequestMapping("/posts")
@RestController
@RequiredArgsConstructor
public class PostController {
    private final PostService service;


    @DeleteMapping("/delete")
    public ResponseEntity <Messenger> delete(Post post) {
        return ResponseEntity.ok(service.delete(post));

    }
    @PostMapping("/post")//게시글 작성
    public  ResponseEntity<Messenger> save(@ApiParam("Post create")@RequestBody Post post) {
        System.out.println("게시글 작성:"+post.toString());//확인하고 지우기.
        return ResponseEntity.ok(service.save(post));
    }
    @GetMapping("/findById/{postid}")
    public ResponseEntity<Optional<Post>> findById(@PathVariable String postid) {
        return ResponseEntity.ok(service.findById(postid));
    }

    @PutMapping("/postUpdate/{postid}")
    public ResponseEntity<Messenger> update(@PathVariable Long postid) {
       return ResponseEntity.ok(service.update(postid));
    }





}
