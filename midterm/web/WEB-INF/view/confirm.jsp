<%--
  Created by IntelliJ IDEA.
  spring.User: Samtrextom
  Date: 10/21/2019
  Time: 7:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Confirmation Page</title>
</head>
<body>
    <h2>Profile Created</h2>
    <img src=${user.avatar}/>
    <br>
    Thank You ${user.firstName} ${user.lastName}
    <br>
    Your User Name is: ${user.userName}
</body>
</html>
