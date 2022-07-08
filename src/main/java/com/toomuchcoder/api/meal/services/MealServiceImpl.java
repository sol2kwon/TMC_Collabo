package com.toomuchcoder.api.meal.services;

import com.toomuchcoder.api.auth.domain.Messenger;
import com.toomuchcoder.api.meal.domains.Meal;
import com.toomuchcoder.api.meal.repositories.MealRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static com.toomuchcoder.api.common.Box.Lambda.string;

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
    private final MealRepository mealRepository;

    @Override
    public Messenger count() {
        return Messenger.builder().message(string(mealRepository.count())).build();
    }

    @Override
    public Messenger delete(Meal meal) {
        return Messenger.builder().message("식단 이미지 삭제 완료").build();
    }

    @Override
    public Messenger save(Meal meal) {
        mealRepository.save(meal);
        return Messenger.builder().message("식단 업로드 완료").build();
    }
}
