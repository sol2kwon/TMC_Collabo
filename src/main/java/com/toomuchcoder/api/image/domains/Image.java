package com.toomuchcoder.api.image.domains;

import com.toomuchcoder.api.user.domains.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * packageName: com.toomuchcoder.api.comment.domains
 * fileName        : Comment.java
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
@Table(name = "images")
public class Image {
    @Id
    @Column(name = "imageid")
    @GeneratedValue
    private Long imageid;
    @Column private  String urlimage;
    @Column private @NotNull String date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userid")
    User user;

}
