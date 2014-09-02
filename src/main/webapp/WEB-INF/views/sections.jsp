<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Our Sections</title>
</head>
<body>
<h1>List of All Sections</h1>
<p>Here you can see the list of the teams, edit them, remove or update.</p>
<p>
${message}<br>
</p>
<table border="1px" cellpadding="0" cellspacing="0">
    <thead>
        <tr>
            <th width="10%">id</th>
            <th width="15%">name</th>
            <th width="10%">description</th>
            <th width="10%">actions</th>
        </tr>
    </thead>
    <tbody>
    <c:forEach var="section" items="${sections}">
    <tr>
        <td>${section.id}</td>
        <td>${section.name}</td>
        <td>${section.description}</td>
        <td>
            <a href="${pageContext.request.contextPath}/section/edit/${section.id}">Edit</a><br>
            <a href="${pageContext.request.contextPath}/section/delete/${section.id}">Delete</a><br>
        </td>
    </tr>
    </c:forEach>
    </tbody>
</table>
<p>
<a href = "${pageContext.request.contextPath}/section/add">add a section</a><br>
</p>
</body>
</html>
