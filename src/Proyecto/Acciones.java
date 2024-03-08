package Proyecto;

import java.util.ArrayDeque;
import java.util.Deque;

public class Acciones {
	
	// En principio la bolsa solo opera de lunes a viernes, por
	// lo que habría que idear algo para simular eso.
	
	private String nombre;
	private double precio;
	private int cantidad;
	private Deque<Double> historialPrecios = new ArrayDeque<>();
	
	public Acciones(String nombre) {
		this.nombre = nombre;
		this.precio = Utilidades.generarPrecioAleatorio();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getPrecio() {
		String precioAccion = String.format("%.3f", precio);
		return precioAccion;
	}
	
	public double getPrecioConDecimales() {
		return precio;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}