package EjerciciosExamen;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeros, min, max, potencia, numLeido;

        System.out.println("¿CUANTOS NÚMEROS QUIERES PROCESAR?");
        numeros = teclado.nextInt();
        if (numeros <= 0){
            System.out.println("ERROR, NO SE PUEDEN PROCESAR 0 O MENOS NÚMEROS");
        } else {
            System.out.println("INTRODUCE UN NÚMERO");
            numLeido = teclado.nextInt();
            min=numLeido;
            max=numLeido;
            if (numeros==1) {
                System.out.println("LOS NÚMEROS SON IGUALES");
            } else {
                while (numeros > 1){
                    System.out.println("INTRODUCE UN NÚMERO");
                    numLeido = teclado.nextInt();
                    if (numLeido < min){
                        min = numLeido;
                    }
                    if (numLeido > max){
                        max = numLeido;
                    }
                    numeros--;
                } //while
                System.out.println("EL NUM MAYOR ES: " + max +
                        " Y EL MENOR ES: " + min);
            } //segundo else
        } //primer else
        //AHORA CALCULO LA POTENCIA DE MIN^MAX


    }
}
