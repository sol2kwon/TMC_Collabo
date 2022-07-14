package com.toomuchcoder.api.food.services;

import com.toomuchcoder.api.auth.domain.Messenger;
import com.toomuchcoder.api.food.domains.Food;
import com.toomuchcoder.api.food.domains.FoodDTO;
import com.toomuchcoder.api.food.repositories.FoodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FoodServiceImpl implements FoodService {
    private final FoodRepository foodRepository;

    @Override
    public List<Food> findAll(Sort sort) {
        return null;
    }

    @Override
    public List<Food> findAll() {
        return null;
    }

    @Override
    public Messenger update(FoodDTO foodDTO) {
        return null;
    }

    @Override
    public Messenger delete(FoodDTO foodDTO) {
        return null;
    }

    @Override
    public Messenger save(FoodDTO foodDTO) {
        return null;
    }

    @Override
    public Messenger existsById(String foodid) {
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
}
