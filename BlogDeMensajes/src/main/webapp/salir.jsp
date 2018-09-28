<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<% if(session.getAttribute("usuario") != null){ %>
	<% session.setAttribute("usuario", null); %>
<%}%>
<jsp:include page="visualizarMensajes.jsp" />