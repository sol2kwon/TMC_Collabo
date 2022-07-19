package com.toomuchcoder.api.food.controller;

import com.sun.istack.logging.Logger;
import com.toomuchcoder.api.auth.domain.Messenger;
import com.toomuchcoder.api.food.domain.Food;
import com.toomuchcoder.api.food.domain.FoodDTO;
import com.toomuchcoder.api.food.service.FoodService;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.SwaggerDefinition;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
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
   @PostMapping("/upload")
    public ResponseEntity upload(@RequestPart MultipartFile file) {
        String originalFileName = file.getOriginalFilename();
        File destination = new File("C:/Users/amorf/test/" + originalFileName);//경로확인하기..
        try {
            file.transferTo(destination);
        } catch (IOException e) {
            e.printStackTrace();//에러확인
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(originalFileName);
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(originalFileName);
    }

    //1. 사용자가 파일 업로드하면 파이썬으로 어떻게 넘겨주는지? 데이터형식과 방법...
    // - 이미지 업로드하면 스프링이 이미지 주소 화면으로 넘겨줌(파일명)..//우리는 저장안해요! 바로 파이썬 고고
    // - 프론트에서 이미지 url 파이썬으로 바로 넘겨줌..read_img('url') 이런식으로 하면 될것같음.
    // - 파이썬에서 이미지 처리해서 프론트로 감.......save_img('new_url') local에서 save 하듯 다시 url에 저장을 하면 프런트가 출력한다.
    //2. 파이썬이 전달해주는 데이터 to 프런트 : 1)_ bbox 이미지, (음식이름 + 음식성분)
    //3. 영양소 데이터를 스프링에서 쓰지 않는다면,
    //        파이썬쪽에 디비를 하나 붙이는게 맞을지? or 파이썬에서 디비에 직접 접근을 하는게 나을지? win

/**
    @PostMapping(value ="/savemultipart")
    public ResponseEntity testMultipart(@RequestPart MultipartFile file) throws Exception {
        if (file == null) {
            throw new Exception();
        }
        String line;
        BufferedReader reader = new BufferedReader(new InputStreamReader(file.getInputStream()));
        while ((line = reader.readLine()) != null) {
        }

        return ResponseEntity.ok(service.analysisFood(file)).build();
    }
 */
}
