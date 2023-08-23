<table>
    <tr>
        <th>Applicant Name</th>
        <th>Scores</th>
    </tr>
    <c:forEach var="applicant" items="${admittedApplicants}">
        <tr>
            <td>${applicant.name}</td>
            <td>${applicant.scores}</td>
        </tr>
    </c:forEach>
</table>
