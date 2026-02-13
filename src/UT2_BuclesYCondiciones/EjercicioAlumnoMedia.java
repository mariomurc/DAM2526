package T2_Ejemplos;

import java.util.Scanner;

public class EjercicioAlumnoMedia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombreAlumno;
        int notaModulo=0;
        float notaMedia=0;

        System.out.println("¿CUANTOS ALUMNOS HAY MATRICULADOS EN DAM1?");
        int nAlumnos = teclado.nextInt();
        String alumnos[]=new String[nAlumnos];
        float notas[]=new float[nAlumnos];
        String modulos[] = {"Programación", "Bases de Datos", "Leng. Marcas", "Sistemas Informáticos"};

        for (int i = 0; i < nAlumnos; i++) {
            teclado.nextLine();
            System.out.println("INTRODUCE EL NOMBRE DEL ALUMNO");
            nombreAlumno = teclado.nextLine();
            for (int j = 0; j < modulos.length; j++) {
                do {
                    System.out.println("NOTA DEL MÓDULO: " + modulos[j]);
                    notaModulo=teclado.nextInt();
                }while (notaModulo < 0 || notaModulo > 10);
                notaMedia = notaMedia + notaModulo;
            }
            notaMedia = notaMedia / modulos.length;
            alumnos[i]=nombreAlumno;
            notas[i]=notaMedia;
            notaMedia=0;
        }

        for (int i = 0; i <nAlumnos; i++) {
            System.out.println("LA NOTA DE MEDIA DE " + alumnos[i] + " ES " + notas[i]);
        }

    }
}
