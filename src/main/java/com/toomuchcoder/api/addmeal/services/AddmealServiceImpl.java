package com.toomuchcoder.api.addmeal.services;


import com.toomuchcoder.api.addmeal.repositories.AddmealRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
public class AddmealServiceImpl implements AddmealService{
    private final AddmealRepository repository;
}
