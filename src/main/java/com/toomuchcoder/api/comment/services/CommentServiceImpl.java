package com.toomuchcoder.api.comment.services;


import com.toomuchcoder.api.auth.domain.Messenger;
import com.toomuchcoder.api.comment.domains.Comment;
import com.toomuchcoder.api.comment.repositories.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static com.toomuchcoder.api.common.Box.Lambda.string;

/**
 * packageName: com.toomuchcoder.api.comment.services
 * fileName        : CommentServiceImpl.java
 * author          : solyikwon
 * date            : 2022-06-01
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-01         solyikwon      최초 생성
 **/
@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService{
    private final CommentRepository commentRepository;

    @Override
    public Messenger count() {
        return Messenger.builder().message(string(commentRepository.count())).build();
    }

    @Override
    public Messenger update(Comment comment) {
        return Messenger.builder().message("comment 업데이트 완료").build();
    }

    @Override
    public Messenger delete(Comment comment) {
        commentRepository.delete(comment);
        return Messenger.builder().message("Comment 삭제 완료").build();
    }

    @Override
    public Messenger save(Comment comment) {
        commentRepository.save(comment);
        return Messenger.builder().message("댓글 작성완료").build();
    }
}
