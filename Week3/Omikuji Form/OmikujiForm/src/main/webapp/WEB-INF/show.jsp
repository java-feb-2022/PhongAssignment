<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" type="text/css" href="css/style.css">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show</title>
</head>
<body>

<!-- @RequestParam int number, @RequestParam String city, String name, String hobby, String livingThing, String saySomething, -->

<h1>Here's Your Omikuji!</h1>

<%-- In <c:out value="${number}"/> years --%>
<div class= "textBox">
In <c:out value="${number}"/> years, you will live in <c:out value="${city}"/> with <c:out value="${name}"/> as your roommate, <c:out value="${hobby}"/> for a living. The next time you see a <c:out value="${livingThing}"/>, you will have good luck.  Also, <c:out value="${saySomething}"/>
</div>





</body>
</html>