<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="css/time.css
">
<title>Display Time  </title>
</head>
<body>

<h1>Current time is:  </h1>
<h2> <c:out value= "${currentTime}"/></h2>


</body>

 <script type="text/javascript" src="js/time.js"></script>
</html>