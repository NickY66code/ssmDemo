<%--
  Created by IntelliJ IDEA.
  User: NOAH_Y
  Date: 2020/5/31
  Time: 20:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>考试结束</title>
</head>
<body>
    <form action="/examClose" method="post">
        <table align="center">
            <tr>
                <td>考试结束</td>
            </tr>
            <tr>
                <td>考试成绩${scores}</td>
            </tr>
            <tr>
                <td>
                    <a href="/main">返回</a>
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
