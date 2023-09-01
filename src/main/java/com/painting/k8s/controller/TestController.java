package com.painting.k8s.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Painting
 * @date 2023年09月01日 15:42
 */
@Slf4j
@RestController
public class TestController {

    /**
     * 测试接口
     * @return
     */
    @GetMapping("/test")
    public String test(){
        log.info("接收到外界访问.");
        return "欢迎访问K8s中的springboot项目";
    }

}
