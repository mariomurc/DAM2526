package T3_Funciones;

import java.util.Scanner;

public class Ejercicio2 {

    public static boolean esMayorEdad(int edad) {
     //   return edad >= 18;
     /*   if (edad >= 18)
            return true;
        else
            return false;
     */
        if (edad >= 18) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        int edad = teclado.nextInt();
        //boolean esMayor= esMayorEdad(edad);

        //if (esMayor==true){
        //if (esMayor){
        if (esMayorEdad(edad)){
            System.out.println("ERES MAYOR DE EDAD");
        }else{
            System.out.println("ERES MENOR DE EDAD");
        }




    }
}
