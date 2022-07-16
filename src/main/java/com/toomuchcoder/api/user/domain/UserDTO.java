package com.toomuchcoder.api.user.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

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
    @ApiModelProperty(position = 3) String password;
    @ApiModelProperty(position = 4) String nickname;
    @ApiModelProperty(position = 5) String name;
    @ApiModelProperty(position = 6) String phone;
    @ApiModelProperty(position = 7) String weight;
    @ApiModelProperty(position = 8) String height;
    @ApiModelProperty(position = 9) String gender;
    @ApiModelProperty(position = 10) String userkcal;
    @ApiModelProperty(position = 11) String usercarbo;
    @ApiModelProperty(position = 12) String userprotein;
    @ApiModelProperty(position = 13) String userfat;
    @ApiModelProperty(position = 14) String usercalcium;
    @ApiModelProperty(position = 15) String userminerals;
    @ApiModelProperty(position = 16) String uservitamin;
    @ApiModelProperty(position = 17) String email;
    @ApiModelProperty(position = 18) private String token;
    @ApiModelProperty(position = 19) private List<Role> roles;
//date 뺐음


}
