package com.toomuchcoder.api.post.domains;

import com.toomuchcoder.api.user.domains.Role;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * packageName: com.toomuchcoder.api.post
 * fileName        : PostDTO.java
 * author          : solyikwon
 * date            : 2022-07-01
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-07-01         solyikwon      최초 생성
 **/
@Component
@Data
public class PostDTO {
    @ApiModelProperty(position = 1) private long commentid;
    @ApiModelProperty(position = 2) String pimage;
    @ApiModelProperty(position = 3) String likes;
    @ApiModelProperty(position = 4) private String date;





}
