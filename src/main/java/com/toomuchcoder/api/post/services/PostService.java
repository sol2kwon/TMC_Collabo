package com.toomuchcoder.api.post.services;

import com.toomuchcoder.api.auth.domain.Messenger;
import com.toomuchcoder.api.post.domains.Post;
import com.toomuchcoder.api.post.domains.PostDTO;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

/**
 * packageName: com.toomuchcoder.api.post.services
 * fileName        : PostService.java
 * author          : solyikwon
 * date            : 2022-06-03
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-03         solyikwon      최초 생성
 **/
public interface PostService {

    List<Post> findAll();

    List<Post> findAll(Sort sort);

    Messenger count();

    Messenger delete(Post post);

    Messenger save(Post post);

    Optional<Post> findById(String postid);

    Messenger update(Post post);
}
