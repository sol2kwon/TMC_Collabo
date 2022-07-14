package com.toomuchcoder.api.food.services;

import com.toomuchcoder.api.auth.domain.Messenger;
import com.toomuchcoder.api.food.domains.Food;
import com.toomuchcoder.api.food.domains.FoodDTO;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface FoodService {
    List<Food> findAll(Sort sort);

    List<Food> findAll();

    Messenger update(FoodDTO foodDTO);

    Messenger delete(FoodDTO foodDTO);

    Messenger save(FoodDTO foodDTO);

    Messenger existsById(String foodid);

    Messenger deleteAll();

    Messenger count();
}
