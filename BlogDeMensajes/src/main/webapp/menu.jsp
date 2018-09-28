<nav class="navbar navbar-dark bg-dark">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand active" href="visualizarMensajes.jsp">Visualizar Mensajes</a>
    </div>
  	<% if(session.getAttribute("usuario") != null){ %>
    <ul class="nav navbar-nav navbar-left">
      <li><a href="agregarMensaje.jsp"><button class="btn navbar-btn">Enviar Mensaje</button></a></li>
    </ul>
  	<%} %>
    <ul class="nav navbar-nav navbar-right">
  	<% if(session.getAttribute("usuario") != null){ %>
      <li><a href="salir.jsp"><button class="btn navbar-btn">Logout</button></a></li>
  	<%}else{ %>
      <li><a href="login.jsp"><button class="btn navbar-btn">Login</button></a></li>
  	<%} %>
    </ul>
  </div>
</nav>
