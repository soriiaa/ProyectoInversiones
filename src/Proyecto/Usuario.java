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
	private int dias;
	private ArrayList<Acciones> listaPropiedadAcciones;
	private ArrayList<Acciones> listaAccionesExistentes;

	public Usuario(String nombre, String apellido, int edad, String correoElectronico, String contrasena) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.correoElectronico = correoElectronico;
		this.contrasena = contrasena;
		this.liquidez = 0.0;
		this.beneficio = 0.0;
		this.listaPropiedadAcciones = new ArrayList<>();
		this.listaAccionesExistentes = new ArrayList<>();
	}

	public void mostrarNombreYPrecioAccionesExistentes() {

		int numeroAcciones = listaAccionesExistentes.size();
		Acciones accionProvisional;

		for (int i = 0; i < numeroAcciones; i++) {
			accionProvisional = listaAccionesExistentes.get(i);
			System.out.println("         ·Nombre: " + accionProvisional.getNombre() + ", Precio: " + accionProvisional.getPrecio() + "€.");
		}
	}

	public Acciones nombresAcciones(String nombreBuscado) {

		int numeroAcciones = listaAccionesExistentes.size();
		Acciones accionProvisional;
		ArrayList<String> listaNombresProvisional = new ArrayList<>();

		for (int i = 0; i < numeroAcciones; i++) {
			accionProvisional = listaAccionesExistentes.get(i);
			listaNombresProvisional.add(accionProvisional.getNombre());
		}

		if (listaNombresProvisional.contains(nombreBuscado)) {
			for (int i = 0; i < numeroAcciones; i++) {
				if (listaAccionesExistentes.get(i).getNombre().equals(nombreBuscado)) {
					return listaAccionesExistentes.get(i);
				}
			}
		}

		return null;
	}

	public String getAccionesEnPosesion() {

		int numeroAcciones = listaPropiedadAcciones.size();
		ArrayList<String> listaAccionesTemp = new ArrayList<>();

		Acciones nombre;
		String nombreAccion;

		for (int i = 0; i < numeroAcciones; i++) {
			nombre = listaPropiedadAcciones.get(i);
			nombreAccion = nombre.getNombre();
			listaAccionesTemp.add(nombreAccion);
		}

		return listaAccionesTemp.toString();
	}
	
	public void nombresAccionesMisAcciones() {

		int numeroAcciones = listaPropiedadAcciones.size();
		
		for (int i = 0; i < numeroAcciones; i++) {
			System.out.println("     ·Nombre: " + (listaPropiedadAcciones.get(i)).getNombre() + ", Precio: " + (listaPropiedadAcciones.get(i)).getPrecio());
		}
		
	}
	
	public void pasarDia() {
		this.dias = this.dias + 1;
	}

	public void comprarAccion(Acciones accion) {
		listaPropiedadAcciones.add(accion);
	}

	public void anadirAccionExistente(Acciones accion) {
		listaAccionesExistentes.add(accion);
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

	public double getBeneficio() {
		return beneficio;
	}
	
	public ArrayList<Acciones> getListadoAcciones() {
		return listaAccionesExistentes;
	}

}
