package T3_Funciones;

import java.util.Scanner;

public class Ejercicio4 {
    /*
            4. Escribe un programa que pida un número entero por teclado y muestre por pantalla si es positivo, negativo o cero. Implementa y utiliza la función:
	        int dimeSigno(int a) // Devuelve -1 si es negativo, 0 si es igual a 0, 1 si es positivo
    **/

    //MAIN
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("INTRODUCE UN NUMERO: ");
        int numero = teclado.nextInt();
        mostrarResultado(dimeSigno(numero));

        int valor = dimeSigno(numero);
        switch (valor){
            case 0:
                System.out.println("TU NUMERO ES CERO");
                break;
            case 1:
                System.out.println("TU NUMERO ES POSITIVO");
                break;
            case -1:
                System.out.println("TU NUMERO ES NEGATIVO");
                break;
        }
    }

    /*//INICIALIZAR SCANNER
    public static Scanner inicializacionScanner(){

        return teclado;
    }

    //INTRODUCIR NUMEROS
    public static int introducirNumero(Scanner teclado){

        return numero;
    }*/

    //COMPROBAR SI ES NEGATIVO, POSITIVO O CERO
    public static int dimeSigno(int a){
        if (a > 0){
            return 1;
        }
        else if (a < 0)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }

    //MOSTRAR RESULTADOS
    public static void mostrarResultado(int a)
    {
        if (a > 0){
            System.out.println("TU NUMERO ES POSITIVO");
        }
        else if (a < 0)
        {
            System.out.println("TU NUMERO ES NEGATIVO");
        }
        else
        {
            System.out.println("TU NUMERO ES 0");
        }
    }
}
