package Proyecto;

import java.util.LinkedList;
import java.util.TreeSet;

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
		
		// Array bidimensional en el que voy a guardar el dia en la primera posicion y el precio en la segunda. Ordenado por precio de mayor a menor.
		int arrayPreciosMayorMenorYDia [][] = new int[historialPrecios.size()][2];
		
		// Linkedlist auxiliar en la que voy a guardar todos los valores del historial de precios para poder ir eliminandolos.
		LinkedList<Double> historialPreciosAux = new LinkedList<>();
		// Creo otra lista solo para poder coger el día de cada precio.
		LinkedList<Double> historialPreciosAux2 = new LinkedList<>();
		
		// Añado al linkedList los precios con un for
		for (int i = 0; i < historialPrecios.size(); i++) {
			historialPreciosAux.add(historialPrecios.get(i));
		}
		
		for (int i = 0; i < historialPrecios.size(); i++) {
			historialPreciosAux2.add(historialPrecios.get(i));
		}
		
		// Variable precio máximo
		double precioMaxAux = Integer.MIN_VALUE;
		int dia = 0;
		int contador = 0;
		
		// Mientras que queden valores en la linkedList, se repite el bucle, para sacar todos los valores y ordenarlos.
		
		while (!historialPreciosAux.isEmpty()) {
			
			precioMaxAux = Integer.MIN_VALUE;
			dia = 0;
			// Recorro los valores con foreach
			for (double precio : historialPreciosAux) {
				
				// Si el precio es mayor que el precio maximo
				if (precio > precioMaxAux) {
					// Establezco ese precio como máximo y guardo la posición del valor, que es equivalente al dia.
					precioMaxAux = precio;
					dia = historialPreciosAux2.indexOf(precioMaxAux);
				}
			}
			
			// Guardo en la primera posición del array con contador, el cual pasa de posición según se avanza, el día
			arrayPreciosMayorMenorYDia[contador][0] = dia;
			// Y en la segunda el precio de ese día.
			double precioMaxAuxRedondeado = Math.round(precioMaxAux);
			int precioMaxAuxInt = (int) precioMaxAuxRedondeado;
			arrayPreciosMayorMenorYDia[contador][1] = precioMaxAuxInt;
			
			historialPreciosAux.removeFirstOccurrence(precioMaxAux);
			contador++;
			
		}
		
		
		// Hay que ordenar los precios que sean iguales por día de menor a mayor
		
		
		
		
		
		
		
		
		// Idea de ordenación de precios ----
		
		int[][] arrayPreciosMayorMenorYDia2 = new int[arrayPreciosMayorMenorYDia.length][2];
		
		for (int i = 0; i < arrayPreciosMayorMenorYDia.length; i++) {
			for (int j = 0; j < 2; j++) {
				arrayPreciosMayorMenorYDia2[i][j] = arrayPreciosMayorMenorYDia[i][j];
			}
		}
		
		int longitudArray = arrayPreciosMayorMenorYDia2.length;
		int contadorRepetidos = 0;
		boolean seRepite = true;
		
		for (int i = 0; i < longitudArray; i++) {
			
			if ((i + 1 < longitudArray) && (seRepite)) {
				if (arrayPreciosMayorMenorYDia2[i][1] == arrayPreciosMayorMenorYDia2[i + 1][1]) {
					contadorRepetidos++;
				} else {
					seRepite = false;
				}
			}
			
		}
		
		
		
		
		/*
		
		int precioMayorAux;
		precioMayorAux = arrayPreciosMayorMenorYDia2[0][1];
		TreeSet<Integer> diaPrecioOrdenado = new TreeSet<>();
		
		for (int i = 0; i < arrayPreciosMayorMenorYDia2.length; i++) {
			if (arrayPreciosMayorMenorYDia2[i][1] == precioMayorAux) {
				diaPrecioOrdenado.add(arrayPreciosMayorMenorYDia2[i][1]);
			}
		}
		
		*/
		
		// Idea de ordenación de precios ----
		
		
		
		for (int i = 0; i < arrayPreciosMayorMenorYDia.length; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(arrayPreciosMayorMenorYDia[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
		
		int contador2 = 0;
		
		for (int i = arrayPreciosMayorMenorYDia[0][1]; i > arrayPreciosMayorMenorYDia[arrayPreciosMayorMenorYDia.length - 1][1]; i--) {
			
			if (i == arrayPreciosMayorMenorYDia[contador2][1]) {
				
				for (int j = 0; j < arrayPreciosMayorMenorYDia[contador2][0]; j++) {
					System.out.print(" ");
				}
				
				if (i > arrayPreciosMayorMenorYDia[arrayPreciosMayorMenorYDia.length - 1][1]) {
					if (arrayPreciosMayorMenorYDia[contador2][0] == arrayPreciosMayorMenorYDia[contador2 + 1][0]) {
						System.out.print("*");
						contador2++;
					} else {
						System.out.println("*");
						contador2++;
					}
				} else {
					System.out.println("*");
					contador2++;
				}
				
			} else {
				System.out.println("");
			}
			
			
			
		}
		
	}
	
	// Imprimo la LinkedList que contiene todos los precios almacenados.
	
	public void mostrarHistorialPrecios() {
		System.out.println(historialPrecios.toString());
		
	}

}