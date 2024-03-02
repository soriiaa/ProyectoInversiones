package Proyecto;

import java.util.Random;

public class Utilidades {
	
	public static void anadirEspacio() {
		for (int i = 0; i < 50; i++) {
			System.out.println("");
		}
	}
	
	public static double generarInteresInicial() {
		Random random = new Random();
		double numeroAleatorio = random.nextDouble() * 5.0;
		return numeroAleatorio;
	}

}
