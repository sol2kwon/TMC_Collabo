package com.toomuchcoder.api.food.service;

import com.toomuchcoder.api.auth.domain.Messenger;
import com.toomuchcoder.api.food.domain.Food;
import com.toomuchcoder.api.food.domain.FoodDTO;
import org.springframework.data.domain.Sort;
import org.springframework.web.multipart.MultipartFile;

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

     //<Food> analysisFood (MultipartFile file) throws Exception;
}
