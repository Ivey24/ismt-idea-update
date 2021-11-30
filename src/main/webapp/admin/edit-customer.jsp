<%--
  Created by IntelliJ IDEA.
  User: prash
  Date: 11/5/2021
  Time: 10:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>All Students</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
    <link rel="stylesheet"
          href="css/ismt.css">
</head>

<body>
<div class="container" >
    <form action="/updatecustomer" method="post">

        <div class="form-group">
            <label for="exampleFormControlInput1">ID</label>
            <input type="name" class="form-control" id="exampleFormControlInput1" name="id" value="${customer.id}">
        </div>
        <div class="form-group">
            <label for="exampleFormControlInput1">First Name</label>
            <input type="name" class="form-control" id="firstName" name="firstName" value="${customer.firstName}">
        </div>
        <div class="form-group">
            <label for="exampleFormControlInput1">Last Name</label>
            <input type="name" class="form-control" id="lastName" name="lastName" placeholder="Name" value="${customer.lastName}">
        </div>
        <div class="form-group">
            <label for="exampleFormControlInput1">Address</label>
            <input type="name" class="form-control" id="address" name="address" placeholder="Description" row="3" value="${customer.address}">
        </div>
        <div class="form-group">
            <label for="exampleFormControlInput1">Email</label>
            <input type="name" class="form-control" id="email" name="email" value="${customer.email}">
        </div>
        <div class="form-group">
            <label for="exampleFormControlInput1">Phone</label>
            <input type="name" class="form-control" id="phone" name="phone" value="${customer.phone}">
        </div>
        <input type="submit" class="btn btn-primary"/>
    </form>
</div>


</body>
</html>
