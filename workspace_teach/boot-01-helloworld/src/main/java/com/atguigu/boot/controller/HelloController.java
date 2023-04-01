package com.atguigu.boot.controller;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * ClassName: HelloController
 * Package: com.atguigu.boot.controller
 * Description:
 *
 * @Author kurt
 * @Create 2022/12/29 上午 12:50
 * @Version v1.0
 */
@Slf4j
@RestController
public class HelloController {
    @RequestMapping("/hello2")
    public String handle01(@RequestParam("name")String name){

        log.info("請求進來了.....");
        return "Hello, Spring Boot 2!"+" 你好 : "+ name;


    }
}
