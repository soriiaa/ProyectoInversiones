package Proyecto;

import java.util.Scanner;

public class Main {

	private static Scanner in = new Scanner(System.in);

	private static Usuario usuario;
	private static CuentaBancaria cuentaBancaria;

	public static void main(String[] args) {

		Utilidades.anadirEspacio();

		System.out.println("       ====================================");
		System.out.println("         Bienvenido al Simulador Bursátil");
		System.out.println("       ====================================");

		System.out.println("");
		System.out.println("");
		System.out.println("   Aquí podrá practicar sus mejores estrategias de");
		System.out.println("   inversión sin poner en riesgo su capital real");
		System.out.println("   y de manera completamente realista, para aprender");
		System.out.println("   lo máximo posible.");
		System.out.println("");
		System.out.println("   Comenzará usted con una cuenta de banco con 5000");
		System.out.println("   euros, la cual será remunerada a un interés que irá");
		System.out.println("   variando en el tiempo.");
		System.out.println("");
		System.out.println("   Además, habrá inflación, por lo que puede que pierdas");
		System.out.println("   poder adquisitivo si dejas tu dinero quieto mucho");
		System.out.println("   tiempo, ten cuidado.");
		System.out.println("");
		System.out.println("   Pásalo bien y aprende mucho.");
		System.out.println("");
		System.out.println("   ______________________________________________________");
		System.out.println("");
		System.out.println("   Pulsa Enter para continuar...");

		in.nextLine();

		interfazBienvenida();

	}

	public static void interfazBienvenida() {

		String nombre;
		String apellido;
		int edad = 0;
		String correo;
		String contrasena;
		String confirmarContrasena;
		boolean error;
		String modificar;

		do {

			error = false;

			Utilidades.anadirEspacio();

			System.out.println("          ______________");
			System.out.println("");
			System.out.println("            Comenzemos");
			System.out.println("          ______________");
			System.out.println("");
			System.out.println("");
			System.out.print("     Introduzca su nombre: ");
			nombre = in.nextLine();

			System.out.println("");
			System.out.print("     Introduzca su apellido: ");
			apellido = in.nextLine();

			System.out.println("");
			System.out.print("     Introduzca su edad: ");
			edad = in.nextInt();
			in.nextLine();

			System.out.println("");
			System.out.print("     Introduzca su correo electrónico, con él iniciará sesión: ");
			correo = in.nextLine();

			System.out.println("");
			System.out.print("     Introduzca su contraseña, no la olvide: ");
			contrasena = in.nextLine();

			System.out.println("");
			System.out.print("        Confirme su contraseña: ");
			confirmarContrasena = in.nextLine();

			Utilidades.anadirEspacio();

			if (edad < 18) {
				error = true;
				System.out.println("     " + nombre + ", sintiendolo mucho, solo pueden usar nuestros servicios");
				System.out.println("     los mayores de edad. Gracias por confiar en nosotros.");
				System.out.println("");
				System.out.println("     Pulse Enter para continuar...");
				in.nextLine();
			} else if (!contrasena.equals(confirmarContrasena)) {
				error = true;
				System.out.println("     Las contraseñas no coinciden, vuelva a introducir sus datos.");
				System.out.println("");
				System.out.println("     Pulse Enter para continuar...");
				in.nextLine();
			}

			if (error == false) {

				System.out.println("     ¿Desea modificar alguno de los datos?");
				System.out.println("");
				System.out.println("        Nombre: " + nombre);
				System.out.println("");
				System.out.println("        Apellido: " + apellido);
				System.out.println("");
				System.out.println("        Edad: " + edad);
				System.out.println("");
				System.out.println("        Correo: " + correo);
				System.out.println("");
				System.out.println("        Contrasena: " + contrasena);

				do {

					System.out.println("");
					System.out.print("     Modificar S/N: ");
					modificar = in.nextLine();

					if ((!modificar.equalsIgnoreCase("s")) && (!modificar.equalsIgnoreCase("n"))) {
						System.out.println("");
						System.out.println("     Opción inválida (S/N)");
					}

				} while ((!modificar.equalsIgnoreCase("s")) && (!modificar.equalsIgnoreCase("n")));

				if (modificar.equalsIgnoreCase("s")) {
					System.out.println("");
					System.out.println("        Vuelva a intoducir los datos deseados.");
					System.out.println("");
					System.out.println("     Pulse Enter para continuar...");
					in.nextLine();
					interfazBienvenida();
				} else if (modificar.equalsIgnoreCase("n")) {
					Utilidades.anadirEspacio();
					System.out.println("");
					System.out.println("     Acaba de crear su usuario en nuestro simulador.");
					System.out.println("");
					System.out.println("     Muchas gracias y bienvenido.");
					System.out.println("");
					System.out.println("     A partir de ahora use su correo electronico y su");
					System.out.println("     contraseña para iniciar sesión.");
					System.out.println("");
					System.out.println("     Pulse Enter para continuar...");
					in.nextLine();
					usuario = new Usuario(nombre, apellido, edad, correo, contrasena);
					iniciarSesion();
				}

			}

		} while (error == true);

	}

