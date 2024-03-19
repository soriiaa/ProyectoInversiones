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
	
	// Imprime el el nombre y el precio de las acciones que existen y están guardadas en la lista de acciones existentes.

	public void mostrarNombreYPrecioAccionesExistentes() {

		int numeroAcciones = listaAccionesExistentes.size();
		Acciones accionProvisional;

		for (int i = 0; i < numeroAcciones; i++) {
			accionProvisional = listaAccionesExistentes.get(i);
			System.out.println("         ·Nombre: " + accionProvisional.getNombre() + ", Precio: " + accionProvisional.getPrecio() + "€.");
		}
	}
	
	// Retorna el objeto que tenga el nombre introducido por parámetro que se encuentre en la lista de acciones existentes.

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
	
	// Retorna el objeto que tenga el nombre buscado por parámetro de la lista de acciones en propiedad.
	
	public Acciones objetoAccionBuscadaEnPropiedad(String nombreBuscado) {

		int numeroAcciones = listaPropiedadAcciones.size();
		Acciones accionProvisional;
		ArrayList<String> listaNombresProvisional = new ArrayList<>();

		for (int i = 0; i < numeroAcciones; i++) {
			accionProvisional = listaPropiedadAcciones.get(i);
			listaNombresProvisional.add(accionProvisional.getNombre());
		}

		if (listaNombresProvisional.contains(nombreBuscado)) {
			for (int i = 0; i < numeroAcciones; i++) {
				if (listaPropiedadAcciones.get(i).getNombre().equals(nombreBuscado)) {
					return listaPropiedadAcciones.get(i);
				}
			}
		}
		
		return null;
	}
	
	// Retorna la lista de objetos de las acciones en propiedad.

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
	
	// Imprimo los nombres de las acciones que pertenecen al usuario.
	
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
