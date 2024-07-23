package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Controlador;
import Modelo.Modelo;

public class _00_InicioAplicacion extends JFrame implements Vista {
	
	private Controlador miControlador;
	private Modelo miModelo;

	private JFrame frame;
	private JLabel lblTitulo;
	private JLabel lblVersion;
	private JLabel lblImagen;
	private JLabel lblTitulo2;
	private JPanel contentPane;

	@Override
	public void setModelo(Modelo miModelo) {
		this.miModelo = miModelo;
	}

	@Override
	public void setControlador(Controlador miControlador) {
		this.miControlador = miControlador;
	}
	
	public JFrame getFrame() {
		return frame;
	}

	public _00_InicioAplicacion() {            
        
        setTitle("Investing Simulator 1.0");
		setResizable(false);
		setBounds(100, 100, 680, 480);
		setUndecorated(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon icono = new ImageIcon(_00_InicioAplicacion.class.getResource("/Assets/logo2.png"));
        setIconImage(icono.getImage());
        
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 0, 0));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);  // Cambié esto para que el contentPane tenga un layout nulo
        setContentPane(contentPane);
        
        lblImagen = new JLabel("");
        lblImagen.setBounds(397, 99, 226, 211);
        ImageIcon icon = new ImageIcon(_00_InicioAplicacion.class.getResource("/Assets/logo2.png"));
        Image image = icon.getImage();
        Image scaledImage = image.getScaledInstance(226, 211, Image.SCALE_SMOOTH);
        icon = new ImageIcon(scaledImage);
        lblImagen.setIcon(icon);
        contentPane.add(lblImagen);

        lblTitulo = new JLabel("Investing");
        lblTitulo.setBounds(50, 89, 297, 85);
        lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 70));
        lblTitulo.setForeground(new Color(255, 255, 255));
        contentPane.add(lblTitulo);

        lblTitulo2 = new JLabel("Simulator");
        lblTitulo2.setBounds(50, 168, 193, 57);
        lblTitulo2.setFont(new Font("Tahoma", Font.PLAIN, 42));
        lblTitulo2.setForeground(Color.WHITE);
        contentPane.add(lblTitulo2);

        lblVersion = new JLabel("V 1.0");
        lblVersion.setBounds(22, 423, 44, 34);
        lblVersion.setForeground(new Color(255, 255, 255));
        lblVersion.setFont(new Font("Tahoma", Font.PLAIN, 19));
        contentPane.add(lblVersion);
        
        JPanel panel = new JPanel();
        panel.setBounds(91, 436, 589, 10);
        contentPane.add(panel);
        
        setVisible(true);
    }
}
