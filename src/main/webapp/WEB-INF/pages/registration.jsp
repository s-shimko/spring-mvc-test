<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello page</title>
</head>
<body>
<h1>Registration page</h1>
<spring:form modelAttribute="registerUser" method="post" action="/registrationProcess">
    <table>
        <tr>
            <td><spring:label path="name">Login:</spring:label></td>
            <td><spring:input path="name" name="name"/></td>
        </tr>
        <tr>
            <td><spring:label path="password">Password:</spring:label></td>
            <td><spring:input path="password" name="password"/></td>
        <tr>
        <tr>
            <td><spring:label path="role">Role:</spring:label></td>
            <td>
                <spring:select path="role">
                    <spring:option value="admin">Admin</spring:option>
                    <spring:option value="user">User</spring:option>
                    <spring:option selected="guest" value="guest">Guest</spring:option>
                </spring:select>
            </td>
        <tr>
            <td>
                <button name="submit">Register</button>
            </td>
        </tr>
    </table>
</spring:form>
<td><a href="/login">Back to Login page</a></td>
</body>
</html>
