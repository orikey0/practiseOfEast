<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src="/statics/js/jquery-3.5.1.js"></script>
    <script>
        $(function () {
            var html = "";
            $("#btn").click(function () {
                $.post("${pageContext.request.contextPath}/a2",function (data) {
                    // console.log(data);
                    for (let i = 0; i < data.length; i++) {
                        html += "<tr>" +
                            "<td>" + data[i].name + "</td>" +
                            "<td>" + data[i].age + "</td>" +
                            "<td>" + data[i].sex + "</td>" +
                            "</tr>";
                    }
                });
                $("#content").html(html);
                html = "";
            });
        });

    </script>
</head>

<body>
        加载数据<input type="button" value="提交" id="btn">
        <p></p>
    <table>
        <tr>
            <td>姓名</td>
            <td>年龄</td>
            <td>性别</td>
        </tr>
        <tbody id="content">

        </tbody>
    </table>

</body>
</html>