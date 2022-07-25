package com.toomuchcoder.api.food.service;

import com.toomuchcoder.api.auth.domain.Messenger;
import com.toomuchcoder.api.food.domain.Food;
import com.toomuchcoder.api.food.domain.FoodDTO;
import org.springframework.data.domain.Sort;


import java.util.List;

public interface FoodService {
    List<Food> findAll(Sort sort);

    List<Food> findAll();

    List<Food> findAllFood();

    Messenger update(FoodDTO foodDTO);

    Messenger delete(FoodDTO foodDTO);

    Messenger save(FoodDTO foodDTO);

    Messenger existsById(String foodid);

    Messenger deleteAll();


     //<Food> analysisFood (MultipartFile file) throws Exception;
}
