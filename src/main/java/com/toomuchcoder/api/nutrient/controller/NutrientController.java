package com.toomuchcoder.api.nutrient.controller;

import com.toomuchcoder.api.auth.domain.Messenger;
import com.toomuchcoder.api.food.domain.Food;
import com.toomuchcoder.api.nutrient.domain.Nutrient;
import com.toomuchcoder.api.nutrient.domain.NutrientDTO;
import com.toomuchcoder.api.nutrient.service.NutrientService;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.json.JSONObject;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * packageName: com.toomuchcoder.api.addmeal.controllers
 * fileName        : addmealController.java
 * author          : solyikwon
 * date            : 2022-06-01
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-01         solyikwon      최초 생성
 **/
@RestController
@RequiredArgsConstructor
@RequestMapping("/nutrients")

public class NutrientController {
    private final NutrientService service;

    @GetMapping("/findAll")
    public ResponseEntity<List<Nutrient>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/findAll/sort")
    public ResponseEntity<List<Nutrient>> findAll(Sort sort) {

        return ResponseEntity.ok(service.findAll(sort));
    }

    @GetMapping("/count")
    public ResponseEntity<Messenger> count() {
        return ResponseEntity.ok(service.count());
    }


    @PatchMapping(value = "/update") @ResponseBody
    public ResponseEntity<Messenger> update(@RequestBody NutrientDTO nutrientDTO){
        return ResponseEntity.ok(service.update(nutrientDTO));
    }

    @DeleteMapping(value = "/delete") @ResponseBody
    public ResponseEntity<Messenger> delete(@RequestBody NutrientDTO nutrientDTO){
        return ResponseEntity.ok(service.delete(nutrientDTO));
    }

    @DeleteMapping("/deleteAll")
    public ResponseEntity<Messenger> deleteAll() {
        return ResponseEntity.ok(service.deleteAll());
    }

    @PostMapping("/nutrient")
    public ResponseEntity<Messenger> save(@ApiParam("nutrient user")@RequestBody NutrientDTO nutrientDTO) {
        System.out.println("nutrient 정보:"+nutrientDTO.toString());//확인하고 지우기.
        return ResponseEntity.ok(service.save(nutrientDTO));
    }

    @GetMapping("/existsById/{nutrientid}")
    public ResponseEntity<Messenger> existsById(@PathVariable String nutrientid) {
        return ResponseEntity.ok(service.existsById(nutrientid));

    }

    /**
     * 조회버튼 클릭시 주황색 막대 화면에(권장 영양소 및 칼로리) 화면에 전달
     */
    @GetMapping("/api/ochart") @ResponseBody
    public List<Nutrient>getChart(){
        return service.getChart();
    }
}
