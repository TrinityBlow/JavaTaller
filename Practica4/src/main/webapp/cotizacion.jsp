<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ include file="encabezado.jsp"%>
<body>
<p> Marca:  ${answers.marca} </p>
<p> Modelo:  ${answers.modelo} </p>
<p> A�o del Vehiculo:  ${answers.a�oVehiculo} </p>
<p> Kilometros del Vehiculo:  ${answers.kmVehiculo} </p>
<p> Due�o:  ${answers.due�o} </p>
<p> Sexo:  ${answers.sexo} </p>
<p> Nacimiento:  ${answers.nacimiento} </p>
<p> E-Mail:  ${answers.email} </p>
<p> Telefono:  ${answers.telefono} </p>
<p> Covertura:  ${answers.covertura} </p>
</body>
</html>