package com.toomuchcoder.api.image.domains;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * packageName: com.toomuchcoder.api.comment.domains
 * fileName        : CommentDTO.java
 * author          : solyikwon
 * date            : 2022-07-02
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-07-02         solyikwon      최초 생성
 **/
@Component @Data
public class ImageDTO {
    @ApiModelProperty(position = 1) private long imageid;
    @ApiModelProperty(position = 2) String urlimage;
    @ApiModelProperty(position = 3) private String date;

}
