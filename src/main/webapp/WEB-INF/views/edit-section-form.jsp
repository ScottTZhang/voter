<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">
<title>Edit a Section</title>
<!-- Bootstrap core CSS -->
<link href="/static/css/bootstrap.min.css" rel="stylesheet">
<!-- Custom styles for this template -->
<link href="starter-template.css" rel="stylesheet">
</head>

<body>
<div class="container">
    <div class="rows">
        <h1>Edit a section</h1>
        <p>Here you can edit a section.</p>
        <form:form method="POST" commandName="sec" action="${pageContext.request.contextPath}/section/edit/${sec.id}" class="form-horizontal" role="form">

            <div class="form-group form-group-lg">
                <label for="forName" class="col-sm-2 control-label">Name</label>
                <div class="col-sm-10">
                    <form:input path="name" class="form-control input-lg" type="text" id="forName" placeholder="create a name here"></form:input>
                </div>
            </div>
            <div class="form-group">
                <label for="forDescription" class="col-sm-2 control-label">Description</label>
                <div class="col-sm-10">
                    <form:textarea path="description" class="form-control" placeholder="put some description" id="forDescription" rows="3"/>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-default">Save</button>
                    </div>
                </div>
            </form:form>
        </div>
    </div>
    </body>
    </html>
