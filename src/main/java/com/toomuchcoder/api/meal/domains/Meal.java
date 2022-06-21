package com.toomuchcoder.api.meal.domains;

import com.toomuchcoder.api.user.domains.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * packageName: com.toomuchcoder.api.meal.domains
 * fileName        : Meal.java
 * author          : solyikwon
 * date            : 2022-06-01
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-01         solyikwon      최초 생성
 **/
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "meals")

public class Meal {
    @Id @Column(name = "mealid")
    @GeneratedValue private Long mealid;
    @Column private String timestamp;
    @Column private String mealimages;

    @ManyToOne(fetch =FetchType.LAZY)
        @JoinColumn(name = "userid")
    User user;



}
