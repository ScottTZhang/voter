<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add a Section</title>
</head>
<body>
<h1>Add a section</h1>
<p>Here you can add a new section.</p>
<form:form method="POST" commandName="sec" action="${pageContext.request.contextPath}/section/add">
    <table>
        <tbody>
        <tr>
            <td>Name:</td>
            <td><form:input path="name"></form:input></td>
        </tr>
        <tr>
            <td>Description:</td>
            <td><form:input path="description"></form:input></td>
        </tr>
        <tr>
            <td><input value="Add" type="submit"></td>
            <td></td>
        </tr>
        </tbody>
    </table>
</form:form>

<p><a href="${pageContext.request.contextPath}/sections">Home page</a></p>
</body>
</html>
