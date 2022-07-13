package com.toomuchcoder.api.condition.services;

import com.toomuchcoder.api.auth.domain.Messenger;
import com.toomuchcoder.api.condition.domains.Condition;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

/**
 * packageName: com.toomuchcoder.api.condition.services
 * fileName        : ConditionService.java
 * author          : solyikwon
 * date            : 2022-06-01
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-01         solyikwon      최초 생성
 **/
public interface ConditionService {
    List<Condition> findAll();

    List<Condition> findAll(Sort sort);

    Messenger count();

    Messenger delete(Condition condition);

    Messenger save(Condition condition);

    Optional<Condition> findById(String conditionid);

    Messenger update(Condition condition);



}
