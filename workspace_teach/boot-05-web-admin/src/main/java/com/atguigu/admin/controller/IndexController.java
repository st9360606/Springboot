package com.atguigu.admin.controller;

import com.atguigu.admin.bean.Account;
import com.atguigu.admin.bean.User;

import com.atguigu.admin.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;


/**
 * ClassName: IndexController
 * Package: com.atguigu.admin.controller
 * Description:
 *
 * @Author kurt
 * @Create 2023/1/4 下午 10:14
 * @Version v1.0
 */
@Slf4j
@Controller
public class IndexController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    AccountService accountService;

    @GetMapping("/acct")
    public Account getById(@RequestParam("id") Long id){
        return accountService.getAcctByid( id);
    }

    @ResponseBody
    @GetMapping("/sql")
    public String queryFroDB(){
        Long along=jdbcTemplate.queryForObject("select count(*) from emp2", Long.class);
        return along.toString();
    }


    /**
     * 登陸頁
     *
     * @return
     */
    @GetMapping(value = {"/", "/login"})
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String main(User user, HttpSession session, Model model) {
        if (!StringUtils.isEmpty(user.getUserName()) && "123456".equals(user.getPassword())) {
            session.setAttribute("loginUser", user);
            //登陸成功，重定向導
            return "redirect:/main.html";
        } else {
            model.addAttribute("msg", "帳號密碼錯誤");
            return "login";
        }
    }

    /**
     * 去main頁面
     *
     * @return
     */
    @GetMapping("/main.html")
    public String mainPage(HttpSession session, Model model) {
        log.info("当前方法是：{}", "mainPage");
//        Object loginUser = session.getAttribute("loginUser");
//        if(loginUser!=null){
//            return "main";
//        }else {
//            model.addAttribute("msg","請重新登錄");
//            return "login";
//        }

        return "main";
    }

}