	public static void iniciarSesion() {

		String correo;
		String contrasena;

		do {

			Utilidades.anadirEspacio();

			System.out.println("     =====================================");
			System.out.println("       Bienvenido al Simulador de Bolsa.");
			System.out.println("     =====================================");
			System.out.println("");
			System.out.println("       Inicie sesión con sus credenciales por favor.");
			System.out.println("");
			System.out.print("       Correo Electrónico: ");
			correo = in.nextLine();
			System.out.println("");
			System.out.print("       Contraseña: ");
			contrasena = in.nextLine();

			if ((!correo.equals(usuario.getCorreo())) || (!contrasena.equals(usuario.getContrasena()))) {
				System.out.println("");
				System.out.println("     Correo Electrónico o Contraseña incorrectos, vuelva a introducir sus datos.");
				System.out.println("");
				System.out.println("     Pulse Enter para continuar...");
				in.nextLine();
			}

		} while ((!correo.equals(usuario.getCorreo())) || (!contrasena.equals(usuario.getContrasena())));

		Utilidades.anadirEspacio();

		System.out.println("     Inicio de sesión exitoso.");
		System.out.println("");
		System.out.println("     Pulse Enter para ir al menú...");
		in.nextLine();
		menuPrincipal();

	}

	public static void menuPrincipal() {

		String nombreCuentaBancaria;
		String decision;

		Utilidades.anadirEspacio();

		if (cuentaBancaria == null) {
			System.out.println("     Antes de comenzar, necesitará crear una cuenta bancaria.");
			System.out.println("");
			System.out.print("       Nombre de la cuenta: ");
			nombreCuentaBancaria = in.nextLine();

			cuentaBancaria = new CuentaBancaria(nombreCuentaBancaria, usuario, 5000.0, Utilidades.generarInteresInicial(), Utilidades.generarInflacionInicial());

			System.out.println("");
			System.out.println("     Cuenta generada con éxito.");
			System.out.println("");
			System.out.println("     Pulse Enter para continuar...");
			in.nextLine();

		}

		do {
			
			String cadenaTiposDeInteres = String.format("%.3f", cuentaBancaria.getInteresAnual());
			String cadenaInflacion = String.format("%.3f", cuentaBancaria.getInflacion());

			Utilidades.anadirEspacio();

			System.out.println("            ======================");
			System.out.println("               Página Principal");
			System.out.println("            ======================");
			System.out.println("");
			System.out.println("");
			System.out.println("     Bienvenido " + usuario.getNombre() + " " + usuario.getApellido());
			System.out.println("");
			System.out.println("");
			System.out.println("          Sus números");
			System.out.println("     _________________________________________");
			System.out.println("");
			System.out.println("          Saldo en cuenta bancaria: " + cuentaBancaria.getSaldo() + " €");
			System.out.println("");
			System.out.println("          Saldo líquido: " + usuario.getLiquidez() + " €");
			System.out.println("");
			System.out.println("          Acciones en posesión: " + usuario.getAccionesEnPosesion());
			System.out.println("");
			System.out.println("          Beneficio: " + usuario.getBeneficio() + " €");
			System.out.println("");
			System.out.println("");
			System.out.println("          Números Macroeconómicos");
			System.out.println("     _________________________________________");
			System.out.println("");
			System.out.println("          Inflación (% anual): " + cadenaInflacion + "%");
			System.out.println("");
			System.out.println("          Intereses de su cuenta (% anual): " + cadenaTiposDeInteres + "%");
			System.out.println("");
			System.out.println("");
			System.out.println("        Crear accion (N) | Invertir en accion (I) | Mis acciones (M) | Mi Banco (B) | Tienda (T) | Cerrar Sesión (C)");

			decision = in.nextLine();

			if ((!decision.equalsIgnoreCase("N")) && (!decision.equalsIgnoreCase("I")) && (!decision.equalsIgnoreCase("M")) && (!decision.equalsIgnoreCase("B")) && (!decision.equalsIgnoreCase("T")) && (!decision.equalsIgnoreCase("C"))) {
				System.out.println("");
				System.out.println("     Opción incorrecta (N/M/B/T/C)");
				System.out.println("");
				System.out.println("     Pulse Enter para continuar...");
				in.nextLine();
			}

		} while ((!decision.equalsIgnoreCase("N")) && (!decision.equalsIgnoreCase("I"))	&& (!decision.equalsIgnoreCase("M")) && (!decision.equalsIgnoreCase("B")) && (!decision.equalsIgnoreCase("T")) && (!decision.equalsIgnoreCase("C")));

		if (decision.equalsIgnoreCase("N")) {

			String nombreAccion;

			Utilidades.anadirEspacio();

			System.out.println("     =========================");
			System.out.println("        Creador de acciones");
			System.out.println("     =========================");
			System.out.println("");
			System.out.print("     ¿Como se llama la nueva acción?: ");
			nombreAccion = in.nextLine();

			Acciones accion = new Acciones(nombreAccion);
			usuario.anadirAccionExistente(accion);

			System.out.println("");
			System.out.println("        Acción creada con éxito.");
			System.out.println("");
			System.out.println("     Pulse Enter para volver al menú principal...");
			in.nextLine();

			menuPrincipal();

		} else if (decision.equalsIgnoreCase("I")) {

			String nombreAccionABuscar;
			String deseaComprar;

			Utilidades.anadirEspacio();

			System.out.println("     =========================");
			System.out.println("        Buscador de acciones");
			System.out.println("     =========================");
			System.out.println("");
			System.out.println("");
			System.out.println("      Listado de acciones:");
			System.out.println("");

			usuario.mostrarNombreYPrecioAccionesExistentes();

			System.out.println("");
			System.out.print("     ¿Como se llama la acción en la que desea invertir?: ");
			nombreAccionABuscar = in.nextLine();

			Acciones accionBuscada = usuario.nombresAcciones(nombreAccionABuscar);

			if (nombreAccionABuscar.equals(accionBuscada.getNombre())) {
				System.out.println("");
				System.out.println("         La acción ha sido encontrada con éxito.");
				System.out.println("");
				System.out.println("         Nombre: " + accionBuscada.getNombre() + ", precio: " + accionBuscada.getPrecio() + "€");

				do {

					System.out.println("");
					System.out.print("     ¿Desea comprar acciones de este valor?: S/N: ");
					deseaComprar = in.nextLine();

					if ((!deseaComprar.equalsIgnoreCase("S")) && (!deseaComprar.equalsIgnoreCase("N"))) {
						System.out.println("");
						System.out.println("     Debe introducir una S o una N, pulse Enter para continuar...");
						in.nextLine();
					}

				} while ((!deseaComprar.equalsIgnoreCase("S")) && (!deseaComprar.equalsIgnoreCase("N")));
				
				if (deseaComprar.equalsIgnoreCase("S")) {
					
					int numeroAcciones;
					String confirmacionCompra;
					
					Utilidades.anadirEspacio();
					
					System.out.println("      Proceso de compra...");
					System.out.println("     _______________________");
					System.out.println("");
					System.out.println("      Nombre: " + accionBuscada.getNombre() + ", precio: " + accionBuscada.getPrecio());
					System.out.println("");
					
					do {
						
					System.out.print("         ¿Cuantas acciones desea comprar?: ");
					numeroAcciones = in.nextInt();
					in.nextLine();
					
						if (numeroAcciones < 1) {
							System.out.println("");
							System.out.println("         No puedes comprar menos de una acción.");
							System.out.println("     Pulsa Enter para volver a introducir la cantidad...");
							in.nextLine();
						}
					
					} while (numeroAcciones < 1);
					
					double precioTotalDecimales = accionBuscada.getPrecioConDecimales() * numeroAcciones;
					String precioTotal = String.format("%.3f", precioTotalDecimales);
					
					System.out.println("");
					System.out.println("         Precio por acción: " + accionBuscada.getPrecio() + "€   Precio total: " + accionBuscada.getPrecio() + " x " + numeroAcciones + " = " + precioTotal + "€");
					System.out.println("");
					System.out.println("      Se realizará un pago de: " + precioTotal + "€ de la cuenta bancaria: " + cuentaBancaria.getNombre() + ", a nombre del titular: " + cuentaBancaria.getNombreTitular() + ", por un total de " + numeroAcciones + " acciones de " + accionBuscada.getNombre() + ".");
					System.out.println("");
					System.out.print("      Escriba 'CONFIRMO' para confirmar la compra: ");
					confirmacionCompra = in.nextLine();
					
					if (confirmacionCompra.equals("CONFIRMO")) {
						accionBuscada.setCantidad(numeroAcciones);
						cuentaBancaria.restarDinero(precioTotalDecimales);
						usuario.comprarAccion(accionBuscada);
						
						Utilidades.anadirEspacio();
						
						System.out.println("     Transferencia completada con éxito.");
						System.out.println("");
						System.out.println("     Compra completada con éxito.");
					} else if (!confirmacionCompra.equals("CONFIRMO")) {
						Utilidades.anadirEspacio();
						System.out.println("     Confirmación erronea. Operación cancelada.");
					}
				}

			}

			System.out.println("");
			System.out.println("     Pulse Enter para volver al menú principal...");
			in.nextLine();

			menuPrincipal();

		} else if (decision.equalsIgnoreCase("M")) {

		} else if (decision.equalsIgnoreCase("B")) {

		} else if (decision.equalsIgnoreCase("T")) {

		} else if (decision.equalsIgnoreCase("C")) {

		}

	}

}
