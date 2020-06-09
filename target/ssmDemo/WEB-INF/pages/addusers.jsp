<%--
  Created by IntelliJ IDEA.
  User: NOAH_Y
  Date: 2020/6/6
  Time: 17:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改用户</title>
</head>
<body>
<form action="/updateSucc" method="post">
    <table align="center">
        <caption><h3>信息修改</h3></caption>
        <tr>
            <td>姓名:<input type="text" name="username"></td>
        </tr>
        <tr>
            <td>性别:<input type="text" name="sex"></td>
        </tr>
        <tr>
            <td>地址:<input type="text" name="address"></td>
        </tr>
        <tr>
            <td>
                密码:<input type="password" name="password">
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="提交"/>
            </td>
            <td>
                <a href="/myself">返回</a>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
