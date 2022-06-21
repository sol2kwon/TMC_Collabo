package com.toomuchcoder.api.post.domains;

import com.toomuchcoder.api.user.domains.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * packageName: com.toomuchcoder.api.post.domains
 * fileName        : Posts.java
 * author          : solyikwon
 * date            : 2022-06-03
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-03         solyikwon      최초 생성
 **/
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "posts")
public class Post {
    @Id
    @Column(name = "postid")
    @GeneratedValue private Long commentid;
    @Column private @NotNull String pimage;
    @Column private @NotNull String time;
    @Column private @NotNull String likes;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userid")
    User user;
}
