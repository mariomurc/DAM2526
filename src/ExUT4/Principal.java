package ExUT4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

    }


    public static void mostrarMenuPrincipal() {
        boolean salir = false;
        Scanner teclado = new Scanner(System.in);
        while (!salir) {
            System.out.println("\n==============================");
            System.out.println("        MENÚ PRINCIPAL        ");
            System.out.println("==============================");
            System.out.println("1) Registrar deportes");
            System.out.println("2) Registrar pruebas dentro de un deporte");
            System.out.println("3) Registrar atletas");
            System.out.println("4) Registrar medallas (oro, plata, bronce) para una prueba");
            System.out.println("5) Consultar el podio de una prueba");
            System.out.println("6) Otras operaciones");
            System.out.println("0) Salir");
            System.out.print("Elige una opción: ");

            int opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has elegido: Registrar deportes.");
                    // TODO: Implementar lógica para registrar deportes
                    break;
                case 2:
                    System.out.println("Has elegido: Registrar pruebas dentro de un deporte.");
                    // TODO: Implementar lógica para registrar pruebas por deporte
                    break;
                case 3:
                    System.out.println("Has elegido: Registrar atletas.");
                    // TODO: Implementar lógica para registrar atletas
                    break;
                case 4:
                    System.out.println("Has elegido: Registrar medallas (oro, plata, bronce) para una prueba.");
                    // TODO: Implementar lógica para asignar medallas a una prueba
                    break;
                case 5:
                    System.out.println("Has elegido: Consultar el podio de una prueba.");
                    // TODO: Implementar lógica para consultar podio
                    break;
                case 6:
                    //mostrarSubmenu(); // Llama al submenú "Otras operaciones"
                    break;
                case 0:
                    System.out.println("Saliendo... ¡Hasta pronto!");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    /**
     * Muestra un submenú con 6 opciones de placeholder "XXXX".
     * Permite volver al menú principal con 0.
     */
    public static void mostrarSubmenu(Scanner sc) {
        boolean volver = false;
        Scanner teclado = new Scanner(System.in);

        while (!volver) {
            System.out.println("\n------------------------------");
            System.out.println("      OTRAS OPERACIONES       ");
            System.out.println("------------------------------");
            System.out.println("1) CONTAR ATLETAS POR PAÍS");
            System.out.println("2) ELIMINAR ATLETA POR CÓDIGO");
            System.out.println("3) RENOMBRAR PRUEBA");
            System.out.println("4) QUITAR MEDALLA");
            System.out.println("5) ACTUALIZAR PAIS");
            System.out.println("0) Volver al menú principal");
            System.out.print("Elige una opción: ");

            int opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    System.out.println("Has elegido la opción 'XXXX " + opcion + "'.");
                    // TODO: Sustituir por la lógica real cuando la definas
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    volver = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }


}
