package com.toomuchcoder.api.meal.services;

import com.toomuchcoder.api.meal.repositories.MealRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * packageName: com.toomuchcoder.api.meal.services
 * fileName        : MealServieImpl.java
 * author          : solyikwon
 * date            : 2022-06-01
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-01         solyikwon      최초 생성
 **/
@Service
@RequiredArgsConstructor
public class MealServiceImpl implements MealService {
    private final MealRepository repository;
}
