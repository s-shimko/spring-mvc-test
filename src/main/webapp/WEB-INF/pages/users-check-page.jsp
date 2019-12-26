<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: sergey
  Date: 26.12.19
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User check page</title>
</head>
<body>
    <spring:form modelAttribute="userFromServer" method="post" action="/users/check">
        <spring:input path="name"/>
        <spring:input path="password"/>
        <%--<spring:options items="items"/>--%>
        <spring:button name="submit">SUBMIT</spring:button>
    </spring:form>
</body>
</html>
