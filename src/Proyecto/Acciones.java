package Proyecto;

import java.util.LinkedList;

public class Acciones {
	
	// En principio la bolsa solo opera de lunes a viernes, por
	// lo que habría que idear algo para simular eso.
	
	private String nombre;
	private double precio;
	private int cantidad;
	private LinkedList<Double> historialPrecios = new LinkedList<>();
	
	public Acciones(String nombre) {
		this.nombre = nombre;
		this.precio = Utilidades.generarPrecioAleatorio();
		this.cantidad = 0;
		historialPrecios.add(this.precio);
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
	
	// Genero el siguiente precio de todas las acciones.
	
	public void generarNuevoPrecio() {
		
		double valorAnterior = historialPrecios.peekLast();
		double valorAnteriorAnterior = 0;
		double nuevoPrecio;
		
		if (historialPrecios.size() > 1) {
			valorAnteriorAnterior = historialPrecios.get(historialPrecios.size() - 2);
		}
		
		double variacionPrecio;		// Guardo en él el tanto porciento que varia el precio respecto a su precio anterior.
		
		if (historialPrecios.size() == 1) {
			variacionPrecio = Utilidades.generarPrecioAccionPrimerDia(valorAnterior);
		} else {
			variacionPrecio = Utilidades.generarPrecioAccionNuevoDia(valorAnterior, valorAnteriorAnterior);
		}
		
		nuevoPrecio = valorAnterior + ((valorAnterior * variacionPrecio) / 100);
		
		historialPrecios.add(nuevoPrecio);
		this.precio = nuevoPrecio;
		
	}
	
	public void generarGraficoPreciosAccion() {
		
	}
	
	// Imprimo la LinkedList que contiene todos los precios almacenados.
	
	public void mostrarHistorialPrecios() {
		System.out.println(historialPrecios.toString());
		
	}

}