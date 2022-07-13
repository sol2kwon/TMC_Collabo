package com.toomuchcoder.api.condition.controllers;

import com.toomuchcoder.api.auth.domain.Messenger;
import com.toomuchcoder.api.condition.domains.Condition;
import com.toomuchcoder.api.condition.services.ConditionService;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * packageName: com.toomuchcoder.api.condition.controllers
 * fileName        : ConditionController.java
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
@RequestMapping("/conditions")
public class ConditionController {
    private final ConditionService service;

    @GetMapping("/findAll")
    public ResponseEntity<List<Condition>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/findAll/sort")
    public ResponseEntity<List<Condition>> findAll(Sort sort) {
        return ResponseEntity.ok(service.findAll(sort));}

    @GetMapping("/count")
    public ResponseEntity<Messenger> count() {
        return ResponseEntity.ok(service.count());
    }

    @DeleteMapping("/delete")
    public ResponseEntity <Messenger> delete(Condition condition) {
        return ResponseEntity.ok(service.delete(condition));

    }
    @PostMapping("/condition")
    public  ResponseEntity<Messenger> save(@ApiParam("Post create")@RequestBody Condition condition) {
        System.out.println("조건 저장:"+condition.toString());//확인하고 지우기.
        return ResponseEntity.ok(service.save(condition));
    }
    @GetMapping("/findById/{conditionid}")
    public ResponseEntity<Optional<Condition>> findById(@PathVariable String conditionid) {
        return ResponseEntity.ok(service.findById(conditionid));
    }

    @PutMapping("/update")
    public ResponseEntity<Messenger> update(@RequestBody Condition condition) {
        return ResponseEntity.ok(service.update(condition));
        }

    }
