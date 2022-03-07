<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
	crossorigin="anonymous"></script>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<title>Read Share</title>
</head>
<body>



	<h1>Safe Travels</h1>



	<table class="table table-light">
		<thead>
			<tr>
				<th scope="col">Description</th>
				<th scope="col">Expense</th>
				<th scope="col">Vendor</th>
				<th scope="col">Amount ($ USD)</th>
				<th scope="col">Actions</th>
				<th scope="col"></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${expenses}" var="expense">
				<tr>
					<td>${expense.description}</td>
					<td><a href="/edit/${expense.id}">${expense.expenseName}</a></td>
					<td>${expense.vendor}</td>
					<td>${expense.amount}</td>					
					<td><a href="/edit/${expense.id}">Edit</a></td>
					<td><form:form action="/delete/${expense.id}" method="delete">
							<button style="">Delete</button>
						</form:form></td>

				</tr>

			</c:forEach>
			 
		</tbody>
	</table>
	
	<h1>Add an expense</h1>

	<form:form action="/expense" method="post" modelAttribute="expense">
		
	
		<p>

			<form:label path="expenseName">Expense Name</form:label>
			<form:errors class="text-danger" path="expenseName" />
			<form:input path="expenseName" />
		</p>
		<p>

			<form:label path="vendor">Vendor</form:label>
			<form:errors class="text-danger" path="vendor" />
			<form:input path="vendor" />
		</p>
		<p>
			<form:label path="amount">Amount</form:label>
			<form:errors class="text-danger" path="amount" />
			<form:textarea path="amount" />
		</p>
		<p>
			<form:label path="description">Description</form:label>
			<form:errors class="text-danger" path="description" />
			<form:input path="description" />
		</p>
		<button>Submit</button>
	</form:form>


</body>
</html>