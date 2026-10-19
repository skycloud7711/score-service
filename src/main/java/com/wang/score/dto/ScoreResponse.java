package com.wang.score.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
//判卷服务返回给主服务的判卷结果
public class ScoreResponse {
    private Long recordId;
    private Integer score;
    private String status;
}