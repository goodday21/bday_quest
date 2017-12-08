<%--
  Created by IntelliJ IDEA.
  User: goodDay21
  Date: 07.12.2017
  Time: 22:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h1>Welcome, suka</h1>

    <form action="/login" method="post">
        login-name: <input type="text" name="login" width="30"/>
        login-password: <input type="password" name="password" width="15"/>
        <input type="submit" value="login"/>
    </form>

    <p style="color:red">${errorMessage}</p>
</body>
</html>
