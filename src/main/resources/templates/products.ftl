<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Filtered Users</title>
</head>
<body>
<h2>List of Products</h2>
<table>
    <thead>
    <th>Name</th>
    <th>Price</th>
    </thead>
    <#list products as product>
        <tr>
            <td>${product.name}</td>
            <td>${product.price}</td>
        </tr>
    </#list>
</table>
</body>
</html>