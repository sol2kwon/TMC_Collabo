package com.toomuchcoder.api.meal.controllers;

import com.toomuchcoder.api.meal.services.MealService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

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
}
