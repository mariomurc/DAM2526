package T3_Funciones;

import java.util.Scanner;

public class PruebasCasting {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean tieneLetra=false;
        String palabra = teclado.nextLine();


        int i=0;
        while (i < palabra.length() && tieneLetra == false) {
            if (!Character.isDigit(palabra.charAt(i))){
                tieneLetra = true;
            }
            i++;
        }

        if (!tieneLetra) {
            Integer a = Integer.valueOf(palabra);
            System.out.println("HE PODIDO HACER LA CONVERSIÓN A ENTERO: " + a);
        } else {
            System.out.println("NO HE PODIDO HACER LA CONVERSIÓN A ENTERO: ");
        }

        int b = Integer.valueOf("900");
        System.out.println(b);
        double doble = Double.parseDouble("900,1");
        System.out.println(doble);

    }
}
