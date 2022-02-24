<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<head>
<meta charset="UTF-8">
<title>Fruity Loops</title>
	
	<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	
	
</head>
<body>


<h1>Fruity Market !!!</h1>
	<div class="container"> 
	
	<table class="table">
  <thead>
    <tr>
      <th scope="col">Name</th>
      <th scope="col">Price</th>
      
    </tr>
  </thead>
  <tbody>
    <tr>
      <c:forEach var="eachfruit" items="${fruits}">
        
      <td>${eachfruit.name }</td>
      <td>${eachfruit.price}</td> 
    </tr>
    </c:forEach>
     
    
     
  </tbody>
</table>



	</div>



</body>
</head>
