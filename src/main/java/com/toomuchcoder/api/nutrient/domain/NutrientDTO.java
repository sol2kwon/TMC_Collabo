package com.toomuchcoder.api.nutrient.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.Column;

@Component @Data
public class NutrientDTO {
    @ApiModelProperty(position = 1) private long nutrientid;
    @ApiModelProperty(position = 2) String userkcal;
    @ApiModelProperty(position = 3) String usercarbo;
    @ApiModelProperty(position = 4) String usersugar;
    @ApiModelProperty(position = 5) String userfat;
    @ApiModelProperty(position = 6) String userprotein;
    @ApiModelProperty(position = 7) String usercalcium;
    @ApiModelProperty(position = 8) String userphosphorus;
    @ApiModelProperty(position = 9) String usersalt;
    @ApiModelProperty(position = 10) String userpotassium;
    @ApiModelProperty(position = 11) String userpagnesium;




}
