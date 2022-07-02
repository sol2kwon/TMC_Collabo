package com.toomuchcoder.api.comment.services;

import com.toomuchcoder.api.auth.domain.Messenger;
import com.toomuchcoder.api.comment.domains.Comment;

/**
 * packageName: com.toomuchcoder.api.comment.services
 * fileName        : CommentService.java
 * author          : solyikwon
 * date            : 2022-06-01
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-01         solyikwon      최초 생성
 **/
public interface CommentService {
     Messenger count() ;


      Messenger update(Comment comment);


     Messenger delete(Comment comment);


     Messenger save(Comment comment);

}
