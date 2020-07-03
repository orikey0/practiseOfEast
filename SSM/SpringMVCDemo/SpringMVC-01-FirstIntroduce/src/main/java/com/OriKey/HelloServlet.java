package com.OriKey;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author OriKey
 * @create 2020- 07- 02 23:29
 * -- 平凡才是唯一的答案 --
 **/
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        1.获取前端参数
        String method = req.getParameter("method");

        req.getSession().setAttribute("msg", "输入的参数是"+method);

//        2.调用业务层函数
//        3.返回相应的界面
        req.getRequestDispatcher("/WEB-INF/jsp/test.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req,
    HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
