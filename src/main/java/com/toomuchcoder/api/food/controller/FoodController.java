package com.toomuchcoder.api.food.controller;

import com.toomuchcoder.api.auth.domain.Messenger;
import com.toomuchcoder.api.food.domains.Food;
import com.toomuchcoder.api.food.domains.FoodDTO;
import com.toomuchcoder.api.food.services.FoodService;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/foods")
public class FoodController {
    private final FoodService service;

    @GetMapping("/findAll")
    public ResponseEntity<List<Food>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/findAll/sort")
    public ResponseEntity<List<Food>> findAll(Sort sort) {

        return ResponseEntity.ok(service.findAll(sort));
    }


    @GetMapping("/count")
    public ResponseEntity<Messenger> count() {
        return ResponseEntity.ok(service.count());
    }


    @PatchMapping(value = "/update") @ResponseBody
    public ResponseEntity<Messenger> update(@RequestBody FoodDTO foodDTO){
        return ResponseEntity.ok(service.update(foodDTO));
    }

    @DeleteMapping(value = "/delete") @ResponseBody
    public ResponseEntity<Messenger> delete(@RequestBody FoodDTO foodDTO){
        return ResponseEntity.ok(service.delete(foodDTO));
    }


    @DeleteMapping("/deleteAll")
    public ResponseEntity<Messenger> deleteAll() {
        return ResponseEntity.ok(service.deleteAll());
    }

    @PostMapping("/food")
    public ResponseEntity<Messenger> save(@ApiParam("food save")@RequestBody FoodDTO foodDTO) {
        System.out.println("food save:"+foodDTO.toString());//확인하고 지우기.
        return ResponseEntity.ok(service.save(foodDTO));
    }

    @GetMapping("/existsById/{foodid}")
    public ResponseEntity<Messenger> existsById(@PathVariable String foodid) {
        return ResponseEntity.ok(service.existsById(foodid));

    }
}
