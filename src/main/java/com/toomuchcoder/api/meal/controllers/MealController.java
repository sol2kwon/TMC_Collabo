package com.toomuchcoder.api.meal.controllers;

import com.toomuchcoder.api.auth.domain.Messenger;
import com.toomuchcoder.api.meal.domains.Meal;
import com.toomuchcoder.api.meal.services.MealService;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * packageName: com.toomuchcoder.api.meal.controllers
 * fileName        : MealController.java
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
public class MealController {
    private final MealService service;


    @GetMapping("/count")
    public ResponseEntity<Messenger> count() {
        return ResponseEntity.ok(service.count());
    }

    @DeleteMapping("/delete")
    public ResponseEntity <Messenger> delete(Meal meal) {
        return ResponseEntity.ok(service.delete(meal));

    }
    @PostMapping("/post")
    public  ResponseEntity<Messenger> save(@ApiParam("Meal add")@RequestBody Meal meal) {
        System.out.println("식단 이미지 추가:"+meal.toString());//확인하고 지우기.
        return ResponseEntity.ok(service.save(meal));
    }
}
