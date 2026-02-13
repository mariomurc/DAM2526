package T3_Funciones;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int precio;
        double precioConIVA;

        for (int i = 0; i < 5 ; i++) {
            System.out.println("INTRODUCE UN PRECIO: ");
            precio = teclado.nextInt();
            precioConIVA = precioConIVA(precio);
            System.out.println("PRECIO ORIGINAL:" + precio);
            System.out.println("PRECIO CON IVA:" + precioConIVA);

        }
   }
    public static double precioConIVA(double p){
        //double res = precio * 1.21;
        return (p * 1.21);


    }
}
