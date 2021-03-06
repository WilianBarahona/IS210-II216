package clases;

public abstract class Persona{
	protected String nombre;
	protected String apellido;
	protected int edad;
	protected String genero;
	protected String carrera;
	protected String centroRegional;
	protected String identidad;

	public Persona(String nombre, String apellido, int edad, String genero, String carrera, String centroRegional,
			String identidad){
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.genero = genero;
		this.carrera = carrera;
		this.centroRegional = centroRegional;
		this.identidad = identidad;
	}

	public Persona(){}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", genero=" + genero
				+ ", carrera=" + carrera + ", centroRegional=" + centroRegional + ", identidad=" + identidad + "]";
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getCarrera() {
		return carrera;
	}


	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}


	public String getCentroRegional() {
		return centroRegional;
	}


	public void setCentroRegional(String centroRegional) {
		this.centroRegional = centroRegional;
	}


	public String getIdentidad() {
		return identidad;
	}


	public void setIdentidad(String identidad) {
		this.identidad = identidad;
	}


	public void matricular(){
		System.out.println("Matriculando desde la clase persona");
	}

	public abstract void admision();
	public abstract void aprobar();
	public abstract void reprobar();
}
