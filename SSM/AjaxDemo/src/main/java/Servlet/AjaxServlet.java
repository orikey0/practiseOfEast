package Servlet;

import Pojo.Hero;
import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author OriKey
 * @create 2020- 07- 01 9:08
 * -- 平凡才是唯一的答案 --
 **/
@WebServlet(urlPatterns = {"/Ajax"})
public class AjaxServlet extends HttpServlet {

        protected void service(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            String data =request.getParameter("data");

            System.out.println("服务端接收到的数据是：" +data);

            JSONObject json=JSONObject.fromObject(data);

            System.out.println("转换为JSON对象之后是："+ json);

        }

}
