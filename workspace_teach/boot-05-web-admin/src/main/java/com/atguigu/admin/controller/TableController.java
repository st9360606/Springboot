package com.atguigu.admin.controller;

import com.atguigu.admin.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

/**
 * ClassName: TableController
 * Package: com.atguigu.admin.controller
 * Description:
 *
 * @Author kurt
 * @Create 2023/1/5 下午 07:18
 * @Version v1.0
 */
@Controller
public class TableController {
    @GetMapping("/basic_table")
    public String basic_table() {
        int i =10/0;
        return "table/basic_table";
    }

    @GetMapping("/dynamic_table")
    public String dynamic_table(Model model) {
        //表格內容遍歷
        List<User> users = Arrays.asList(new User("kurt", "123456"),
                new User("man", "123456"),
                new User("aa", "123456"),
                new User("bb", "123456")
        );
        model.addAttribute("users",users);
        return "table/dynamic_table";
    }

    @GetMapping("/responsive_table")
    public String responsive_table() {
        return "table/responsive_table";
    }

    @GetMapping("/editable_table")
    public String editable_table() {
        return "table/editable_table";
    }

}
