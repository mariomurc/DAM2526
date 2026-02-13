package T2_EjerciciosDocumentos;

import java.util.Arrays;
import java.util.Scanner;

public class Ej15_DocA {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("INTRODUCE EL TAMAÑO DEL ARRAY");
        int tamanio=teclado.nextInt();
        System.out.println("INTRODUCE EL VALOR A INICIALIZAR");
        int valor=teclado.nextInt();

        int array[]=new int[tamanio];
        System.out.println("ARRAY CREADO DE TAMAÑO: " + tamanio);
        Arrays.fill(array,valor);
        System.out.println("ARRAY INICIALIZADO A: " + valor);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }



    }
}
