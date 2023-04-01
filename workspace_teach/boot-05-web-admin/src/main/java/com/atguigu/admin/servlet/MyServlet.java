package com.atguigu.admin.servlet;



import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ClassName: MyServlet
 * Package: com.atguigu.admin.servlet
 * Description:
 *
 * @Author kurt
 * @Create 2023/1/6 下午 10:25
 * @Version v1.0
 */
//@WebServlet("/my")
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("6666");
    }
}
