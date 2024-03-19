package Proyecto;

import java.util.Random;

public class Utilidades extends Main{
	
	public static void anadirEspacio() {
		for (int i = 0; i < 50; i++) {
			System.out.println("");
		}
	}
	
	// Genero la inflación inicial con un 5% máximo
	
	public static double generarInflacionInicial() {
		Random random = new Random();
		double numeroAleatorio = random.nextDouble() * 5.0;
		return numeroAleatorio;
	}
	
	// Genero el interés inicial con un 5% máximo
	
	public static double generarInteresInicial() {
		Random random = new Random();
		double numeroAleatorio = random.nextDouble() * 5.0;
		return numeroAleatorio;
	}
	
	// Genero el precio aleatorio inicial de la acción
	
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
		
		double nuevoValor;
		double aleatorio = random.nextDouble();
		
		if (aleatorio > 0.5) {
			nuevoValor = random.nextDouble() * 2;
		} else {
			nuevoValor = random.nextDouble() * (-2);
		}
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
