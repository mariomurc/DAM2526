package T2_EjerciciosDocumentos;

import java.util.Scanner;

public class Ejercicio17Mas {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numero, numAnterior, totalNum=0, fallos=0;
        System.out.println("INTRODUCE EL NÚM INICIAL");
        numAnterior = keyboard.nextInt();
        if (numAnterior != 0){
            totalNum++;
        }
        while(numAnterior != 0){
            System.out.println("INTRODUCE EL SIGUIENTE NÚMERO");
            numero = keyboard.nextInt();

            if (numero != 0){
                if (numAnterior >= numero){
                    System.out.println("FALLO, ES MENOR (O IGUAL)");
                    fallos++;
                }
                totalNum++;
            }
            numAnterior = numero;
        } //fin del while

        System.out.println("Total de numeros introducidos: " + totalNum);
        System.out.println("Números fallados: " + fallos);


    }
}
