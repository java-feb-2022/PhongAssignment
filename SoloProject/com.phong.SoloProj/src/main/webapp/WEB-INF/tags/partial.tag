<%@ tag language="java" pageEncoding="UTF-8"%>
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

