<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">

<!-- Latest compiled JavaScript -->
<script src="bootstrap/js/bootstrap.min.js"></script>

</head>
<body>
<jsp:include page="menu.jsp" />

<% if( session.getAttribute("usuario") == null){ %>
	<br>
	<div class="container-fluid">
		<form action="ServletLogin" method="post">
		  <div class="form-group">
		    <label for="uname">Email address</label>
		    <input type="text" class="form-control" id="uname"  placeholder="Enter Username" name="uname" required>
		  </div>
		  <div class="form-group">
		    <label for="psw">Password</label>
		    <input type="password" class="form-control" id="psw" placeholder="Enter Password" name="psw" required>
		  </div>
		  <button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
<%}%>

</body>
</html>