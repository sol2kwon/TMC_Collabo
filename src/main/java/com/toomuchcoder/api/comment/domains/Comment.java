package com.toomuchcoder.api.comment.domains;

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
@Table(name = "comments")
public class Comment {
    @Id
    @Column(name = "commentid")
    @GeneratedValue
    private Long commentid;
    @Column private  String comment;
    @Column private @NotNull String date;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userid")
    User user;

}
