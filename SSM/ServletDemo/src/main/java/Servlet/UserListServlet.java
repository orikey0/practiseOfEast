package Servlet;

/**
 * @author OriKey
 * @create 2020- 07- 01 16:15
 * -- 平凡才是唯一的答案 --
 **/
import Dao.UserDao;
import Pojo.User;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/listUser"})
public class UserListServlet extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html; charset=UTF-8");

        List<User>users = new UserDao().list();

        StringBuffer sb = new StringBuffer();
        sb.append("<table align='center' border='1' cellspacing='0'>\r\n");
        sb.append("<tr><td>id</td><td>name</td><td>pwd</td></tr>\r\n");

        String trFormat = "<tr><td>%d</td><td>%s</td><td>%s</td></tr>\r\n";

        for (User user : users) {
            String tr = String.format(trFormat, user.getId(), user.getName(), user.pwd);
            sb.append(tr);
        }

        sb.append("</table>");

        response.getWriter().write(sb.toString());

    }
}
