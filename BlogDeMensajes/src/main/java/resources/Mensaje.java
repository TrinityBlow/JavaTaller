package resources;

public class Mensaje {

	private String nom;
	private String mensaje;
	
	public Mensaje(String nom, String mensaje) {
		super();
		this.nom = nom;
		this.mensaje = mensaje;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	
	
}
