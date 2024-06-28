
package Controlador;

import Modelo.Modelo;
import Vista.Vista;
import Vista._00_InicioAplicacion;
import Vista._01_InicioSesion;
import Vista._02_Registro;
import Vista._03_TutorialAplicacion;

public class Main {

	public static void main(String[] args) {

		Modelo miModelo = new Modelo();
		Vista[] misVistas = new Vista[4];
		Controlador miControlador = new Controlador();

		misVistas[0] = new _00_InicioAplicacion();
		misVistas[1] = new _01_InicioSesion();
		misVistas[2] = new _02_Registro();
		misVistas[3] = new _03_TutorialAplicacion();

		miModelo.setVista(misVistas);
		miControlador.setVista(misVistas);
		miControlador.setModelo(miModelo);

		for (Vista vista : misVistas) {
			vista.setModelo(miModelo);
			vista.setControlador(miControlador);
		}

	}

}
