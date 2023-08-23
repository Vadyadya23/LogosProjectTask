<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Registration Form</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <h2>Registration Form</h2>
    <form action="/register" method="post">
        <label for="firstName">First Name:</label>
        <input type="text" id="firstName" name="firstName"><br>
        <label for="lastName">Last Name:</label>
        <input type="text" id="lastName" name="lastName"><br>
        <label for="faculty">Faculty:</label>
        <input type="text" id="faculty" name="faculty"><br>
        <input type="submit" value="Register">
    </form>
</body>
</html>
