<%--
  Created by IntelliJ IDEA.
  User: lhhsd
  Date: 2020/7/5
  Time: 22:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script src="${pageContext.request.contextPath}/statics/js/jquery-3.5.1.js"></script>
    <script>
      function a(){
        $.post({
          url:"${pageContext.request.contextPath}/a1",
          data:{"name":$("#userName").val()},
          success:function (data) {
            alert(data);
          }
        });
      }
    </script>
  </head>

  <body>
  请输入用户名称：<input type="text" id="userName" onblur="a()">
  </body>
</html>
