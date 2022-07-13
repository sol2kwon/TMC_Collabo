package com.toomuchcoder.api.image.services;


import com.toomuchcoder.api.auth.domain.Messenger;
import com.toomuchcoder.api.image.domains.Image;
import com.toomuchcoder.api.image.repositories.ImageRepository;
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
public class ImageServiceImpl implements ImageService {
    private final ImageRepository imageRepository;

    @Override
    public Messenger count() {
        return Messenger.builder().message(string(imageRepository.count())).build();
    }

    @Override
    public Messenger update(Image comment) {
        return Messenger.builder().message("image 업데이트 완료").build();
    }

    @Override
    public Messenger delete(Image image) {
        imageRepository.delete(image);
        return Messenger.builder().message("image 삭제 완료").build();
    }

    @Override
    public Messenger save(Image image) {
        imageRepository.save(image);
        return Messenger.builder().message("댓글 작성완료").build();
    }
}
