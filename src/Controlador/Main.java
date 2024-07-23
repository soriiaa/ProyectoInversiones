
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import Modelo.Modelo;
import Vista.Vista;
import Vista._00_InicioAplicacion;
import Vista._01_InicioSesion;
import Vista._02_Registro;
import Vista._03_TutorialAplicacion;
import Vista._04_MenuPrincipal;

public class Main {

	public static void main(String[] args) {

		Modelo miModelo = new Modelo();
		Vista[] misVistas = new Vista[5];
		Controlador miControlador = new Controlador();

		misVistas[0] = new _00_InicioAplicacion();
		misVistas[1] = new _01_InicioSesion();
		misVistas[2] = new _02_Registro();
		misVistas[3] = new _03_TutorialAplicacion();
		misVistas[4] = new _04_MenuPrincipal();

		miModelo.setVista(misVistas);
		miControlador.setVista(misVistas);
		miControlador.setModelo(miModelo);

		for (Vista vista : misVistas) {
			vista.setModelo(miModelo);
			vista.setControlador(miControlador);
		}
		
		Timer timer = new Timer(3000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	miControlador.cambiarVentana(0, 1);
            }
        });
		
        timer.setRepeats(false);
        timer.start();

	}

}
