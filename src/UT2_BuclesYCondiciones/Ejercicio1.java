package EjerciciosExamen;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float notaPrac,notaTeo,notaProb, notaFinal=0.0f;
        String nombre="";
        System.out.println("INTRODUCE EL NOMBRE DEL ALUMNO");
        nombre = teclado.nextLine(); //¿o next()¿

        while (!nombre.equals("TERMINAR") ){
            System.out.println("¿NOTA DE PROBLEMAS?: ");
            notaProb=teclado.nextFloat();
            System.out.println("¿NOTA DE PRACTICAS?: ");
            notaPrac=teclado.nextFloat();
            System.out.println("¿NOTA DE TEORIA?: ");
            notaTeo=teclado.nextFloat();
            //COMPRUEBO QUE LAS NOTAS ENTRE 0 Y 10
            if ((notaProb >= 0 && notaProb <= 10) &&
                    (notaPrac >= 0 && notaPrac <= 10) &&
                        (notaTeo >= 0 && notaTeo <= 10)) {
                    notaFinal = notaProb * 0.5f + notaPrac * 0.2f + notaTeo * 0.3f;
                    System.out.println("LA NOTA PONDERADA DEL ALUMNO "+ nombre +
                        " ES " + notaFinal );
                }
            else {
                System.out.println("ERROR, ALGUNA DE LAS NOTAS NO ESTÁ EN " +
                        "EL RANGO ADECUADO");
            }
            System.out.println("INTRODUCE EL NOMBRE DEL ALUMNO");
            nombre = teclado.nextLine(); //¿o next()¿
        }

    }
}
