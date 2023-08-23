<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>All Applicants</title>
    <link rel="stylesheet" href="styles.css">
</head>
<body>
    <h2>All Applicants</h2>
    <table border="1">
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Faculty</th>
        </tr>
        <c:forEach var="applicant" items="${applicants}">
            <tr>
                <td>${applicant.firstName}</td>
                <td>${applicant.lastName}</td>
                <td>${applicant.faculty}</td>
            </tr>
        </c:forEach>
    </table>
    <a href="/register">Register another applicant</a>
</body>
</html>
