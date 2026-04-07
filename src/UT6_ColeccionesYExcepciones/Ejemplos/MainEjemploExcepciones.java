package UT6_ColeccionesYExcepciones.Ejemplos;

import java.util.Scanner;

public class MainEjemploExcepciones {


        public static void main(String[] args) {
            System.out.println("=== DEMOSTRACIÓN DE EXCEPCIONES EN JAVA ===");
            Scanner teclado = new Scanner(System.in);
            int x, y;
            // 1. ArithmeticException: se captura en main
            System.out.println("\n1) Probando división (ArithmeticException):");
            System.out.println("=====================");
            System.out.println("VOY A DIVIDIR 5 VECES");
            System.out.println("=====================");
            for (int i = 0; i < 1 ; i++) {

                try {
                    System.out.println("Introduce el primer numero");
                    x = teclado.nextInt();
                    System.out.println("Introduce el segundo número");
                    y = teclado.nextInt();
                    int resultado = dividir(x,y); // Provoca ArithmeticException
                    System.out.println("Resultado de la división: " + resultado);
                } catch (ArithmeticException e) {
                    System.out.println(">> Capturada en main: " + e.getMessage());
                }/* catch (InputMismatchException e ){
                    System.out.println(">> Capturada en main1: " + e.getMessage());
                } catch (Exception e){
                    System.out.println(">> EXCEPCION GENÉRICA Capturada: " + e.getMessage());
                }*/
                finally {
                    x = 1;
                    y = 1;
                }

            }


            // 2. ArrayIndexOutOfBoundsException: se captura dentro del método
            System.out.println("\n2) Probando acceso a array (ArrayIndexOutOfBoundsException):");
            accederElementoArray();

            // 3. NumberFormatException: se propaga y se captura en main
            System.out.println("\n3) Probando parseo de número (NumberFormatException):");
            try {
                int numero = convertirCadenaAEntero("123"); // Cadena inválida
                System.out.println("Número convertido: " + numero);
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }

            // 4. Ejemplo mixto: método que atrapa y vuelve a lanzar (rethrow)
            System.out.println("\n4) Probando método mixto con rethrow (NumberFormatException):");
            try {
                metodoMixtoConRethrow("99b");
            } catch (NumberFormatException e) {
                System.out.println(">> Capturada en main después del rethrow: " + e.getMessage());
            }

            System.out.println("\n=== FIN DEL PROGRAMA ===");
        }

        /**
         * Método que provoca una ArithmeticException al dividir entre cero.
         * NO se captura aquí, se deja propagar al main.
         */
        public static int dividir(int a, int b) {
            // Si b es 0, Java lanzará automáticamente ArithmeticException
            return a / b;
        }

        /**
         * Método que provoca y captura un ArrayIndexOutOfBoundsException
         * dentro del propio método.
         */
        public static void accederElementoArray() {
            int[] numeros = { 10, 20, 30 };

            try {
                System.out.println("Intentando acceder a la posición 5 del array...");
                int valor = numeros[5]; // Índice fuera de rango
                System.out.println("Valor leído: " + valor);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(">> Capturada dentro de accederElementoArray: índice fuera de rango.");
                System.out.println("   Detalle: " + e.getMessage());
            } finally {
                System.out.println("   Bloque finally de accederElementoArray (se ejecuta siempre).");
            }
        }

        /**
         * Método que intenta convertir una cadena a entero.
         * Si la cadena no es un número válido, se lanza NumberFormatException.
         * NO se captura aquí, se propaga al main.
         */
        public static int convertirCadenaAEntero(String cadena) throws NumberFormatException {
            System.out.println("Intentando convertir la cadena \"" + cadena + "\" a entero...");
            // Integer.parseInt lanza NumberFormatException si la cadena no es válida
            int numero = Integer.parseInt(cadena);
            System.out.println("Conversión correcta, valor: " + numero);
            return numero;
        }

        /**
         * Método "mixto": captura la excepción, muestra un mensaje,
         * y luego la vuelve a lanzar (rethrow) para que otro nivel la gestione.
         */
        public static void metodoMixtoConRethrow(String texto) throws NumberFormatException {
            try {
                System.out.println("metodoMixtoConRethrow: intentando parsear \"" + texto + "\"...");
                int n = Integer.parseInt(texto);
                System.out.println("Número: " + n);
            } catch (NumberFormatException e) {
                System.out.println(">> Capturada en metodoMixtoConRethrow:");
                System.out.println("   Mensaje original: " + e.getMessage());
                // Volvemos a lanzar la misma excepción hacia arriba
                throw e;
            } finally {
                System.out.println("   Finally de metodoMixtoConRethrow.");
            }
        }
    }

