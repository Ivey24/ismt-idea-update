<%--
  Created by IntelliJ IDEA.
  User: prash
  Date: 11/5/2021
  Time: 1:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>All Students</title>
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">

    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css">
</head>
<body>
<h1>All Users</h1>
<div style="float:right; margin-right:260px">

</div>

<table class="table">
    <thead>
    <tr>
        <th scope="col">ID</th>
        <th scope="col">Order Number</th>
        <th scope="col">Total</th>
        <th scope="col">Delivery Info</th>
    </tr>
    </thead>
    <tbody>


    <c:forEach var = "order" items="${orderList}">
        <tr>
            <td>${order.id}</td>
            <td>${order.ordername}</td>
            <td>${order.total}</td>
            <td>${order.dinfo}</td>

            <td>
                <a href="/vieworder?id=${order.id}">Details</a>
                <a href="/editorder?id=${order.id}">Edit</a>
                <a href="/deleteorder?id=${order.id}">Delete</a>

            </td>
        </tr>

    </c:forEach>


    </tbody>
</table>



</body>
</html>