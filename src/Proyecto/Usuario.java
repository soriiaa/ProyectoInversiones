package Proyecto;

import java.util.ArrayList;

public class Usuario {
	
	private String nombre;
	private String apellido;
	private double liquidez;
	private int edad;
	private String correoElectronico;
	private String contrasena;
	private double beneficio;
	private ArrayList<Acciones> listaAcciones = new ArrayList<>();
	
	public Usuario(String nombre, String apellido, int edad, String correoElectronico, String contrasena) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.correoElectronico = correoElectronico;
		this.contrasena = contrasena;
		this.liquidez = 0.0;
		this.beneficio = 0.0;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
		
	public String getCorreo() {
		return correoElectronico;
	}
	
	public String getContrasena() {
		return contrasena;
	}
	
	public double getLiquidez() {
		return liquidez;
	}
	
	public String getAccionesEnPosesion() {
		
		int numeroAcciones = listaAcciones.size();
		ArrayList<String> listaAccionesTemp = new ArrayList<>();
		
		Acciones nombre;
		String nombreAccion;
		
		for (int i = 0; i < numeroAcciones; i++) {
			nombre = listaAcciones.get(i);
			nombreAccion = nombre.getNombre();
			listaAccionesTemp.add(nombreAccion);
		}
		
		return listaAccionesTemp.toString();
	}
	
	public double getBeneficio() {
		return beneficio;
	}

}
