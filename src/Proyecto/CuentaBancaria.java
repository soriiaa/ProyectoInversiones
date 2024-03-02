package Proyecto;

public class CuentaBancaria {
	
	private String nombre;
	private Usuario titular;
	private double saldo;
	private double interesAnual;
	private double inflacion;
	
	// Idea sobre el interés anual: Que cada día los tipos de interes del banco puedan variar
	// un 0,1 % arriba o abajo, sin bajar del 1 ni subir del 4 ya que no es común.
	// Que para cada día se ingrese en la cuenta la retribución correspondiente a un día
	// con el interés de ese mismo momento.
	
	// Idea #2: Introducir inflación para que el valor real de la moneda disminuya.
	// Hay que pensar un sistema para hacer que el valor nominal se mantenga igual pero
	// deberíamos introducir posibles compras que vayan aumentanto de precio real respecto 
	// al dinero dispoible para simular un efecto de pérdida del poder adquisitivo.
	// Esta parte va a requerir más tiempo, pero si la conseguimos implementar puede quedar
	// muy bien.
	
	// Para implementar la idea de comprar cosas podria hacerse una clase Tienda, en la que hayan
	// determinados objetos que vayan subiendo o bajando de precio, dependiendo si es un periodo
	// inflacionario o deflacionario.
	
	public CuentaBancaria(String nombre, Usuario titular, double saldo, double interesAnual) {
		this.nombre = nombre;
		this.titular = titular;
		this.saldo = saldo;
		this.interesAnual = interesAnual;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public double getInflacion() {
		return inflacion;
	}
	
	public double getInteresAnual() {
		return interesAnual;
	}

}
