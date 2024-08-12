package Vista;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import Controlador.Controlador;
import Modelo.Modelo;

public class _01_InicioSesion extends JFrame implements Vista {
	
	private Controlador miControlador;
	private Modelo miModelo;

	private JPanel contentPane;
	private JFrame frame;
	private JLabel lblTextoSuperior;
	private JLabel lblImagen;
	private JTextField txtUsuario;
	private JPasswordField txtContraseña;
	private JButton btnLogin;
	private JLabel lblOlvidoContraseña;
	private JLabel lblCrearCuenta;
	private JPanel lineaDivisoria;
	private JLabel lblInicioSesion;
	
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
		
		ImageIcon icono = new ImageIcon(_00_InicioAplicacion.class.getResource("/Assets/logo2.png"));
        setIconImage(icono.getImage());
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblInicioSesion = new JLabel("Inicia Sesión");
		lblInicioSesion.setFont(new Font("Microsoft Tai Le", Font.BOLD, 50));
		lblInicioSesion.setForeground(new Color(255, 255, 255));
		lblInicioSesion.setBounds(72, 37, 293, 92);
		contentPane.add(lblInicioSesion);
		
		lblInicioSesion.setFocusable(true);

		txtUsuario = new JTextField();
		txtUsuario.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
			}
		});

		txtUsuario.setBounds(123, 174, 193, 29);
		contentPane.add(txtUsuario);
		txtUsuario.setBackground(new Color(255, 255, 255));
		PlaceholderFocusListener focusListener = new PlaceholderFocusListener(txtUsuario, "Usuario");
		txtUsuario.addFocusListener(focusListener);
		txtUsuario.setText("Usuario");
		txtUsuario.addFocusListener(new PlaceholderFocusListener(txtUsuario, "Usuario"));
		txtUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtUsuario.setForeground(Color.GRAY);
		txtUsuario.setBorder(null);
		txtUsuario.setBorder(BorderFactory.createCompoundBorder(txtUsuario.getBorder(), BorderFactory.createEmptyBorder(0, 10, 0, 0)));
		txtUsuario.setColumns(10);

		txtUsuario.getDocument().addDocumentListener(new DocumentListener() {
			@Override
			public void insertUpdate(DocumentEvent e) {
				if ("Usuario".equals(txtUsuario.getText())) {
					txtUsuario.setForeground(Color.GRAY);
				} else {
					txtUsuario.setForeground(Color.BLACK);
				}
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				if (txtUsuario.getText().isEmpty()) {
					txtUsuario.setForeground(Color.GRAY);
				}
			}

			@Override
			public void changedUpdate(DocumentEvent e) {
			}
		});
		
		txtContraseña = new JPasswordField();
		txtContraseña.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtContraseña.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
			}
		});
		txtContraseña.setBounds(123, 228, 193, 29);
		contentPane.add(txtContraseña);
		txtContraseña.setBackground(new Color(255, 255, 255));
		focusListener = new PlaceholderFocusListener(txtContraseña, "Contraseña");
		txtContraseña.setText("Contraseña");
		txtContraseña.setEchoChar((char) 0);
		txtContraseña.addFocusListener(focusListener);
		txtContraseña.addFocusListener(new PlaceholderFocusListener(txtContraseña, "Contraseña"));
		txtContraseña.setForeground(Color.GRAY);
		txtContraseña.setBorder(null);
		txtContraseña.setBorder(BorderFactory.createCompoundBorder(txtContraseña.getBorder(), BorderFactory.createEmptyBorder(0, 10, 0, 0)));

		txtContraseña.getDocument().addDocumentListener(new DocumentListener() {
		    @Override
		    public void insertUpdate(DocumentEvent e) {
		        if ("Contraseña".equals(String.valueOf(txtContraseña.getPassword()))) {
		        	txtContraseña.setForeground(Color.GRAY);
		        } else {
		        	txtContraseña.setForeground(Color.BLACK);
		        }
		    }

		    @Override
		    public void removeUpdate(DocumentEvent e) {
		        if (String.valueOf(txtContraseña.getPassword()).isEmpty()) {
		        	txtContraseña.setForeground(Color.GRAY);
		        }
		    }

			@Override
			public void changedUpdate(DocumentEvent e) {
			}
		});
		
		btnLogin = new JButton("Login");
		
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLogin.setBounds(123, 303, 193, 36);
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBackground(new Color(0, 80, 244));
		btnLogin.setBorder(null);
		contentPane.add(btnLogin);
		
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnLogin.setBackground(new Color(40, 120, 244));
				btnLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			}
		});
		
		lblOlvidoContraseña = new JLabel("Olvidé mi contraseña");
		lblOlvidoContraseña.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblOlvidoContraseña.setForeground(new Color(255, 255, 255));
		lblOlvidoContraseña.setBounds(39, 455, 157, 20);
		contentPane.add(lblOlvidoContraseña);
		
		lblCrearCuenta = new JLabel("No tengo Cuenta");
		lblCrearCuenta.setForeground(Color.WHITE);
		lblCrearCuenta.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblCrearCuenta.setBounds(270, 455, 123, 20);
		contentPane.add(lblCrearCuenta);
		
		lineaDivisoria = new JPanel();
		lineaDivisoria.setBackground(new Color(255, 255, 255));
		lineaDivisoria.setBounds(229, 443, 2, 42);
		contentPane.add(lineaDivisoria);
		
		
		// LISTENERS
		
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblInicioSesion.requestFocusInWindow();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btnLogin.setBackground(new Color(0, 80, 244));
			}
		});
		
        
	}
	
	private static class PlaceholderFocusListener implements FocusListener {
		private final JTextField field;
		private final String placeholder;

		public PlaceholderFocusListener(JTextField field, String placeholder) {
			this.field = field;
			this.placeholder = placeholder;
		}

		@Override
		public void focusGained(FocusEvent e) {
			if (field.getText().equals(placeholder)) {
				field.setText("");
				if (field instanceof JPasswordField) {
					((JPasswordField) field).setEchoChar('*'); // Para ocultar los caracteres al escribir
				}
			}
		}

		@Override
		public void focusLost(FocusEvent e) {
			if (field.getText().isEmpty()) {
				field.setText(placeholder);
				if (field instanceof JPasswordField) {
					((JPasswordField) field).setEchoChar((char) 0); // Para que el texto sea visible
				}
			}
		}
	}
}
