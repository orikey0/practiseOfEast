<%--
  Created by IntelliJ IDEA.
  User: lhhsd
  Date: 2020/7/4
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script type="text/javascript">
    var userEntity = {
        name:"梨花",
        age:18,
        sex:"男"
    };
    var json = JSON.stringify(userEntity);
    console.log(json);
    var user = JSON.parse(json);
    console.log(user);
</script>
<body>

</body>
</html>
