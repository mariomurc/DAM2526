package T2_Ejemplos;

import java.util.Scanner;

public class EjercicioAlumnoMediaV2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombreAlumno;
        int notaModulo=0;
        int notaMedia=0;

        System.out.println("¿CUANTOS ALUMNOS HAY MATRICULADOS EN DAM1?");
        int nAlumnos = teclado.nextInt();
        String alumnos[]=new String[nAlumnos];
        String modulos[] = {"Programación", "Bases de Datos", "Leng. Marcas", "Sistemas Informáticos"};
        int notas[][]=new int[modulos.length+1][nAlumnos];
        //RELLENO LA MATRIZ
        for (int i = 0; i < nAlumnos; i++) {
            teclado.nextLine();
            System.out.println("INTRODUCE EL NOMBRE DEL ALUMNO");
            nombreAlumno = teclado.nextLine();
            alumnos[i]=nombreAlumno;
            for (int j = 0; j < modulos.length; j++) {
                do {
                    System.out.println("NOTA DEL MÓDULO: " + modulos[j]);
                    notaModulo=teclado.nextInt();
                }while (notaModulo < 0 || notaModulo > 10);
                //notaMedia = notaMedia + notaModulo;
                notas[j][i] = notaModulo;
            }
        }
        //voy a probar que la matriz esta rellena
       /* for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[0].length; j++) {
                System.out.print(notas[i][j] + " ");
            }
            System.out.println();
        }*/

        //CALCULO LA MEDIA PARA CADA ALUMNO
        for (int i = 0; i < notas[0].length; i++) {
            for (int j = 0; j < notas.length; j++) {
                notaMedia = notaMedia + notas[j][i];
            }
            notaMedia = notaMedia / modulos.length;
            notas[modulos.length][i] = notaMedia;
            notaMedia=0;
        }
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[0].length; j++) {
                System.out.print(notas[i][j] + " ");
            }
            System.out.println();
        }
//MUESTRO TODA LA INFO
        System.out.println("notas.length: " + notas.length);
        System.out.println("notas[0].length: " + notas[0].length);
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("NOTAS DE EL ALUMNO: " + alumnos[i]);
            for (int j = 0; j < modulos.length; j++) {
                System.out.print(modulos[j] + ": " + notas[j][i] + " ");
            }
            System.out.println();
            System.out.println("NOTA MEDIA: " + notas[modulos.length][i]);
        }

    }
}
