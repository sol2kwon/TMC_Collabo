package com.toomuchcoder.api.food.domain;

import com.toomuchcoder.api.analysis.domain.Analysis;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "foods")
@Setter
@ToString
public class Food {
    @Id
    @Column(name = "foodid")
    @GeneratedValue
    private long foodid;
    @Column private  String foodname;
    @Column private  String kcal;
    @Column private  String carbohydrate;
    @Column private  String sugar;
    @Column private  String protein;
    @Column private  String fat;
    @Column private  String calcium;
    @Column private  String phosphorus ;
    @Column private  String salt ;
    @Column private  String potassium  ;
    @Column private  String pagnesium  ;
    @Column private  String date;



    @OneToMany(mappedBy = "food")
    List<Analysis> analysis = new ArrayList<>();


}
