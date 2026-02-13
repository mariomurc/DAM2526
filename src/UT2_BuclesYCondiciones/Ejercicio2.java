package EjerciciosExamen;

import java.sql.DatabaseMetaData;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String contraseña="";
        int contador=0;
        System.out.println("INTRODUCE LA CONTRASEÑA");
        contraseña = teclado.next();
        if (contraseña.equals("DAM")){
            System.out.println("ENHORABUENA, HAS ACCEDIDO AL SISTEMA");
        } else {
            do{
                System.out.println("INTRODUCE LA CONTRASEÑA");
                contraseña = teclado.next();
                if (contraseña.equals("DAM")){
                    System.out.println("¡HAS ACERTADO, PERO CASI BLOQUEAS " +
                            "LA CUENTA!");
                }
                contador++;
             }while(!contraseña.equals("DAM") &&  contador!=3);
        }
        if (!contraseña.equals("DAM") && contador == 3){
            System.out.println("LO SIENTO, CUENTA BLOQUEADA");
        }


    }
}
