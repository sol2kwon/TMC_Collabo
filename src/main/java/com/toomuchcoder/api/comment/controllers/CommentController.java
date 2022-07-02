package com.toomuchcoder.api.comment.controllers;

import com.toomuchcoder.api.auth.domain.Messenger;
import com.toomuchcoder.api.comment.domains.Comment;
import com.toomuchcoder.api.comment.services.CommentService;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


/**
 * packageName: com.toomuchcoder.api.comment.controllers
 * fileName        : CommentController.java
 * author          : solyikwon
 * date            : 2022-06-01
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-01         solyikwon      최초 생성
 **/
@RestController
@RequiredArgsConstructor
@RequestMapping("/comments")
public class CommentController {
    private final CommentService service;


    @GetMapping("/count")
    public ResponseEntity<Messenger> count() {
        return ResponseEntity.ok(service.count());
    }

    @PutMapping("/update")
    public ResponseEntity<Messenger> update(@RequestBody Comment comment) {
        return ResponseEntity.ok(service.update(comment));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Messenger> delete(Comment comment) {
        return ResponseEntity.ok(service.delete(comment));

    }

    @PostMapping("/comment")
    public ResponseEntity<Messenger> save(@ApiParam("Comment comment")@RequestBody Comment comment) {
        System.out.println("comment check:"+comment.toString());//확인하고 지우기.
        return ResponseEntity.ok(service.save(comment));
    }

}
