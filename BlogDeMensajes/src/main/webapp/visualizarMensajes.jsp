<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<%@page import="resources.BaseMensajes" %>
<%@page import="java.util.ArrayList" %>
<%@page import="resources.Mensaje" %>
<%@page import="java.util.Iterator" %>

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
<jsp:include page="menu.jsp" />
<body>
	<% 
		BaseMensajes baseMensajes = (BaseMensajes) application.getAttribute("baseMensajes");
		ArrayList<Mensaje> mensajes = baseMensajes.getMensajes(); 
		Iterator<Mensaje> it = mensajes.iterator();  
		Mensaje mensaje ;
	%>
	<br>
	<div class="container-fluid">
		<table class="table">
  			<thead class="thead-dark">
				<tr>
					<th>Usuario</th>
					<th>Mensaje</th>
				</tr>
			</thead>
		
		<% while (it.hasNext()) {
				mensaje = it.next();%>
			<tr>
				<td><%= mensaje.getNom()%></td>
				<td style="word-wrap: break-word;min-width: 160px;max-width: 160px;"><%= mensaje.getMensaje()%></td>
			</tr>
		<% }%>
		</table>
	</div>
</body>
</html>