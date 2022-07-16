package com.toomuchcoder.api.nutrient.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component @Data
public class NutrientDTO {
    @ApiModelProperty(position = 1) private long nutrientid;
    @ApiModelProperty(position = 2) String userkcal;
    @ApiModelProperty(position = 3) String usercarbo;
    @ApiModelProperty(position = 4) String userprotein;
    @ApiModelProperty(position = 5) String userfat;
    @ApiModelProperty(position = 6) String usercalcium;
    @ApiModelProperty(position = 7) String userminerals;
    @ApiModelProperty(position = 8) String uservitamin;

}
