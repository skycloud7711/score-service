package com.wang.score.dto;

import lombok.Data;
import java.util.Map;

@Data
//接收主服务发来的判卷请求
public class ScoreRequest {
    private Long recordId;
    private Map<String, String> studentAnswers;    //题号 -> 学生答案
    private Map<String, String> standardAnswers;   //题号 -> 正确答案
    private Map<String, Integer> questionScores;   //题号 -> 分值
}