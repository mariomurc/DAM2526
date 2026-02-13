package T2_EjerciciosDocumentos;

import java.util.Scanner;

public class Ej7Arrays {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int aux;
        System.out.println("INTRODUCE EL PRIMER VALOR");
        int p= keyboard.nextInt();
        System.out.println("INTRODUCE EL SEGUNDO VALOR (PROCURA QUE SEA MAYOR QUE EL PRIMERO)");
        int q= keyboard.nextInt();
        if (p > q){
            aux=p;
            p=q;
            q=aux;
        }
        int array[]=new int[q-p+1];
        System.out.println("TAMAÑO DEL ARRAY: " + array.length);

        for (int i = 0; i <array.length ; i++) {
            array[i] = p;
            p++;
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.println("Posicion " + i + ": " + array[i]);
        }

    }
}
