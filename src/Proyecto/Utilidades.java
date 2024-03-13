package Proyecto;

import java.util.Random;

public class Utilidades extends Main{
	
	public static void anadirEspacio() {
		for (int i = 0; i < 50; i++) {
			System.out.println("");
		}
	}
	
	public static double generarInflacionInicial() {
		Random random = new Random();
		double numeroAleatorio = random.nextDouble() * 5.0;
		return numeroAleatorio;
	}
	
	public static double generarInteresInicial() {
		Random random = new Random();
		double numeroAleatorio = random.nextDouble() * 5.0;
		return numeroAleatorio;
	}
	
	public static double generarPrecioAleatorio() {
		Random random = new Random();
		double precio = 30 + (150 - 30) * random.nextDouble();
		return precio;
	}
	
	public static void pasarDia() {
		usuario.pasarDia();
	}
	
	public static double generarPrecioAccionPrimerDia(double valorAnterior) {
		
		Random random = new Random();
		
		double valorAnteriorAux = valorAnterior * 0.02;
		double cambio = (2 * random.nextDouble() - 1) * valorAnteriorAux;
		double nuevoValor = valorAnterior + cambio;
		
		return nuevoValor;
	}
	
	public static double generarPrecioAccionNuevoDia(double valorAnterior, double valorAnteriorAnterior) {
		
		Random random = new Random();
		
		double porcentajeVariado;
		
		if ((valorAnteriorAnterior - valorAnterior) < 0) {
			
			double aleatorio = random.nextDouble();
			
			if (aleatorio < 0.67) {
				porcentajeVariado = random.nextDouble() * 4;
			} else {
				porcentajeVariado = random.nextDouble() * (-4);
			}
			
		} else if ((valorAnteriorAnterior - valorAnterior) > 0) {
			
			double aleatorio = random.nextDouble();
			
			if (aleatorio < 0.67) {
				porcentajeVariado = random.nextDouble() * (-4);
			} else {
				porcentajeVariado = random.nextDouble() * 4;
			}
		} else {
			porcentajeVariado = random.nextDouble();
		}
		
		return porcentajeVariado;
	}

}
