package beans;

public class Cotizacion implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String marca;
	private String modelo;
	private int añoVehiculo;
	private int kmVehiculo;
	private String dueño;
	private String sexo;
	private String nacimiento;
	private String email;
	private String telefono;
	private String covertura;
	private int cotizacionNro;
	
	public Cotizacion() {
		
	}
	
	public int calcularCotizacion() {
		return 0;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAñoVehiculo() {
		return añoVehiculo;
	}

	public void setAñoVehiculo(int añoVehiculo) {
		this.añoVehiculo = añoVehiculo;
	}

	public int getKmVehiculo() {
		return kmVehiculo;
	}

	public void setKmVehiculo(int kmVehiculo) {
		this.kmVehiculo = kmVehiculo;
	}

	public String getDueño() {
		return dueño;
	}

	public void setDueño(String dueño) {
		this.dueño = dueño;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(String nacimiento) {
		this.nacimiento = nacimiento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCovertura() {
		return covertura;
	}

	public void setCovertura(String covertura) {
		this.covertura = covertura;
	}
	
	
	
}
