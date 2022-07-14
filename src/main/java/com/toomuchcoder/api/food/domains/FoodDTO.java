package com.toomuchcoder.api.food.domains;

import io.swagger.annotations.ApiModelProperty;

public class FoodDTO {
    @ApiModelProperty(position = 1) private long foodid;
    @ApiModelProperty(position = 2) String foodname;
    @ApiModelProperty(position = 3) String kcal;
    @ApiModelProperty(position = 4) String carbohydrate;
    @ApiModelProperty(position = 5) String protein;
    @ApiModelProperty(position = 6) String fat;
    @ApiModelProperty(position = 7) String calcium;
    @ApiModelProperty(position = 8) String minerals;
    @ApiModelProperty(position = 8) String vitamin;
    @ApiModelProperty(position = 8) String date;
}
