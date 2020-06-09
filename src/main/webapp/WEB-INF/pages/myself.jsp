<%--
  Created by IntelliJ IDEA.
  User: NOAH_Y
  Date: 2020/6/5
  Time: 0:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>个人信息</title>
</head>
<body>
    <form action="/myself" method="post">
        <table align="center">
            <c:forEach items="${list}" var="mine">
                <tr align="center">
                <td>用户名:${mine.username}</td>
                </tr>
                <tr align=center">
                    <td>性别:${mine.sex}</td>
                </tr>
                <tr align=center">
                    <td>地址:${mine.address}</td>
                </tr>
            </c:forEach>
            <tr>
<%--                <input type="hidden" name="id" value="${id}">--%>
                <td><a href="/addUser">修改信息</a></td>
            </tr>
            <tr>
                <td><a href="/main">返回主页</a></td>
            </tr>
        </table>
    </form>
</body>
</html>
