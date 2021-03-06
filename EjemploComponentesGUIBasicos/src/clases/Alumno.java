package clases;

import java.util.ArrayList;

public class Alumno {
	private String nombre;
	private String apellido;
	private int edad;
	private String genero;
	private Carrera carrera;
	private ArrayList<String> jornadas; //Matutina, Vespertina, Noctura

	public Alumno(String nombre, String apellido,
			int edad, String genero,
			Carrera carrera,ArrayList<String> jornadas) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.genero = genero;
		this.setCarrera(carrera);
		this.setJornadas(jornadas);
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
	
	

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", genero=" + genero
				+ ", carrera=" + carrera + ", jornadas=" + jornadas + "]";
	}

	public Carrera getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}

	public ArrayList<String> getJornadas() {
		return jornadas;
	}

	public void setJornadas(ArrayList<String> jornadas) {
		this.jornadas = jornadas;
	}

}
