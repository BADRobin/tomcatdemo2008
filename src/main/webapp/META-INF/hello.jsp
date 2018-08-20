<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Sweet
  Date: 20.08.2018
  Time: 20:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Hello from jsp</h1>
<jsp:useBean id="mybean"    class="beans.MyBean" scope="request"/>
<table>
    <c:forEach items="${mybean.people}" var="p">
        <tr>
            <td>${p.id}</td><td>${p.name}</td><td>${p.age}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
