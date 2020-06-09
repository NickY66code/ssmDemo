<%--
  Created by IntelliJ IDEA.
  User: NOAH_Y
  Date: 2020/6/3
  Time: 15:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>主页</title>
</head>
<body>
    <form action="/main" method="post">
        <table align="center">
            <tr>
                <td> <a href="/success">考试</a> </td>
            </tr>
            <tr>
                <td> <a href="/myself">个人信息</a> </td>
<%--                <input type="hidden" name="username" value="${username}">--%>
            </tr>
            <tr>
                <td> <a href="/rank">查询成绩</a> </td>
                <%--                <input type="hidden" name="username" value="${username}">--%>
            </tr>
        </table>
    </form>
</body>
</html>
