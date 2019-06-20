<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
	<form action="addUser" method="post">
		Name: <input type="text" name="name"></br>
		</br> Dept: <input type="text" name="dept"></br>
		</br> <input type="submit" value="ADD">
	</form>
	
	<form action="getUser">
	
		Id : <input type="text" name="id"></br>
		</br> <input type="submit" value="Find">
	</form>
	
	<form action="deleteUser">
	
		Id : <input type="text" name="id"></br>
		</br> <input type="submit" value="Delete">
	</form>
	
	<form action="fetchAllUser">
	
		</br> <input type="submit" value="Fetch All">
	</form>
	
	<form action="updateUser">
	
		Id : <input type="text" name="id"></br>
		</br> <input type="submit" value="Update">
	</form>
	

</body>
</html>