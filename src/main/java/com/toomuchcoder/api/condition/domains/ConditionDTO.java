package com.toomuchcoder.api.condition.domains;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * packageName: com.toomuchcoder.api.condition.domains
 * fileName        : ConditionDTO.java
 * author          : solyikwon
 * date            : 2022-07-03
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-07-03         solyikwon      최초 생성
 **/
@Component @Data
public class ConditionDTO {
    @ApiModelProperty(position = 1) private long conditionid;
    @ApiModelProperty(position = 2) private Boolean vegetarian;
    @ApiModelProperty(position = 3) private String allergy;
    @ApiModelProperty(position = 4) private String calorie;
    @ApiModelProperty(position = 5) private String others;


}
