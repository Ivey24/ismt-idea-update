<%--
  Created by IntelliJ IDEA.
  User: prash
  Date: 11/7/2021
  Time: 9:08 PM
  To change this template use File | Settings | File Templates.
--%>
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
<h1>All Customers</h1>
<div style="float:right; margin-right:260px">

</div>

<table class="table">
    <thead>
    <tr>
        <th scope="col">ID</th>
        <th scope="col">First Name</th>
        <th scope="col">Last Name</th>
        <th scope="col">Address</th>
        <th scope="col">Email</th>
        <th scope="col">Phone No</th>
    </tr>
    </thead>
    <tbody>


    <c:forEach var = "customer" items="${customerList}">
        <tr>
            <td>${customer.id}</td>
            <td>${customer.firstName}</td>
            <td>${customer.lastName}</td>
            <td>${customer.address}</td>
            <td>${customer.email}</td>
            <td>${customer.phone}</td>

            <td>
                <a href="/viewcustomer?id=${customer.id}">Details</a>
                <a href="/editcustomer?id=${customer.id}">Edit</a>
                <a href="/deletecustomer?id=${customer.id}">Delete</a>

            </td>
        </tr>

    </c:forEach>


    </tbody>
</table>



</body>
</html>