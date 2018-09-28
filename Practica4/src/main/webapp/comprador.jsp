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

	<form action="ServletDatosComprador" method="post"> 
		<p>Dueño:</p>
		<input type="text" name="dueño" value="" required><br><br>
		<label for="bday">Escriba su Nacimiento:</label><br><br>
    		<input type="date" id="bday" name="bday" required><br><br>
   		
   		<p>Sexo</p>
   		<input type="radio" name="gender" value="male" checked> Male
		<input type="radio" name="gender" value="female"> Female
		<input type="radio" name="gender" value="other"> Other<br><br>
		
		<p>Telefono:</p>
		<input type="text" name="telefono" value=""><br>
		<p>E-Mail:</p>
		<input type="text" name="email" value=""><br><br>
		<input type="submit" value="Enter">
	</form>

</body>
</html>