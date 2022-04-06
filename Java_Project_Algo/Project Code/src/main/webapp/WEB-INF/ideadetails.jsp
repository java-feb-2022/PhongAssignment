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
<title>Idea Detail</title>
</head>
<body>

	
	
	<h2> Idea Description: ${idea.content} </h2>
	<p></p>
	<h2>Created by: ${idea.user.name}</h2>
	<p></p>
	
	<h2>User who liked your idea:</h2>

	<table class="table table-striped">
		<thead>
			<tr>
				<th scope="col">Liker Name</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${idea.likers}" var="list">
				<tr>
				<td> <p>${list.name}</p></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>


	<c:if test="${idea.user.id==loggedInUser.id}">

		<a class ="btn btn-primary" href="/ideas/${idea.id}/edit">Edit </a>

	

	</c:if>

<a href="/logout">Logout</a>

</body>
</html>