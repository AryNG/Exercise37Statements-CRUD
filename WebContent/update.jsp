<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>CRUD with Ajax</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous"> 
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<h2>Update a new Employee</h2>
    <form action="updateServlet" method="post">
        <div class="form-row">
            <div class="form-group col-md-2">
                <label for="Id">Id</label>
                <input type="text" class="form-control" id="Id" name="txtIdEmployee" placeholder="Auto Generated" requeried>
            </div>
            <div class="form-group col-md-6">
                <label for="Name">Name</label>
                <input type="text" class="form-control" id="Name" name="txtNameEmployee" placeholder="Jonh Jhonson">
            </div>
            <div class="form-group col-md-4">
                <label for="Age">Age</label>
                <select id="Age" class="form-control" name="txtAgeEmployee">
                    <option selected>Choose...</option>
                    <option value="20">20</option>
                    <option value="40">40</option>
                    <option value="60">60</option>
                </select>
            </div>
        </div>

        <div class="form-group">
            <label for="Address">Address</label>
            <input type="text" class="form-control" id="Address" name="txtAddressEmployee" placeholder="1234 Main St">
        </div>

        <div class="form-row">
            <div class="form-group col-md-6">
                <label for="salary">Salary</label>
                <input type="text" class="form-control" id="salary" name="txtSalaryEmployee" placeholder="$0.0">
            </div>
            <div class="form-group col-md-6">
                <label for="Department">Department</label>
                <input type="text" class="form-control" id="Department" name="txtDepartmentEmployee" placeholder="Sales">
            </div>
        </div>

        <BR>
        <button type="submit" class="btn btn-success">Update Employee</button>
    </form>
    <br>
    <a class="btn btn-info" href="index.jsp">Return</a>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<script src="js/script.js"></script>
</body>
</html>