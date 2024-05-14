package Vista;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;

public class _00_InicioAplicacion {

	private JFrame frame;
	private JLabel lblTitulo;
	private JLabel lblVersion;
	private JLabel lblTitulo2;
	private JLabel lblImagen;
	private JLabel lblNewLabel;

	public static void main(String[] args) {
		_00_InicioAplicacion window = new _00_InicioAplicacion();
		window.frame.setVisible(true);
	}

	public _00_InicioAplicacion() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 679, 467);
		frame.setUndecorated(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon icono = new ImageIcon(_00_InicioAplicacion.class.getResource("/Assets/logo2.png"));
		frame.setIconImage(icono.getImage());
		
		lblImagen = new JLabel("");
		lblImagen.setBounds(397, 99, 226, 211);
		ImageIcon icon = new ImageIcon(_00_InicioAplicacion.class.getResource("/Assets/logo2.png"));
		Image image = icon.getImage();
		Image scaledImage = image.getScaledInstance(566, 410, Image.SCALE_SMOOTH);
		icon = new ImageIcon(scaledImage);
		frame.getContentPane().setLayout(null);
		lblImagen.setIcon(new ImageIcon(_00_InicioAplicacion.class.getResource("/Assets/logo2.png")));
		frame.getContentPane().add(lblImagen);
		
		lblTitulo = new JLabel("Investing");
		lblTitulo.setBounds(50, 89, 297, 85);
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 70));
		lblTitulo.setForeground(new Color(255, 255, 255));
		frame.getContentPane().add(lblTitulo);
		
		lblTitulo2 = new JLabel("Simulator");
		lblTitulo2.setBounds(50, 168, 193, 57);
		lblTitulo2.setFont(new Font("Tahoma", Font.PLAIN, 42));
		lblTitulo2.setForeground(Color.WHITE);
		frame.getContentPane().add(lblTitulo2);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(10, 412, 659, 45);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		lblVersion = new JLabel("V 1.0");
		lblVersion.setBounds(50, 0, 44, 45);
		panel.add(lblVersion);
		lblVersion.setForeground(new Color(0, 0, 0));
		lblVersion.setFont(new Font("Tahoma", Font.PLAIN, 19));
		
		lblNewLabel = new JLabel("By Alejandro Soria and Pablo Alferez");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(381, 13, 274, 23);
		panel.add(lblNewLabel);
	}
}
