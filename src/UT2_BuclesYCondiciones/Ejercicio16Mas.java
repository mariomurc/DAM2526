package T2_EjerciciosDocumentos;

import java.util.Scanner;

public class Ejercicio16Mas {
    public static void main(String[] args)  {
            //16. Realiza un programa en java que pida un número entero positivo y nos diga si es primo o no.
            Scanner keyboard = new Scanner(System.in);
            int number, divisible;
            System.out.print("Escribre un numero positivo: ");
            number = keyboard.nextInt();
            if (number < 0) {
                System.out.println("El numero introducido es negativo");
            }else if (number > 0){
                divisible = 0;
                for(int i = 1; number >= i; i++){
                    if ((number % i)==0) divisible++;
                }
                if (divisible == 1 || divisible == 2) {
                    System.out.println("El numero introducido es primo");
                }else if (divisible > 2){
                    System.out.println("El numero introducido no es primo");
                }
            }else{
                System.out.println("0 no es divisible entre si mismo y todo numero dividido entre 0 es 0.");
            }

        }
    }

