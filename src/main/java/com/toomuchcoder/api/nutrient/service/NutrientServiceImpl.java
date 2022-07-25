package com.toomuchcoder.api.nutrient.service;


import com.toomuchcoder.api.auth.domain.Messenger;
import com.toomuchcoder.api.nutrient.domain.Nutrient;
import com.toomuchcoder.api.nutrient.domain.NutrientDTO;
import com.toomuchcoder.api.nutrient.repositorie.NutrientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * packageName: com.toomuchcoder.api.addmeal.services
 * fileName        : AddmealServiceImpl.java
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
public class NutrientServiceImpl implements NutrientService {
    private final NutrientRepository nutrientRepository;

    @Override
    public List<Nutrient> findAll(Sort sort) {
        return null;
    }

    @Override
    public List<Nutrient> findAll() {
        return null;
    }

    @Override
    public Messenger update(NutrientDTO nutrientDTO) {
        return null;
    }

    @Override
    public Messenger delete(NutrientDTO nutrientDTO) {
        return null;
    }

    @Override
    public Messenger save(NutrientDTO nutrientDTO) {
        return null;
    }

    @Override
    public Messenger existsById(String nutrientid) {
        return null;
    }

    @Override
    public Messenger deleteAll() {
        return null;
    }

    @Override
    public Messenger count() {
        return null;
    }

    /**
     * ‘체중×24×활동계수=하루 섭취량’ /3
     * 파생데이터는 dto에서 불러오기? 저장해야함
     * */

    @Override
    public List<Nutrient> getChart() {


        return null;
    }
}
