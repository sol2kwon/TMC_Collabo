package com.toomuchcoder.api.condition.controllers;

import com.toomuchcoder.api.condition.services.ConditionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName: com.toomuchcoder.api.condition.controllers
 * fileName        : ConditionController.java
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
public class ConditionController {
    private final ConditionService service;


}
