package Proyecto;

import java.util.ArrayDeque;
import java.util.Deque;

public class Acciones {
	
	private String nombre;
	private double precio;
	private Deque<Double> historialPrecios = new ArrayDeque<>();
	
	public Acciones(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}

}
