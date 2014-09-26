<%@ page language="java" contentType="text/html; charset=utf8"
         pageEncoding="utf8" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="<spring:url value='resources/css/bootstrap.css'/>">
    <title>MyGoals</title>
</head>
<body>
<nav class="navbar navbar-inverse" role="navigation">
</nav>
<div class="container">
    <div class="page-header">
        <h1>Create new goal</h1>
    </div>

    <div class="container">
        <div class="col-md-5">
            <div class="well">
                <form:form method="POST" modelAttribute="person">
            </div>
        </div>
    </div>

</body>
</html>
