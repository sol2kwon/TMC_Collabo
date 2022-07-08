package com.toomuchcoder.api.condition.services;

import com.toomuchcoder.api.auth.domain.Messenger;
import com.toomuchcoder.api.condition.domains.Condition;
import com.toomuchcoder.api.condition.repositories.ConditionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.toomuchcoder.api.common.Box.Lambda.string;

/**
 * packageName: com.toomuchcoder.api.condition.services
 * fileName        : ConditionServiceImpl.java
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
public class ConditionServiceImpl implements ConditionService {
    private final ConditionRepository conditionRepository;

    @Override
    public List<Condition> findAll() {
        return conditionRepository.findAll();
    }

    @Override
    public List<Condition> findAll(Sort sort) {
        return conditionRepository.findAll(sort);
    }

    @Override
    public Messenger count() {
        return Messenger.builder().message(string(conditionRepository.count())).build();
    }

    @Override
    public Messenger delete(Condition condition) {
        conditionRepository.delete(condition);
        return Messenger.builder().message("조건 삭제 완료").build();
    }

    @Override
    public Messenger save(Condition condition) {
        return null;
    }

    @Override
    public Optional<Condition> findById(String conditionid) {
        return conditionRepository.findById(0L);
    }

    @Override
    public Messenger update(Condition condition) {
        return Messenger.builder().message("조건 업데이트 완료").build();
    }

}
