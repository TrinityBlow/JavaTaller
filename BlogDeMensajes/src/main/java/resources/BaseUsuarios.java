package resources;

import java.util.ArrayList;
import java.util.Iterator;

import beans.BeanMensajeUsuario;


public class BaseUsuarios {

	private ArrayList<Usuario> usuarios;
	
	public BaseUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	
	public BeanMensajeUsuario buscarUsuario(String nom, String pass){
		Iterator<Usuario> it = usuarios.iterator();
		Usuario user;
		while (it.hasNext()) {
			user = it.next();
			if(user.getNom().equals(nom) && user.getPass().equals(pass)) {
				BeanMensajeUsuario devolver = new BeanMensajeUsuario();
				devolver.setNombre(nom);
				return devolver;
			}
		}
		return null;
	}
	
}
