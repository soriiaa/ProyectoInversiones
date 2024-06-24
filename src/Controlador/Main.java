
package Controlador;

import Modelo.Modelo;
import Vista.Vista;
import Vista._00_InicioAplicacion;

public class Main {

	public static void main(String[] args) {

		Modelo miModelo = new Modelo();
		Vista[] misVistas = new Vista[1];
		Controlador miControlador = new Controlador();

		misVistas[0] = new _00_InicioAplicacion();

		miModelo.setVista(misVistas);
		miControlador.setVista(misVistas);
		miControlador.setModelo(miModelo);

		for (Vista vista : misVistas) {
			vista.setModelo(miModelo);
			vista.setControlador(miControlador);
		}

		_00_InicioAplicacion frame = (_00_InicioAplicacion) misVistas[0];

		frame.setVisible(true);

	}

}
