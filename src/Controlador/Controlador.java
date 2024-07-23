package Controlador;

import javax.swing.JFrame;

import Modelo.Modelo;
import Vista.Vista;

public class Controlador {
	
	private Modelo miModelo;
	private Vista[] misVistas;
	
	public Controlador() {
		super();
	}
	
	public void setVista(Vista[] misVistas) {
		this.misVistas = misVistas;
	}
	
	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}
	
	public void cambiarVentana(int desde, int hasta) {
		((JFrame) misVistas[desde]).setVisible(false);
		((JFrame) misVistas[hasta]).setVisible(true);
		
	}

}
