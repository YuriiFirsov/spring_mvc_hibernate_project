<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: firso
  Date: 06.07.2022
  Time: 15:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Укажите данные работника</h3>

<form:form action="save_new_worker" modelAttribute="worker">

    <form:hidden path="id"/>

    Имя - <form:input path="name"/>
    <br>
    Фамилия - <form:input path="surname"/>
    <br>
    Департамент - <form:input path="department"/>
    <br>
    Зарплата - <form:input path="salary"/>
    <br>
    <br>
    <input type="submit" value="Добавить">

</form:form>


</body>
</html>
