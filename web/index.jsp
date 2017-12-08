<%@ page import="java.util.Date" %>
<%@ page import="java.io.PrintWriter" %>
<%--
  Created by IntelliJ IDEA.
  User: goodDay21
  Date: 07.12.2017
  Time: 22:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>My title</title>
  </head>
  <body>

    <h1>Index.jsp</h1>
    <p>Privet</p>

    <%
        Date date = new Date();
        PrintWriter output = response.getWriter();
        output.println("<h2>" + date.toString() + "</h2>");
    %>

  </body>
</html>
