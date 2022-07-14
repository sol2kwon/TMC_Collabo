package com.toomuchcoder.api.food.services;

import com.toomuchcoder.api.food.repositories.FoodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FoodServiceImpl {
    private final FoodRepository foodRepository;
}
