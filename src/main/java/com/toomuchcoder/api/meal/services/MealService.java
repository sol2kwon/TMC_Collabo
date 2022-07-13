package com.toomuchcoder.api.meal.services;

import com.toomuchcoder.api.auth.domain.Messenger;
import com.toomuchcoder.api.meal.domains.Meal;

/**
 * packageName: com.toomuchcoder.api.meal.services
 * fileName        : MealServieI.java
 * author          : solyikwon
 * date            : 2022-06-01
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-01         solyikwon      최초 생성
 **/
public interface MealService {
    Messenger count();

    Messenger delete(Meal meal);

    Messenger save(Meal meal);

}
