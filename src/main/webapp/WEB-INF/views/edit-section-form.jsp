<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edit a Section</title>
</head>
<body>
<h1>Edit a section</h1>
<p>Here you can edit a section.</p>
<form:form method="POST" commandName="sec" action="${pageContext.request.contextPath}/section/edit/${sec.id}">
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
            <td><input value="Save" type="submit"></td>
            <td></td>
        </tr>
        </tbody>
    </table>
</form:form>
