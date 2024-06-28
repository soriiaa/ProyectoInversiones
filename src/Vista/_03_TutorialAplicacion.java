package Vista;

import javax.swing.JFrame;

import Controlador.Controlador;
import Modelo.Modelo;

public class _03_TutorialAplicacion extends JFrame implements Vista {

	private Controlador miControlador;
	private Modelo miModelo;
	
	private JFrame frame;
	
	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}
	
	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}	
	
	public _03_TutorialAplicacion() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
