package classResources;

import java.util.ArrayList;

public class Usuario {

	public String name;
	public String pass;
	protected ArrayList<String> operaciones;
	
	public Usuario(String name, String pass) {
		this.setName(name); 
		this.setPass(pass);
		this.operaciones = new ArrayList<String>();
		this.operaciones.add("Nada");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public ArrayList<String> getOperaciones(){
		return this.operaciones;
	}
	

	public String soyUn() {
		return "Usuario";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	public boolean equals(Usuario user) {
		if(user.getName().equals(this.getName()) && user.getPass().equals(this.getPass()) ) {
			return true;
		}
		return false;
	}

}
