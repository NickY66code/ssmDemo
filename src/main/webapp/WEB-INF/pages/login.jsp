<%--
  Created by IntelliJ IDEA.
  User: NOAH_Y
  Date: 2020/5/29
  Time: 18:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style type="text/css">
        body{
            background:#999;
            text-align:center;
            color: #333;
            font-family:arial,verdana,sans-serif;
        }
    </style>
        <title>登录</title>
</head>
<body>
    <form action="login" method="post">
        <table>
            <caption><h3>登录</h3></caption>

            <tr>
                <td>
                    用户名：<input type="text" name="username"/>
                </td>
            </tr>
            <tr>
                <td>
                    密码：<input type="text" name="password" />
                </td>
            </tr>

            <tr align="center">
                <td colspan="2">
                    <input type="submit"value="登录">
                    <input type="reset" value="重填">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
