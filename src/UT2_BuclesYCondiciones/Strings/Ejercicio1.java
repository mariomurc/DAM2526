package T2_Strings;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("INTRODUCE UNA FRASE");
        String frase=teclado.nextLine();
        //String.split()
        String array[]=frase.split("a");
        System.out.println(frase);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Pos " + (i+1) +" "+ array[i]);
        }
        String array2[]=new String[frase.length()];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = String.valueOf(frase.charAt(i));
        }
        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());
    }

}
