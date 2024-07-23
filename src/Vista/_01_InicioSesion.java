package Vista;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Controlador;
import Modelo.Modelo;

public class _01_InicioSesion extends JFrame implements Vista {
	
	private Controlador miControlador;
	private Modelo miModelo;

	private JPanel contentPane;
	private JFrame frame;
	private JLabel lblTextoSuperior;
	private JLabel lblImagen;
	
	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}
	
	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}
	
	public _01_InicioSesion() {
		
		setTitle("Investing Simulator 1.0");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 453, 538);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
        
	}
}
