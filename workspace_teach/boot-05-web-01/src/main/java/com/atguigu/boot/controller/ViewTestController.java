package com.atguigu.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ClassName: ViewTestController
 * Package: com.atguigu.boot.controller
 * Description:
 *
 * @Author kurt
 * @Create 2023/1/4 下午 09:15
 * @Version v1.0
 */
@Controller
public class ViewTestController {
    @GetMapping("/atguigu")
    public String atguigu(Model model){

        model.addAttribute("msg","你好 guigu");
        model.addAttribute("link","https://www.youtube.com/");
        return "success";
    }
}
