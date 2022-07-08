package com.toomuchcoder.api.post.services;

import com.toomuchcoder.api.auth.domain.Messenger;
import com.toomuchcoder.api.post.domains.Post;
import com.toomuchcoder.api.post.repositories.PostRepository;
import com.toomuchcoder.api.user.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import static com.toomuchcoder.api.common.Box.Lambda.string;

/**
 * packageName: com.toomuchcoder.api.post.services
 * fileName        : PostServiceImpl.java
 * author          : solyikwon
 * date            : 2022-06-03
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-03         solyikwon      최초 생성
 **/
@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {
    private final PostRepository postRepository;
    private final UserRepository userRepository;

    @Override
    public List<Post> findAll() {

        return postRepository.findAll();
    }

    @Override
    public List<Post> findAll(Sort sort) {

        return postRepository.findAll(sort);
    }

    @Override
    public Messenger count() {
        return Messenger.builder().message(string(postRepository.count())).build();
    }

    @Override
    public Messenger delete(Post post) {
        postRepository.delete(post);
        return Messenger.builder().message("게시글 삭제 완료").build();
    }

    @Override
    public Messenger save(Post post) {
        postRepository.save(post);
        return Messenger.builder().message("게시글 작성 완료").build();
    }

    @Override
    public Optional<Post> findById(String postid) {

        return postRepository.findById(0L);
    }

    @Override
    public Messenger update(Long postid) {
        return null;
    }


}
