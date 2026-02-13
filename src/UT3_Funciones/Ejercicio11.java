package T3_Funciones;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.println("Introduce el número del cual quieres que se muestre su tabla de multiplicar: ");
        n= teclado.nextInt();
        tablaMultiplicar(n);
    }
    public static void tablaMultiplicar(int n) {
        Scanner teclado = new Scanner(System.in);
        int contador = 10;
        int resultado;
        int eleccion;
        do {
            System.out.println("ELIGE (Escribe 1 o 2): \n 1- De mayor a menor \n 2- De menor a mayor");
            eleccion = teclado.nextInt();
            if (eleccion != 1 && eleccion != 2) {
                System.out.println("-- ERROR --");
            }
        } while (eleccion != 1 && eleccion != 2);
        if (eleccion == 1) {
            System.out.println("-- TABLA DEL " + n + " --");
            while (contador > -1) {
                resultado = n * contador;
                System.out.println(n + " · " + contador + " = " + resultado);
                contador--;
            }}else{
            contador = 0;
            System.out.println("-- TABLA DEL " + n + " --");
            while (contador < 11) {
                resultado = n * contador;
                System.out.println(n + " · " + contador + " = " + resultado);
                contador++;
            }
        }
    }
}
