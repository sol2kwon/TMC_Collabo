package com.toomuchcoder.api.user.domains;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.toomuchcoder.api.addmeal.domains.Addmeal;
import com.toomuchcoder.api.comment.domains.Comment;
import com.toomuchcoder.api.meal.domains.Meal;
import com.toomuchcoder.api.post.domains.Post;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
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
    @Column private @NotNull String nickname;
    @Column private @NotNull String name;
    @Column private @NotNull String password;
    @Column private @NotNull String birth;
    @Column private @NotNull String phone;
    @Column private String token;//토큰

    @OneToMany(mappedBy = "user")
    List<Meal> meals = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    List<Addmeal> addmeals = new ArrayList<>();

    @OneToMany(mappedBy = "user")
    List<Comment> comments = new ArrayList<>();

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY )
    //@JsonIgnoreProperties({"user"})
    private List<Post> posts = new ArrayList<>();

    @ElementCollection(fetch = FetchType.EAGER)
    public List<Role>roles;






}
