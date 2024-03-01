package Proyecto;

public class CuentaBancaria {
	
	private String nombre;
	private Usuario titular;
	private double capital;
	private double interesAnual;
	
	// Idea sobre el interés anual: Que cada día los tipos de interes del banco puedan variar
	// un 0,1 % arriba o abajo, sin bajar del 1 ni subir del 4 ya que no es común.
	// Que para cada día se ingrese en la cuenta la retribución correspondiente a un día
	// con el interés de ese mismo momento.
	
	public CuentaBancaria(String nombre, Usuario titular, double capital, double interesAnual) {
		this.nombre = nombre;
		this.titular = titular;
		this.capital = capital;
		this.interesAnual = interesAnual;
	}

}
