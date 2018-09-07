package classResources;

public class Publicador extends Usuario {
	
	public Publicador(String name, String pass) {
		super(name, pass);
		super.operaciones.remove(0);
		super.operaciones.add("Actualizar Datos de Contacto");
		super.operaciones.add("ABM de Publicaciones");
		super.operaciones.add("Contestar Consultas");
	}

	public String soyUn() {
		return "Publicador";
	}
}
