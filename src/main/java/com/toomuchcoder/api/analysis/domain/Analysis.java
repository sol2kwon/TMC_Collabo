package com.toomuchcoder.api.analysis.domain;

import com.sun.istack.NotNull;
import com.toomuchcoder.api.food.domain.Food;
import lombok.*;

import javax.persistence.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "analysis")
@Setter
@ToString
public class Analysis {
    @Id
    @Column(name = "analysisid")
    @GeneratedValue
    private long analysisid;
    @Column
    private @NotNull String chart;
    @Column
    private @NotNull String text;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "foodid")
    private Food food;

}
