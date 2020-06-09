<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: NOAH_Y
  Date: 2020/6/8
  Time: 17:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>成绩排名S</title>
</head>
<body>
    <form action="/rank" method="post">
        <table align="center">
            <tr>
            <td>排 名</td>
            <td>学 号</td>
            <td>姓 名</td>
            <td>成 绩</td>
        </tr>
            <c:forEach items="${list}" var="lst" varStatus="s">
                <tr>
                    <td>${s.index+1}</td>
                    <td>${lst.id}</td>
                    <td>${lst.username}</td>
                    <td>${lst.scores}</td>
                </tr>
            </c:forEach>
        <tr> <a href="/main">返回主页面</a></tr>
        </table>
    </form>
</body>
</html>
