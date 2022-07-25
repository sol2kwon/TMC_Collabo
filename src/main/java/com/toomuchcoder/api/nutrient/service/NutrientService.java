package com.toomuchcoder.api.nutrient.service;

import com.toomuchcoder.api.auth.domain.Messenger;
import com.toomuchcoder.api.nutrient.domain.Nutrient;
import com.toomuchcoder.api.nutrient.domain.NutrientDTO;
import org.springframework.data.domain.Sort;

import java.util.List;

/**
 * packageName: com.toomuchcoder.api.addmeal.services
 * fileName        : AddmealService.java
 * author          : solyikwon
 * date            : 2022-06-01
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-01         solyikwon      최초 생성
 **/
public interface NutrientService {
    List<Nutrient> findAll(Sort sort);

    List<Nutrient> findAll();

    Messenger update(NutrientDTO nutrientDTO);

    Messenger delete(NutrientDTO nutrientDTO);

    Messenger save(NutrientDTO nutrientDTO);

    Messenger existsById(String nutrientid);

    Messenger deleteAll();

    Messenger count();

    List<Nutrient>getChart();
}
