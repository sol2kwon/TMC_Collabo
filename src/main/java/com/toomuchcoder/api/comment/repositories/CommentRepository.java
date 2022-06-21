package com.toomuchcoder.api.comment.repositories;

import com.toomuchcoder.api.comment.domains.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * packageName: com.toomuchcoder.api.comment.repositories
 * fileName        : CommentRepository.java
 * author          : solyikwon
 * date            : 2022-06-01
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-01         solyikwon      최초 생성
 **/
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
