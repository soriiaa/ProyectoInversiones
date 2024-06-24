package Modelo;

import Controlador.Controlador;
import Vista.Vista;

public class Modelo {
	
	private Vista[] misVistas;
	private Controlador miControlador;
	
	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}
	
	public void setVista(Vista[] misVistas) {
		this.misVistas = misVistas;
	}
	
}
