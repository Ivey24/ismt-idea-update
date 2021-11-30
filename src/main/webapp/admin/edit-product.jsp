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
  <form action="/updateproduct" method="post">

    <div class="form-group">
      <label for="exampleFormControlInput1">ID</label>
      <input type="name" class="form-control" id="exampleFormControlInput1" name="id" value="${product.id}">
    </div>
    <div class="form-group">
      <label for="exampleFormControlInput1">Name</label>
      <input type="name" class="form-control" id="name" name="name" value="${product.name}">
    </div>
    <div class="form-group">
      <label for="exampleFormControlInput1">Descriptinon</label>
      <input type="name" class="form-control" id="description" name="description" placeholder="Name" value="${product.description}">
    </div>
    <div class="form-group">
      <label for="exampleFormControlInput1">Price</label>
      <input type="name" class="form-control" id="price" name="price" placeholder="Description" row="3" value="${product.price}">
    </div>
    <div class="form-group">
      <label for="exampleFormControlInput1">Category ID</label>
      <input type="name" class="form-control" id="categoryid" name="category_id" value="${product.categoryId}">
    </div>
    <input type="submit" class="btn btn-primary"/>
  </form>
</div>


</body>
</html>
