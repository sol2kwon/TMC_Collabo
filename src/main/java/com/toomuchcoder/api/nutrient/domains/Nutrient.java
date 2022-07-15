package com.toomuchcoder.api.nutrient.domains;

import com.toomuchcoder.api.user.domains.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * packageName: com.toomuchcoder.api.addmeal.domains
 * fileName        : addmeal.java
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
@Table(name = "nutrients")

public class Nutrient {
    @Id
    @Column(name = "nutrientid")
    @GeneratedValue private Long nutrientid;
    @Column private String userkcal;
    @Column private String usercarbo;
    @Column private String userprotein;
    @Column private String userfat;
    @Column private String usercalcium;
    @Column private String userphosphorus ;
    @Column private String usersalt;
    @Column private String userpotassium;
    @Column private String userpagnesium;

    @OneToOne
    @JoinColumn
    public User user;



}

