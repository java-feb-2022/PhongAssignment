<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core"%> <%@ taglib prefix="form"
uri="http://www.springframework.org/tags/form"%>
<link
  href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css"
  rel="stylesheet"
  integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x"
  crossorigin="anonymous"
/>
<script
  src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
  integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
  crossorigin="anonymous"
></script>

<link
  href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
  rel="stylesheet"
  integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
  crossorigin="anonymous"
/>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Enter your new Idea below</title>
  </head>
  <body>
    <h1>Create a New TV Show</h1>
    <form:form method="POST" action="/shows/new" modelAttribute="newShow">
      <div class="form-group">
        <form:label path="content">Content:</form:label>
        <form:errors class="text-danger" path="content" />
        <form:input class="form-control" path="content" />
      </div>
      <form:input type="hidden" value="${loggedInUser.id}" path="user" />
      <p></p>
      <button type="submit" class="btn btn-primary">Create</button>
    </form:form>

    <a href="/logout">Logout</a>
  </body>
</html>
