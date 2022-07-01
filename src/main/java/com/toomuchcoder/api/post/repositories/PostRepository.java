package com.toomuchcoder.api.post.repositories;

import com.toomuchcoder.api.post.domains.Post;
import com.toomuchcoder.api.user.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName: com.toomuchcoder.api.post.repositories
 * fileName        : PostRepository.java
 * author          : solyikwon
 * date            : 2022-06-03
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-03         solyikwon      최초 생성
 **/
@Repository
public interface PostRepository extends JpaRepository<Post,Long> {
}
