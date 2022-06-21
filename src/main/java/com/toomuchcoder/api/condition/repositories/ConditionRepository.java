package com.toomuchcoder.api.condition.repositories;

import com.toomuchcoder.api.condition.domains.Condition;
import com.toomuchcoder.api.user.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * packageName: com.toomuchcoder.api.condition.repositories
 * fileName        : ConditionRepository.java
 * author          : solyikwon
 * date            : 2022-06-01
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-01         solyikwon      최초 생성
 **/
public interface ConditionRepository extends JpaRepository<Condition,Long> {
}
