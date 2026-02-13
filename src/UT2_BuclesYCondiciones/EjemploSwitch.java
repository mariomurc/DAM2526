package T2_Ejemplos;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EjemploSwitch {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int resultado=0;
        System.out.println("ELIGE LA OPERACIÓN A REALIZAR");
        System.out.println("s.- Suma");
        System.out.println("r.- Resta");
        System.out.println("m.- Multiplicacion");
        System.out.println("d.- Division");
        char opcion = teclado.next().charAt(0);
        System.out.println("INTRODUCE EL PRIMER NÚMERO");
        int num1 = teclado.nextInt();
        System.out.println("INTRODUCE EL SEGUNDO NÚMERO");
        int num2 = teclado.nextInt();
        switch (opcion){
            case 's':
                resultado = num1 + num2;
                System.out.println("EL RESULTADO DE LA SUMA ES: " + resultado);
                break;
            case 'r':
                resultado = num1 - num2;
                System.out.println("EL RESULTADO DE LA RESTA ES: " + resultado);
                break;
            case 'm':
                resultado = num1 * num2;
                System.out.println("EL RESULTADO DE LA MULTIPLICACION ES: " + resultado);

                break;
            case 'd':
                resultado = num1 / num2;
                System.out.println("EL RESULTADO DE LA DIVISIÓN ES: " + resultado);

                break;
            default:
                System.out.println("HAS ELEGIDO UNA OPERACIÓN QUE NO EXISTE");
        }



    }
}
