package com.toomuchcoder.api.food.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component @Data
public class FoodDTO {
    @ApiModelProperty(position = 1) private long foodid;
    @ApiModelProperty(position = 2) String foodname;
    @ApiModelProperty(position = 3) String kcal;
    @ApiModelProperty(position = 4) String carbohydrate;
    @ApiModelProperty(position = 5) String protein;
    @ApiModelProperty(position = 6) String fat;
    @ApiModelProperty(position = 7) String calcium;
    @ApiModelProperty(position = 8) String phosphorus ;
    @ApiModelProperty(position = 9) String salt ;
    @ApiModelProperty(position = 10) String potassium  ;
    @ApiModelProperty(position = 11) String pagnesium  ;
    @ApiModelProperty(position = 12) String date;
}
