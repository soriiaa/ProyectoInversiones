package Proyecto;

import java.util.Random;

public class Utilidades {
	
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

}
