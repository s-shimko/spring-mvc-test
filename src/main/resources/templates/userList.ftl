<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>UserList</title>
</head>
<body>
<h2>List of Users</h2>
<table>
    <thead>
    <th>Id</th>
    <th>Name</th>
    <th>Password</th>
    <th>Role</th>
    </thead>
    <#list users as user>
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.password}</td>
            <td>${user.role}</td>
        </tr>
    </#list>
</table>
</body>
</html>