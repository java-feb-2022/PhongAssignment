<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
	crossorigin="anonymous"></script>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration/Login Landing Page: Ideas</title>
</head>
<body>


	<div class="row"> 

		<div class="col">
			<h1>User Registration</h1>
			<form:form method="POST" action="/registerUser"
				modelAttribute="newlyCreatedUser">

				<div class="form-group">
					<form:label path="name">Name:</form:label>
					<form:errors class="text-danger" path="name" />
					<form:input class="form-control" path="name" />
					

				</div>
				<div class="form-group">
					<form:label path="email">Email:</form:label>
					<form:errors class="text-danger" path="email" />
					<form:input class="form-control" path="email" />
					
				</div>
				<div class="form-group">
					<form:label path="password">Password:</form:label>
					<form:errors class="text-danger" path="password" />
					<form:password class="form-control" path="password" />
					
				</div>
				<div class="form-group">
					<form:label path="confirm">Password Confirmation:</form:label>
					<form:errors class="text-danger" path="confirm" />
					<form:password class="form-control" path="confirm" />
					
				</div>
				<p></p>
				<button type="submit" class="btn btn-primary">Submit</button>

			</form:form>
		</div>
		<div class="col">
			<h1>User Login</h1>
			<form:form action="/login" modelAttribute="newActiveUser">
				<div class="form-group">
					<form:label for="email" path="email">Email:</form:label>
					<form:input type="text" class="form-control" path="email" />
					<form:errors class="text-danger" path="email" />
				</div>
				<div class="form-group">
					<form:label for="password" path="password">Password:</form:label>
					<form:password class="form-control" path="password" />
					<form:errors class="text-danger" path="password" />
				</div>
				
				<p></p>
				<button type="submit" class="btn btn-primary">Login</button>


			</form:form>
		</div>
		</div>
		
		
</body>
</html>