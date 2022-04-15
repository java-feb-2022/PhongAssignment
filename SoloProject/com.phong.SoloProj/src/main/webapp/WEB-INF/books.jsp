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
<title>Book List</title>
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

	<div id="carouselExampleCaptions" class="carousel slide"
		data-bs-ride="carousel">
		<div class="carousel-indicators">
			<button type="button" data-bs-target="#carouselExampleDark"
				data-bs-slide-to="0" class="active" aria-current="true"
				aria-label="Slide 1"></button>
			<button type="button" data-bs-target="#carouselExampleDark"
				data-bs-slide-to="1" aria-label="Slide 2"></button>
			<button type="button" data-bs-target="#carouselExampleDark"
				data-bs-slide-to="2" aria-label="Slide 3"></button>
		</div>
		<div class="carousel-inner">
			<div class="carousel-item active" data-bs-interval="3000">
				<img src="/img/SherlockHomes.jpeg" class="d-block w-100" alt="...">
				<div class="carousel-caption d-none d-md-block">
					<h5></h5>
					<p>Love the adventures and mysteries.</p>
				</div>
			</div>
			<div class="carousel-item" data-bs-interval="3000">
				<img src="/img/HuckFin3.jpeg" class="d-block w-100"
					alt="/com.phong.SoloProj/src/main/resources/static/img/SherlockHomes.jpeg">
				<div class="carousel-caption d-none d-md-block">
					<h5></h5>
					<p>The adventures of 2 best friends.</p>
				</div>
			</div>
			<div class="carousel-item">
				<img src="/img/ReadyPlayerOne3.jpeg" class="d-block w-100" alt="...">
				<div class="carousel-caption d-none d-md-block">
					<h5></h5>
					<p>Metaverse done right.</p>
				</div>
			</div>
		</div>
		<button class="carousel-control-prev" type="button"
			data-bs-target="#carouselExampleDark" data-bs-slide="prev">
			<span class="carousel-control-prev-icon" aria-hidden="true"></span> <span
				class="visually-hidden">Previous</span>
		</button>
		<button class="carousel-control-next" type="button"
			data-bs-target="#carouselExampleDark" data-bs-slide="next">
			<span class="carousel-control-next-icon" aria-hidden="true"></span> <span
				class="visually-hidden">Next</span>
		</button>
	</div>



	<div class="month">
		<h2>
			3 Most Raved Books in <span id="demo"> </span>
		</h2>



		<script>
			const months = [ "January", "February", "March", "April", "May",
					"June", "July", "August", "September", "October",
					"November", "December" ];

			const d = new Date();
			let month_year = months[d.getMonth()] + " " + [ d.getFullYear() ];
			document.getElementById("demo").innerHTML = month_year;
		</script>




	</div>


	<table class="table table-striped">
		<thead>
			<tr>
				<th scope="col">Book Title</th>
				<th scope="col">Recommend</th>
				<th scope="col">Reviewer</th>
				<th scope="col">What's Great About It?</th>
				<th scope="col">Book Cover Image</th>
				

			</tr>
		</thead>
		<tbody>
			<c:forEach items="${books}" var="book">

				<tr>
					<td class="linkcolor"><a href="/books/${book.id}">
							${book.booktitle}</a></td>
					<td>${book.recommend}</td>
					<td>${book.user.name}</td>
					<td>${book.whatsgreat}</td>
					<td> <img src="${book.imgurl}" alt="User did not provide book cover"/></td>


				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	
	 
<a class="btn btn-primary" href="/newBook" role="button">Review A Book</a>
 



</body>
</html>