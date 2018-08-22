<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 21.08.2018
  Time: 16:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<h1>Hello from Payara Server</h1>
<table>
    <c:forEach var="p" items="${mybean.people}" >
        <tr>
            <td>${p.id}</td><td>${p.name}</td><td>${p.age}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
