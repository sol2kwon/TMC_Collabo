package com.toomuchcoder.api.user.domain;

import com.toomuchcoder.api.nutrient.domain.Nutrient;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * packageName: com.toomuchcoder.api.user
 * fileName        : User.java
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
@Table(name = "users")
@Setter
@ToString

public class User {
    @Id @Column (name = "userid")
    @GeneratedValue private long userid;
    @Column private @NotNull String username;
    @Column private @NotNull String password;
    @Column private @NotNull String nickname;
    @Column private @NotNull String email;
    @Column (unique = true) private @NotNull String name;
    @Column private @NotNull String phone;
    @Column private  float weight;
    @Column private  float height;
    @Column private  String gender;//Boolean 받아야함

    //@Column private @NotNull String date;
    @Column private String token;//토큰


    @OneToOne
    @JoinColumn(name = "nutrientid")
    public Nutrient nutrient;//연관관계 주인


    @ElementCollection(fetch = FetchType.EAGER)
    public List<Role>roles;






}
