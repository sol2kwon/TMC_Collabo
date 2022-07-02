package com.toomuchcoder.api.comment.repositories;

import com.toomuchcoder.api.comment.domains.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

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
interface CommentCustomeReposittory{
    //1.댓글을 수정해라.
    @Query(value="update Comment c set c.comment = :comment  where c.commentid = :postid",
            nativeQuery = true)
    //만약 댓글이 수정된다면 수정 date 자동등록 어떻게 할지?
    int update(@Param("comment") String comment);
}
@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
