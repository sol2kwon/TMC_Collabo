package com.toomuchcoder.api.post.repositories;

import com.toomuchcoder.api.post.domains.Post;
import com.toomuchcoder.api.user.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
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
interface PostCustomRepository{
    //1.게시글 text와 image를 수정해라.
    @Query(value="update Post p set p.ptest = :ptest and p.pimage = :pimage where p.postid = :postid",
            nativeQuery = true)
    int update(@Param("ptest") String ptest,@Param("pimage") String pimage);

}

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {
}
