package Proyecto;

import java.util.ArrayList;

public class Usuario {
	
	private String nombre;
	private double liquidez;
	private int edad;
	private ArrayList<Acciones> listaAcciones = new ArrayList<>();
	
	public Usuario(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

}
