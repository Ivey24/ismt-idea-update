<%--
  Created by IntelliJ IDEA.
  User: prash
  Date: 11/5/2021
  Time: 10:20 AM
  To change this template use File | Settings | File Templates.
--%>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css">

<form action="/createcategory" method="post">
    <div class="form-group">
        <label for="exampleFormControlInput1">ID</label>
        <input type="name" class="form-control" id="exampleFormControlInput1" name="id">
    </div>
    <div class="form-group">
        <label for="exampleFormControlInput1">Name</label>
        <input type="name" class="form-control" id="name" name="name" placeholder="Name">
    </div>
 <div class="form-group">
        <label for="exampleFormControlInput1">Description</label>
        <input type="name" class="form-control" id="description" name="description" placeholder="Description" row="3">
    </div>
    <input type="submit" class="btn btn-primary"/>

</form>
