package com.wang.score.controller;

import com.wang.score.dto.ScoreRequest;
import com.wang.score.dto.ScoreResponse;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/score")
//接收主服务发来的答案，算分数，返回结果
public class ScoreController {

    @PostMapping("/calculate")
    public ScoreResponse calculate(@RequestBody ScoreRequest request) {
        Map<String, String> student = request.getStudentAnswers();
        Map<String, String> standard = request.getStandardAnswers();
        Map<String, Integer> scores = request.getQuestionScores();

        int total = 0;
        for (Map.Entry<String, String> e : standard.entrySet()) {
            String no = e.getKey();                                     //题号
            String correct = e.getValue();                              //标准答案
            Integer qScore = scores.getOrDefault(no, 0);    //分值
            if (correct.equals(student.get(no))) {                      //比对
                total += qScore;
            }
        }
        return new ScoreResponse(request.getRecordId(), total, "SCORED");
    }
}