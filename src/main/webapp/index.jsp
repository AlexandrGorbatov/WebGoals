<%@ page language="java" contentType="text/html; charset=utf8"
         pageEncoding="utf8" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
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
<div class="container-fluid">
    <div class="row">
        <div class="col-xs-12 col-md-2">
            <div class="list-group">
                <a href="#" class="list-group-item disabled">
                    Cras justo odio
                </a>
                <a href="#" class="list-group-item">Dapibus ac facilisis in</a>
                <a href="#" class="list-group-item">Morbi leo risus</a>
                <a href="#" class="list-group-item">Porta ac consectetur ac</a>
                <a href="#" class="list-group-item">Vestibulum at eros</a>
            </div>
        </div>
        <div class="col-xs-6 col-md-10">

            <table class="table table-hover">
                <thead>
                <tr class="info">
                    <th> Name</th>
                    <th> Description</th>
                    <th> Price</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="product" items="${products}">
                    <tr class="warning">
                        <td><c:out value="${product.name}"/></td>
                        <td><c:out value="${product.description}"/></td>
                        <td><c:out value="${product.price}"/></td>
                        <td><a href="/user/product/addToCart?id=${product.id}" class="btn btn-success">Add to cart</a></td>
                    </tr>
                </c:forEach>
                <tr>
                    <td><p class="lead">Number of products: <c:out value="${quantity}"/></p></td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>


</div>
</body>
</html>
