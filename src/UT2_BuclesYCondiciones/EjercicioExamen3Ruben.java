package EjerciciosExamen;

import java.util.Scanner;

public class EjercicioExamen3Ruben {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float cantidad;
        float numMayor= 0;
        float numMenor = 0;
        float num;
        float resultado = 1;
        float contador = 0f;
        float contador2 = 0f;
        System.out.println("CUANTOS NUMERO QUIERES PONER?");
        cantidad = teclado.nextFloat();
        while (contador < cantidad) {
            System.out.println("INTRODUCE TU NUMERO");
            num = teclado.nextFloat();
            contador++;
            if (num > numMayor || contador == 1f) {
                numMayor = num;
            }
            if (num < numMenor || contador == 1f) {
                numMenor = num;
            }
        }
        while (numMayor > contador2){
            contador2++;
            resultado = resultado*numMenor;
        }
        System.out.println("EL RESULTADO DE LA POTENCIA DEL NUMERO MENOR " + numMenor + " ELEVADO AL NUMERO MAYOR "+ numMayor +  " ES " + resultado);

    }
}
