package com.toomuchcoder.api.nutrient.repositorie;

import com.toomuchcoder.api.nutrient.domain.Nutrient;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * packageName: com.toomuchcoder.api.addmeal.repositories
 * fileName        : AddmealRepositories.java
 * author          : solyikwon
 * date            : 2022-06-01
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-01         solyikwon      최초 생성
 **/
public interface NutrientRepository extends JpaRepository<Nutrient, Long> {
}
