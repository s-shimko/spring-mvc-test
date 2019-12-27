<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags" %><%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login page</title>
</head>
<body>
<h1>Login page</h1>
<spring:form modelAttribute="loginUser" method="post" action="/loginProcess">
    <table>
        <tr>
            <td><spring:label path="name">Login:</spring:label></td>
            <td><spring:input path="name" name="name"/></td>
        </tr>
        <tr>
            <td><spring:label path="password">Password:</spring:label></td>
            <td><spring:input path="password" name="password"/></td>
        <tr>
            <td>
                <button type="submit" value="login">Login</button>
            </td>
            <td><a href="/registration"> registration</a></td>
        </tr>
    </table>
</spring:form>
</body>
</html>
