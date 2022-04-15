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
<title>Book Detail</title>
</head>
<body>

	<div class="d-flex justify-content-between">
		<div class="welcome">

			<h2>
				Welcome,<span> <c:out value="${loggedInUser.name}" />!!!
				</span>

			</h2>

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

	<h2>Edit Review</h2>



	<p></p>
	<h4>Reviewed By: ${book.user.name}</h4>
	<p></p>
	<p></p>
	<h4>Book Title: ${book.booktitle}</h4>
	<p></p>
	<h4>Recommendation: ${book.recommend}</h4>
	<p></p>
	<h4>What's Great About It: ${book.whatsgreat}</h4>
	<p></p>
 


	<c:if test="${book.user.id==loggedInUser.id}">
		<a class="btn btn-primary" href="/books/${book.id}/edit">Edit</a>
	</c:if>
	<p></p>


	<img src="${book.imgurl}" alt="User did not provide book cover" />


 



</body>
</html>