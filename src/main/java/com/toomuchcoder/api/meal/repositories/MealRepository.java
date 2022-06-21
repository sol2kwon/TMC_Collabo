package com.toomuchcoder.api.meal.repositories;

import com.toomuchcoder.api.meal.domains.Meal;
import com.toomuchcoder.api.user.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * packageName: com.toomuchcoder.api.meal.repositories
 * fileName        : MealRepository.java
 * author          : solyikwon
 * date            : 2022-06-01
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-01         solyikwon      최초 생성
 **/
public interface MealRepository extends JpaRepository<Meal,Long> {
}
