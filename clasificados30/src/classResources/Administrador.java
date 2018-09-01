package classResources;

public class Administrador extends Usuario {

	public Administrador(String name, String pass) {
		super(name, pass);
		super.operaciones.remove(0);
		super.operaciones.add("Listar Usuarios Publicadores");
		super.operaciones.add("ABM Administradores");
		super.operaciones.add("Ver Estadísticas");
	}
	
	public String soyUn() {
		return "Administrador";
	}

}
