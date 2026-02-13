package T2_EjerciciosDocumentos;

import java.util.Scanner;

public class Ej7ArraysV2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int aux;
        System.out.println("INTRODUCE EL PRIMER VALOR");
        int p= keyboard.nextInt();
        System.out.println("INTRODUCE EL SEGUNDO VALOR (PROCURA QUE SEA MAYOR QUE EL PRIMERO)");
        int q= keyboard.nextInt();

      //  System.out.println(Math.abs(q-p)+1);
      //  System.out.println(Math.abs(p-q)+1);
        //int tamaño=Math.abs(p-q)+1;
        //int array[]=new int[tamaño];
        int array[]=new int[Math.abs(p-q)+1];

        if (p < q){
            for (int i = 0; i <array.length ; i++) {
                array[i] = p;
                p++;
            }
        } else {
            for (int i = 0; i <array.length ; i++) {
                array[i] = p;
                p--;
            }
        }
        for (int i = 0; i <array.length ; i++) {
            System.out.println("Posicion " + i + ": " + array[i]);
        }

    }
}
