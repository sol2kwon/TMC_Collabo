package com.toomuchcoder.api.meal.domains;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * packageName: com.toomuchcoder.api.meal.domains
 * fileName        : MealDTO.java
 * author          : solyikwon
 * date            : 2022-07-03
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-07-03         solyikwon      최초 생성
 **/
@Component @Data
public class MealDTO {
    @ApiModelProperty(position = 1)
    private long mealid;
    @ApiModelProperty(position = 2)
    private String mealimages;
    @ApiModelProperty(position = 3)
    private String date;
}
