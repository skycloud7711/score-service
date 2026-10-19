package com.wang.score.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//让主服务检测判卷服务是否可用（检测接口能不能响应）
public class HealthController {

    @GetMapping("/health")
    public String health() {
        return "ok";
    }
}