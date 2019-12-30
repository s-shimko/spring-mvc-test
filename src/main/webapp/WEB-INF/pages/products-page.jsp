<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Products page</title>
</head>
<body>
<h1>Products page</h1>
<div id="account" align="right">
    <h3>Account: ${loggedUser}</h3>
</div>
<div class="workers-block" align="left">
    <table border="1px">
        <tr>
            <th>Products</th>
        </tr>
        <c:forEach items="${products}" var="product">
            <tr>
                <td><c:out value="${product.toString()}"/></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
