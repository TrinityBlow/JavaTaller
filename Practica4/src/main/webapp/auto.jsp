<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ include file="encabezado.jsp"%>
<body>

	<form action="ServletDatosAuto" method="post"> 
		<p>Marca:</p>
		<input type="text" name="marca" value=""><br>
		<p>Modelo:</p>
		<input type="text" name="modelo" value=""><br>
		<p>Año del Vehiculo:</p>
		<select name="añoVehiculo">
			<% int x;
			for(x = 0; x <= 26; x++){ %>
				<option value="<%= 1990 + x%>"><%= 1990 + x%></option>
			<%}%>
		</select>
 		<p>Km/Año:</p>
 		
		<select name="kmVehiculo">
			<%for(x = 0; x < 20; x++){ %>
				<option value="<%= 5000 * x%>"><%= 5000 * x%></option>
			<%}%>
		</select><br><br>
		<input type="submit" value="Enter">
	</form>
</body>
</html>