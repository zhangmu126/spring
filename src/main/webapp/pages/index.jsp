<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
        <title>SpringMVC Demo 首页</title>
        <!-- 新 Bootstrap 核心 CSS 文件 -->
        <link rel='stylesheet' href='/static/bootstrap/css/bootstrap.min.css' type='text/css' media='screen' />
        <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
        <script src="/static/jquery-1.8.3/jquery.min.js"></script>
        <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
        <script src="/static/bootstrap/js/bootstrap.min.js"></script>
    </head>
    <body>
    <form:form id="loginForm" action="user/login" method="post" modelAttribute="userVo">
        <label>登录名:</label>
        <form:input path="userName" />
        <label>密码:</label>
        <form:input path="userPwd"/>
        <input type="submit" value="登 录"/>
    </form:form>
    </body>
</html>
