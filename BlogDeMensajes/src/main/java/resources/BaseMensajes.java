package resources;

import java.util.ArrayList;

public class BaseMensajes {

	private ArrayList<Mensaje> mensajes;

	public BaseMensajes() {
		mensajes = new ArrayList<Mensaje>();
	}
	
	public BaseMensajes(ArrayList<Mensaje> mensajes) {
		super();
		this.mensajes = mensajes;
	}

	public ArrayList<Mensaje> getMensajes() {
		return mensajes;
	}

	public void addMensaje(Mensaje mensaje) {
		mensajes.add(mensaje);
	}
	
}
