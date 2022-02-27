<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Date</title>
</head>
<body>

<h1>Current Date is: </h1>
<h2> <c:out value= "${currentDate}"/></h2>

</body>

 <script type="text/javascript" src="js/datePopUp.js"></script>
</html>