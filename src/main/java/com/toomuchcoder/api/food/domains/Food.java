package com.toomuchcoder.api.food.domains;

import com.toomuchcoder.api.analysis.domains.Analysis;
import com.toomuchcoder.api.image.domains.Image;
import com.toomuchcoder.api.user.domains.Role;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
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
    @Column private  String protein;
    @Column private  String fat;
    @Column private  String calcium;
    @Column private  String minerals;
    @Column private  String vitamin;
    @Column private  String date;


    @OneToMany(mappedBy = "user")
    List<Image> images = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "imageid")
    private Image image;

    @OneToMany(mappedBy = "food")
    List<Analysis> analysis = new ArrayList<>();


}
