<%--
  Created by IntelliJ IDEA.
  spring.User: Samtrextom
  Date: 10/21/2019
  Time: 7:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>spring.User Form</title>
</head>
<body>
<h1>Make a Profile</h1>
<form:form modelAttribute="user" action="createProfile">
    First Name: <form:input path="firstName"/>
    <br/>
    Last Name: <form:input path="lastName"/>
    <br/>
    User Name: <form:input path="userName"/>
    <br/>
    Avatar(It would be cool if it was a "cat","deer","monkey" or "raccoon"):
    <form:input path="avatar"/>
    <br/>
    <input type="submit"/>
</form:form>
</body>
</html>
