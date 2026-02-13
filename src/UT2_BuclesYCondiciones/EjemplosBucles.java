package T2_Ejemplos;

import java.util.Scanner;

public class EjemplosBucles {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int max=5;
        boolean repetir=false;
        System.out.println("EJECUCIÓN DE UN do-WHILE");
        System.out.println("INTRODUCE UN NÚMERO:");
        int numero1 = teclado.nextInt();
        do{
            System.out.println(numero1);
            numero1++;
        }while(numero1 < max && repetir);


        System.out.println("EJECUCIÓN DE UN WHILE");
        System.out.println("INTRODUCE UN NÚMERO:");
        int numero = teclado.nextInt();
        while (numero > max){
            System.out.println("VALOR DE NUMERO: " + numero);
            numero--;
        }




        System.out.println("EJECUCIÓN DE UN FOR");
        for (int i = 0; i <= max ; i=i+2) {
            System.out.println(i);
        }
        int i=110;
        System.out.println(i);
        
        
    }
}
