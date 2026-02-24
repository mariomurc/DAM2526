package UT4_POOI.MiExamen;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Utils {
    public static String deportes[] =
            {"Ski de fondo", "Luge", "Snowboard", "Descenso",
                    "Bobsleigh", "Curling", "Skeleton", "Salto"};
    public static String pruebas[] =
            {"Slalom", "Velocidad", "Sprint", "Half-Pipe",
                    "Trampolín"};

    public static String atletas[] =
            {"Smith, John","Garcia, María",
                    "Chen, Wei","Schmidt, Anna",
                    "Dubois, Pierre", "Rossi, Luca",
                    "Khan, Aisha", "Santos, João",
                    "Kuznetsov, Ivan", "Tanaka, Yuki",
                    "O'Connor, Liam", "Hernandez, Sofia",
                    "Jung, Minseo", "Petrovic, Elena",
                    "Okafor, Chinedu" };
    public static String siglas[] = {
            "US", "ES", "FR", "DE", "IT",
            "GB", "PT", "MX", "CA",
            "CL", "CN", "JP", "AU", "NZ",
            "NO", "FI", "DK", "NL",
    };
    public static String tiposMedalla[] = {
            "ORO", "PLATA", "BRONCE",
    };

    public static String generarStringAleatorio(){
        Random r = new Random();
        int numero = r.nextInt(1,1000);
        String numeroCadena = String.valueOf(numero);
        return numeroCadena;
    }
    public static int generarIntAleatorio(){
        Random r = new Random();
        int numero = r.nextInt(1,2000);
        int numeroCadena = (numero);
        return numeroCadena;

    }

    public static void mostrarMenuPrincipal() {
        Random r = new Random();
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
            int i=0;
            boolean hueco=false;
            switch (opcion) {
                case 1:
                    System.out.println("Has elegido: Registrar deportes.");
                    String dep = Utils.deportes[r.nextInt(7)+1] + Utils.generarStringAleatorio();
                    GestionJJOO.registrarDeporte(dep);
                    break;
                case 2:
                    System.out.println("Has elegido: Registrar pruebas dentro de un deporte.");
                    String nuevaPrueba = Utils.pruebas[r.nextInt(4)+1] + generarStringAleatorio();
                    teclado.nextLine();
                    System.out.println("¿EN QUE DEPORTE QUIERES AÑADIR UNA PRUEBA?");
                    String deporte = teclado.nextLine();
                    GestionJJOO.registrarPruebaEnDeporte(deporte,nuevaPrueba);
                    break;
                case 3:
                    System.out.println("Has elegido: Registrar atletas.");
                    GestionJJOO.registrarAtleta(Utils.atletas[r.nextInt(14)+1] + generarStringAleatorio(),r.nextInt(1000)+1,siglas[r.nextInt(17)+1]);
                    break;
                case 4:
                    System.out.println("Has elegido: Registrar medallas (oro, plata, bronce) para una prueba.");
                    break;
                case 5:
                    System.out.println("Has elegido: Consultar el podio de una prueba.");
                    break;
                case 6:
                    Utils.mostrarSubmenu(); // Llama al submenú "Otras operaciones"
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
     * Muestra un submenú con 6 opciones.
     * Permite volver al menú principal con 0.
     */
    public static void mostrarSubmenu() {
        Random r = new Random();
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
                    teclado.nextLine();
                    System.out.println("Introduce un pais: ");
                    String pais = teclado.nextLine();
                    GestionJJOO.contarAtletasPorPais(pais);
                    break;
                case 2:
                    teclado.nextLine();
                    System.out.println("Introduce un codigo de atleta: ");
                    int codigo = teclado.nextInt();
                    GestionJJOO.eliminarAtletaPorCodigo(codigo);
                case 3:
                case 4:
                case 5:

                    break;
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