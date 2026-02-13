package T3_Funciones;

import java.util.Scanner;

public class Ejercicio8 {
        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Ingresa un valor entero");
            int valorN = keyboard.nextInt();
            System.out.println("La sumatoria de 1 a hasta "+valorN+" es: "+suma1aN(valorN)
                    +"\nEl productorio de "+valorN+" es: "+producto1aN(valorN)
                    +"\nY el numero intermedio entre 1 y "+valorN+" es: "+intermedio1aN(valorN));
        }

        public static int suma1aN(int n){
            int suma=0;
            for (int i = 1; i <= n; i++){
                suma=suma+i;
            }
            return suma;
        }
        public static int producto1aN(int n){
            int suma = 1;
            for (int i = 1; i <= n; i++){
                suma = suma*i;
            }
            return suma;
        }
        public static double intermedio1aN(int n){
            return (double) n /2;
        }

    }
/*
    8. Escribe un programa que pida un valor N entero y luego muestre: el sumatorio desde 1 a N, el productorio de 1 a
    N y el valor intermedio entre 1 y N. Implementa y utiliza las funciones:
	int suma1aN(int n) // Devuelve la suma de enteros de 1 a n
	int producto1aN(int n) // Devuelve el producto de enteros de 1 a n
	double intermedio1aN(int n) // Devuelve el valor intermedio entre 1 y n

 */

