<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="css/style.css">

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Omikuji</title>
</head>
<body>
<h1>Omikuji Form</h1>
	<form action ="show" method="post">
	
	<!-- @RequestParam int number, @RequestParam String city, String name, String hobby, String livingThing, String saySomething, -->
		<p>
			Pick any number from 5 to 25: <input type="number" name="number" class ="form-control" required>
		</p>
		<p>
			Enter the name of any city: <input type="text" name="city"  class ="form-control" required>
		</p>
		<p>
			Enter the name of a real person: <input type="text" name="name"  class ="form-control" required>
		</p>
		<p>
			Enter professional endeavor or hobby: <input type="text" name="hobby"  class ="form-control" required>
		</p>
		<p>
			Enter any type of living thing: <input type="text" name="livingThing"  class ="form-control" required>
		</p>
		<p>
			Say something nice to someone: <input type="text" name="saySomething"  class ="form-control" required>
		</p>
		<p>
			Send and show a friend
		</p>
		 
		<p>
			<button>Send</button>
		</p> 
	</form>

</body>
</html>