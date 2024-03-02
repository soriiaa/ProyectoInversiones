package Proyecto;

import java.util.ArrayList;

public class Usuario {
	
	private String nombre;
	private String apellido;
	private double liquidez;
	private int edad;
	private String correoElectronico;
	private String contrasena;
	private ArrayList<Acciones> listaAcciones = new ArrayList<>();
	
	public Usuario(String nombre, String apellido, int edad, String correoElectronico, String contrasena) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.correoElectronico = correoElectronico;
		this.contrasena = contrasena;
	}

}
