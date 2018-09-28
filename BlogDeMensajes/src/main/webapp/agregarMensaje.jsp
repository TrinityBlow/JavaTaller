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

<% if(session.getAttribute("usuario") != null){ %>
	<br>
	<div class="container-fluid">
		<div class="form-group">
			<form action="ServletAddMensaje" method="post">
				<h3> <span class="label label-default">Nuevo Mensaje</span></h3>
				<h4> <span class="label label-default">Contenido:</span></h4>
				<textarea class="form-control" name="contenido" rows="10" cols="100" placeholder="Escribir mensaje"></textarea>
				<br>
				<button type="submit" class="btn btn-primary">Submit</button>
			</form>
		</div>
	</div>
<%} %>

</body>
</html>