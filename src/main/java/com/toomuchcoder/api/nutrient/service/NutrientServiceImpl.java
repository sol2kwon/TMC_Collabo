package com.toomuchcoder.api.nutrient.service;


import com.toomuchcoder.api.auth.domain.Messenger;
import com.toomuchcoder.api.nutrient.domain.Nutrient;
import com.toomuchcoder.api.nutrient.domain.NutrientDTO;
import com.toomuchcoder.api.nutrient.repositorie.NutrientRepository;
import com.toomuchcoder.api.user.domain.UserDTO;
import com.toomuchcoder.api.user.repositorie.UserRepository;
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
public class NutrientServiceImpl  {
    private final NutrientRepository nutrientRepository;
    private final UserRepository userRepository;

    public List<Nutrient> findAll(Sort sort) {
        return null;
    }

    public List<Nutrient> findAll() {
        return null;
    }

    public Messenger update(NutrientDTO nutrientDTO) {
        return null;
    }

    public Messenger delete(NutrientDTO nutrientDTO) {
        return null;
    }

    public Messenger save(NutrientDTO nutrientDTO) {
        return null;
    }

    public Messenger existsById(String nutrientid) {
        return null;
    }

    public Messenger deleteAll() {
        return null;
    }

    public Messenger count() {
        return null;
    }

    /**
     * ‘체중×24×활동계수=하루 섭취량’ /3
     * 파생데이터는 dto에서 불러오기? 저장해야함
     * 사용자의 체중을 불러와서 연산해주기
     * */


    public List<Nutrient> getChart(UserDTO user) {


        //쿼리작성하기





        return null;
    }
}
