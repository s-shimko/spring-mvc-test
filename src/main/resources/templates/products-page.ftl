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
        <#list products as product>
            <tr>
                <td>${product.toString()}</td>
            </tr>
        </#list>
    </table>
</div>
</body>
</html>