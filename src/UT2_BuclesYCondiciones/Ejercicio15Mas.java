package T2_EjerciciosDocumentos;

import java.util.Scanner;

public class Ejercicio15Mas {

        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            int numero1, numero2;
            int contador = 0;
            int multiplo, aux;
            System.out.println("Introduce el primer numero");
            numero1 = entrada.nextInt();
            System.out.println("Introduce el segundo numero");
            numero2 = entrada.nextInt();

            if (numero1 > numero2){
                aux=numero1;
                numero1=numero2;
                numero2=aux;
            }

            System.out.println("Multiplos de que numero");
            multiplo = entrada.nextInt();
            for (int i = numero1; i <= numero2; i++) {
                if (i % multiplo == 0) {
                    System.out.println(i + "");
                    contador++;
                }
            }
            System.out.println("los multiplos son " +contador);
        }

}
