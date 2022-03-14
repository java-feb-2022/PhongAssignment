<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous"> 
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Ninja Dojo</title>
</head>
<body>

<h1> <c:out  value= "${dojo.id}" />  Location Ninjas</h1><p></p>
<a href="/">Home</a> ||
<a href="/newdojos">New Dojo</a> ||
<a href="/newninja">New Ninja</a><p></p>

<table class="table table-striped">
<thead>
	<tr>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Age</th>
		
	</tr>
</thead>
	<c:forEach items="${ninjaList}" var="ninjaInfo">
		<tr>
		<td>${ninjaInfo.firstName} </td>
		<td>${ninjaInfo.lastName} </td>
		<td>${ninjaInfo.age} </td>
		</tr>
	
	</c:forEach>
<tbody>
	
</tbody>

</table>


</body>
</html>