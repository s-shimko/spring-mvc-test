<html>
<head>
    <title>Login page</title>
</head>
<body>
<h1>Login page</h1>
<form modelAttribute="loginUser" method="post" action="/loginProcess">
    <table>
        <tr>
            <td><label path="name">Login:</label></td>
            <td><input path="name" name="name"/></td>
        </tr>
        <tr>
            <td><label path="password">Password:</label></td>
            <td><input path="password" name="password"/></td>
        <tr>
            <td>
                <button type="submit" value="login">Login</button>
            </td>
            <td><a href="/registration"> registration</a></td>
        </tr>
    </table>
</form>
</body>
</html>