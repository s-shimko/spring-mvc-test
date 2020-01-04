<html>
<head>
    <title>Hello page</title>
</head>
<body>
<h1>Registration page</h1>
<form modelAttribute="registerUser" method="post" action="/registrationProcess">
    <table>
        <tr>
            <td><label path="name">Login:</label></td>
            <td><input path="name" name="name"/></td>
        </tr>
        <tr>
            <td><label path="password">Password:</label></td>
            <td><input path="password" name="password"/></td>
        <tr>
        <tr>
            <td><label path="role">Role:</label></td>
            <td>
                <select path="role" name="role">
                    <option value="admin">Admin</option>
                    <option value="user">User</option>
                    <option selected="guest" value="guest">Guest</option>
                </select>
            </td>
        <tr>
            <td>
                <button name="submit">Register</button>
            </td>
        </tr>
    </table>
</form>
<td><a href="/login">Back to Login page</a></td>
</body>
</html>