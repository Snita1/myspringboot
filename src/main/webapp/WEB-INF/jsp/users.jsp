<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%-- <%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
--%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Setup</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="page-header">
			<h1>Users</h1>
		</div>
		<div class="row">
			<div class="col-md-6">
				<div class="table-responsive">
					<table class="table">
						<thead>
							<tr>
								<th>Usersid</th>
								<th>Users Name</th>
								<th>Department</th>
								<th></th>
							</tr>
						</thead>



						<tbody>
							<c:forEach items="${Userslist}" var="current">
								<tr>
								<td></td>
									<td>${current.name}</td>
									<td>${current.dept}</td>
									<td>
										<button type="button" class="btn btn-primary">
											<span class="glyphicon glyphicon-edit"></span> Edit
										</button>
									</td>
									<td>
										<button type="button" class="btn btn-danger">
											<span class="glyphicon glyphicon-trash"></span>Delete
										</button>
									</td>
									<td>
										<button type="button" class="btn btn-primary">
											<span class="glyphicon glyphicon-plus"></span>Add
										</button>
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>

			<div class="col-sm-4"></div>
		</div>
	</div>
</body>
</html>