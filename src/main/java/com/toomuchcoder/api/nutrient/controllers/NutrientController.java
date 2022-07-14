package com.toomuchcoder.api.nutrient.controllers;

import com.toomuchcoder.api.nutrient.services.NutrientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName: com.toomuchcoder.api.addmeal.controllers
 * fileName        : addmealController.java
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
@RequestMapping("/nutrients")

public class NutrientController {
    private final NutrientService service;
}
