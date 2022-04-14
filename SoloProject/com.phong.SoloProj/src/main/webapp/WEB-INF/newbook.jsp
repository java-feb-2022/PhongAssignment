<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
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
<link rel="stylesheet" type="text/css" href="/css/style.css">
<title>Add a Book </title>
</head>
<body>
<div class="d-flex justify-content-between">
	<div class="welcome">
	
	<h3>
		Welcome,<span> <c:out value="${loggedInUser.name}"/>!!! </span>
		
	</h3>
	
	</div>
	<div class="navbar">
		<nav class="nav nav-pills justify-content-end">
			<a class="nav-link active" aria-current="page" href="/books">Home</a>
			<a class="nav-link" href="/newBook">Review A Book</a> <a
				class="nav-link" href="/logout">Logout</a>

		</nav>
	</div>
	</div>

	<div class="title">
		<h1>Junior Book Club</h1>
	</div>


	<h2>Review A Book </h2>
	<form:form method="POST" action="/books/new" modelAttribute="newBook">

		<div class="form-group">
			<form:label path="booktitle">Book Title:</form:label>
			<form:errors class="text-danger" path="booktitle" />
			<form:input class="form-control" path="booktitle" />

			<form:label path="Recommend">Do you recommend? Yes/No:</form:label>
			<form:errors class="text-danger" path="Recommend" />
			<form:input class="form-control" path="Recommend" />
 
			
			<form:label path="whatsgreat">What's Great About It:</form:label>
			<form:errors class="text-danger" path="whatsgreat" />
			<form:input class="form-control" path="whatsgreat" />



		</div>
		<form:input type="hidden" value="${loggedInUser.id}" path="user" />
		<p></p>
		<button type="submit" class="btn btn-primary">Submit</button>

	</form:form>
	<p> <a class="btn btn-primary" href="/books">Cancel </a></p>


<div class="card" style="width: 100%;">
 <img src="/img/Bookreview.jpeg" class="card-img-top" alt="...">
  <div class="card-body">
    <p class="card-text">Time To Review </p>
  </div>
</div>


</body>
</html>