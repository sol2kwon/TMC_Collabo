package com.toomuchcoder.api.image.controllers;

import com.toomuchcoder.api.auth.domain.Messenger;
import com.toomuchcoder.api.image.domains.Image;
import com.toomuchcoder.api.image.services.ImageService;
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
@RequestMapping("/images")
public class ImageController {
    private final ImageService service;


    @GetMapping("/count")
    public ResponseEntity<Messenger> count() {
        return ResponseEntity.ok(service.count());
    }

    @PutMapping("/update")
    public ResponseEntity<Messenger> update(@RequestBody Image comment) {
        return ResponseEntity.ok(service.update(comment));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Messenger> delete(Image comment) {
        return ResponseEntity.ok(service.delete(comment));

    }

    @PostMapping("/image")
    public ResponseEntity<Messenger> save(@ApiParam("image 작성 완료")@RequestBody Image comment) {
        System.out.println("image check:"+comment.toString());//확인하고 지우기.
        return ResponseEntity.ok(service.save(comment));
    }

}
