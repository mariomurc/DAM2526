package T2_EjerciciosDocumentos;

import java.util.Scanner;

public class Ej8Arrays {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int cont=0;
        //relleno el array
        double array[] = new double[100];
        for (int i = 0; i < array.length ; i++) {
            array[i] = Math.random();
            //System.out.println(array[i]);
        }
        //recojo el valor y lo valido
        System.out.println("INTRODUCE EL VALOR");
        double r= keyboard.nextDouble();
        if (r >= 0.0 && r <= 1.0){
            for (int i = 0; i < array.length; i++) {
                if (array[i] >= r){
                    cont++;
                }
            }
        }
        System.out.println("VALORES >= A " + r +": " + cont++);


    }
}
