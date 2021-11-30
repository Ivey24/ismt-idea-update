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
<form action="/updateusers" method="post">

<div class="mb-3">
      <label for="id" class="form-label">ID</label>
      <input type="text" class="form-control" id="name" name="id" value="${user.id}">
    </div>
   <div class="mb-3">
      <label for="name" class="form-label">Name</label>
      <input type="text" class="form-control" id="name" name="name" value="${user.name}">
    </div>
  <div class="mb-3">
    <label for="exampleInputEmail1" class="form-label">Email address</label>
    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="email" value="${user.email}">
  </div>

  <div class="mb-3">
        <label for="phone" class="form-label">Phone</label>
        <input type="text" class="form-control" id="phone" name="phone" value="${user.phone}">
      </div>
   <div class="mb-3">
      <label for="username" class="form-label">Username</label>
      <input type="text" class="form-control" id="username" name="username" value="${user.username}">
    </div>
  <div class="mb-3">
    <label for="password" class="form-label">Password</label>
    <input type="password" class="form-control" id="password" name="password" value="${user.password}">
  </div>
   Is Active ?
  <div class="form-check">


    <input class="form-check-input" type="radio" name="isActive" id="flexRadioDefault1" value="true" ${user.active eq true ? 'checked=\"checked\"' :''} >


    <label class="form-check-label" for="flexRadioDefault1">
      Yes
    </label>
  </div>
  <div class="form-check">
     <input class="form-check-input" type="radio" name="isActive" id="flexRadioDefault1" value="false" ${user.active eq false ? 'checked=\"checked\"' :''} >
    <label class="form-check-label" for="flexRadioDefault2">
      No
    </label>
  </div>
  <br>
  <input type="submit" class="btn btn-primary"/>
</form>
</div>


</body>
</html>
