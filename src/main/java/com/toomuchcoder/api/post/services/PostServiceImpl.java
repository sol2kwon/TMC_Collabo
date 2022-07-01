package com.toomuchcoder.api.post.services;

import com.toomuchcoder.api.auth.domain.Messenger;
import com.toomuchcoder.api.post.domains.Post;
import com.toomuchcoder.api.post.domains.PostDTO;
import com.toomuchcoder.api.post.repositories.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import static com.toomuchcoder.api.common.Lambda.string;

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
    private final PostRepository repository;

    @Override
    public List<Post> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Post> findAll(Sort sort) {
        return repository.findAll(sort);
    }

    @Override
    public Messenger count() {
        return Messenger.builder().message(string(repository.count())).build();
    }

    @Override
    public Messenger delete(Post post) {
        return Messenger.builder().message("").build();
    }

    @Override
    public Messenger save(PostDTO post) {
        return null;
    }

    @Override
    public Optional<Post> findById(String postid) {
        return repository.findById(0L);
    }

    @Override
    public Messenger update(Post post) {
        return Messenger.builder().message("업데이트 완료").build();
    }
}
