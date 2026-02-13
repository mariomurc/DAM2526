package T2_Ejemplos;

import java.util.Scanner;

public class EjemploIfNotas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char respuestaCorrecta;
        System.out.println("INTRODUCE UNA NOTA POR TECLADO");
        float nota = teclado.nextFloat();

        if (nota < 0 || nota >10){
            System.out.println("NOTA ERRONEA");
        } else {
            System.out.println("NOTA CORRECTA");
            System.out.println("¿TIENES PUNTUACIÓN ADICIONAL? (s/n)");
            respuesta = teclado.next().charAt(0);
            System.out.println("VALOR DE LA RESPUESTA:" + respuesta);

            if (respuesta == 's' || respuesta == 'n'){
                if (respuesta == 's'){
                    nota = nota * 1.2f;
                    //nota = nota + (nota*0.2)
                }
                System.out.println("NOTA: " + nota);
                if (nota <= 4.99){
                    System.out.println("INSUFICIENTE");
                } else {
                    if (nota <= 6.99){
                        System.out.println("SUFICIENTE");
                    } else {
                        if (nota <= 8.99){
                            System.out.println("NOTABLE");
                        } else {
                            System.out.println("SOBRESALIENTE");
                        }
                    }
                }
            } else {
                System.out.println("CARACTER INESPERADO DE PUNTUACION ADICIONAL");
            }
        }
    }
}
