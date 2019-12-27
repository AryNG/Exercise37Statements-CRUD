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
<body>
	<h2>Read Individual</h2>
	<form action="readIndividualServlet" method="post" >
	<label for="txtIdProductC">Id Product: </label>
		<input class="form-control" type="text" aria-describedby="txtIdProductC" name="txtIdProductC" placeholder="id" required> 
		<small id="txtProductC" class="form-text text-muted">Type the id of the you want to know</small>
		<br>
		<input class="btn btn-success" type="submit" value="Consult">
	</form>


	<br>
	<a href="index.jsp"><input class="btn btn-info" type="button"  id="GoBack" value="Return"></a>
</body>
</html>