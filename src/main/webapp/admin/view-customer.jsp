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

    <h1>Customer Detail View</h1>

    <div class="alert alert-success" role="alert">
        ID : ${customer.id}
    </div>
    <div class="alert alert-success" role="alert">
        Name : ${customer.firstName}
    </div>
    <div class="alert alert-success" role="alert">
        Description : ${customer.lastName}
    </div>
    <div class="alert alert-success" role="alert">
        Description : ${customer.address}
    </div>
    <div class="alert alert-success" role="alert">
        Description : ${customer.email}
    </div>
    <div class="alert alert-success" role="alert">
        Description : ${customer.phone}
    </div>

</div>


</body>
</html>
