package UT5_POOII.JerarquiaBasket;

import java.util.Scanner;

public class Basket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		pintaMenu();
		System.out.println("ELIGE UNA OPCIÓN");
		int x = teclado.nextInt();
		while (x != 0) {
			switch(x) {
			case 1:
				GestionEquipo.añadirJugador();
				
			case 4:
				GestionEquipo.mostrarIntegrantes();
			case 7: 
			    GestionEquipo.mostrarMasajistas();	
			case 8: 
			    GestionEquipo.mostrarMasajistaNombre();
			case 9: 
				GestionEquipo.masajistaMasajeId();
			case 10: 
			    GestionEquipo.masajistaMasajeNombre();
			default:	
				
			}	
			pintaMenu();
			System.out.println("ELIGE UNA OPCIÓN");
			x = teclado.nextInt();
		}
		
		
	}
	
	public static void pintaMenu() {
		System.out.println("MENU PARA LA GESTIÓN DEL EQUIPO");
		System.out.println("1.- AÑADIR JUGADOR");
		System.out.println("2.- AÑADIR ENTRENADOR");
		System.out.println("3.- AÑADIR MASAJISTA");
		System.out.println("4.- MOSTRAR INTEGRANTES");
		System.out.println("5.- MOSTRAR JUGADORES");
		System.out.println("6.- MOSTRAR ENTRENADORES");
		System.out.println("7.- MOSTRAR MASAJISTAS");
		System.out.println("8.- MOSTRAR MASAJISTAS POR NOMBRE");
		System.out.println("9.- MASAJISTA DA MASAJE (id)");
		System.out.println("10.- MASAJISTA DA MASAJE (nombre)");
		
		
	
	}

}
