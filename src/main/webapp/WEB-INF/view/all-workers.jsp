<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: firso
  Date: 06.07.2022
  Time: 12:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<H2>All workers</H2>
<table>
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Department</th>
        <th>Salary</th>
        <th>Update</th>
        <th>Delete</th>
    </tr>
    <c:forEach var="worker" items="${workers}">

        <c:url var="updateButton" value="/update_worker">
            <c:param name="workerId" value="${worker.id}"/>
        </c:url>

        <c:url var = "deleteButton" value="/delete_worker">
            <c:param name="workerId" value="${worker.id}"/>
        </c:url>

        <tr>
            <td>${worker.name}</td>
            <td>${worker.surname}</td>
            <td>${worker.department}</td>
            <td>${worker.salary}</td>
            <td>
                <input type="button" value="Update" onclick="window.location.href = '${updateButton}'"/>
            </td>
            <td>
                <input type="button" value="Delete" onclick="window.location.href= '${deleteButton}'">
            </td>
        </tr>
    </c:forEach>
</table>

<input type="button" value="Добавить" onclick="window.location.href = 'add_worker'">
</body>
</html>
