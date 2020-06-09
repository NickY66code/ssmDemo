<%--
  Created by IntelliJ IDEA.
  User: NOAH_Y
  Date: 2020/5/31
  Time: 20:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>考试</title>
</head>
<body>
    <form action="/exams" method="post" >
        <table align="center">
                <tr>
                    <td> 题目${quesId}
                        <input type="hidden" name="quesId" value="${quesId}" /></td>
                        <input type="hidden" name="scores" value="${scores}" />
                </tr>
                <tr>
                    <td>${question}</td>
                </tr>
                <tr>
                    <td>A:${answerA}<input type="radio"  name="choose" value="${answerA}"></td>
                </tr>
                <tr>
                    <td>B:${answerB}<input type="radio"  name="choose" value="${answerB}"></td>
                </tr>
                <tr>
                    <td>C:${answerC}<input type="radio"  name="choose" value="${answerC}"></td>
                </tr>
                <tr>
                    <td>D:${answerD}<input type="radio"  name="choose" value="${answerD}"></td>
                </tr>
                <tr>
                    <td> <input type="submit" value="提交"> </td>
                </tr>

        </table>
    </form>
</body>
</html>
