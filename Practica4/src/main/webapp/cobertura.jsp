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

	<form action="ServletDatosCobertura" method="post">
 		<p>Tipo de Cobertura:</p>
		<select name="tipoCobertura">
			<option value="Tercero Completo"> Tercero Completo </option>
			<option value="Todo riesgo con franquicia"> Todo riesgo con franquicia </option>
			<option value="Todo riesgo total"> Todo riesgo total </option>
		</select><br><br>
		<input type="submit" value="Enter">
	</form>

</body>
</html>