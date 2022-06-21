package com.toomuchcoder.api.addmeal.domains;

import com.toomuchcoder.api.user.domains.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

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
@Table(name = "addmeals")

public class Addmeal {
    @Id
    @Column(name = "addmealid")
    @GeneratedValue private Long addmealid;
    @Column private String time;
    @Column private String uimage;

    @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "userid")
        User user;


}

