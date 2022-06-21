package com.toomuchcoder.api.user.domains;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * packageName: com.toomuchcoder.api.user.domains.controllers
 * fileName        : UserDTO.java
 * author          : solyikwon
 * date            : 2022-06-05
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-06-05         solyikwon      최초 생성
 **/
@Component @Data
public class UserDTO {
    @ApiModelProperty(position = 1) private long userid;
    @ApiModelProperty(position = 2) String username;
    @ApiModelProperty(position = 3) String name;
    @ApiModelProperty(position = 4) String password;
    @ApiModelProperty(position = 5) String birth;
    @ApiModelProperty(position = 6) String phone;
    @ApiModelProperty(position = 7) private String time;
    @ApiModelProperty(position = 8) private String token;
    @ApiModelProperty(position = 9) private List<Role> roles;

}
