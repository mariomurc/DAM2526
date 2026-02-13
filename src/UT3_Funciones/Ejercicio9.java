package T3_Funciones;


import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio9 {

    public static int maximoFuncion(int numero1, int numero2) {
        if (numero1 <= numero2) {
            return numero2;
        } else
            return numero1;

    }
    public static int medioFuncionArrayTresNumeros(int numero1, int numero2, int numero3){
        int array[]={numero1, numero2, numero3};
        Arrays.sort(array);
        return array[1];


    }

    public static int medioFuncion(int numero1, int numero2, int numero3) {
        if ((numero1 > numero2 && numero1 < numero3) || (numero1 < numero2 && numero1 > numero3)) {
            return numero1;
        } else if ((numero2 > numero1 && numero2 < numero3) || (numero2 < numero1 && numero2 > numero3)) {
            return numero2;
        } else {
            return numero3;
        }
    }
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int numero1, numero2, numero3;
        System.out.println(" Introduce el primer numero ");
        numero1 = teclado.nextInt();
        System.out.println(" Introduce el segundo numero ");
        numero2 = teclado.nextInt();
        System.out.println(" Introduce el tercer numero ");
        numero3 = teclado.nextInt();
        teclado.nextLine();
        if (numero1 == numero2 && numero1 == numero3 && numero2 == numero3) {
            System.out.println(" ERROR LOS NÚMEROS TIENEN QUE SER DISTINTOS ");
        } else {
            int funcion = maximoFuncion(maximoFuncion(numero1, numero2), numero3);
            System.out.println(" EL NUMERO MAS ELEVADO ES :  " + funcion);
            int medio = medioFuncion(numero1, numero2, numero3);
            System.out.println(" EL NUMERO DEL MEDIO ES : " + medio);
        }
    }
}
