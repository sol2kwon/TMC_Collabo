package com.toomuchcoder.api.condition.domains;

import com.toomuchcoder.api.user.domains.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * packageName: com.toomuchcoder.api.condition.domains
 * fileName        : Condition.java
 * author          : solyikwon
 * date            : 2022-06-01
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-01         solyikwon      최초 생성
 **/
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "conditions")
public class Condition {
    @Id @Column(name = "conditionid")
    @GeneratedValue private Long conditionid;
    @Column private String address;
    @Column private String gander;
    @Column private String others;

    @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "userid")
        User user;

}
