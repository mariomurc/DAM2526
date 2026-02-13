package T3_Funciones;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
    //    System.out.println("Ingresa la fecha con este formato (dd-mm-AAAA)");
        System.out.println("introduce el separador que vas a usar");
        char separador = keyboard.next().charAt(0);
        keyboard.nextLine();

        System.out.println("Ingresa la fecha acotada por el separador");
        String fecha = keyboard.nextLine();
        System.out.println("La fecha es: "+leerFecha(fecha,separador));



    }
    public static String leerFecha(String fecha, char separador){
        String[]cadenas = fecha.split(String.valueOf(separador));
        int[] numerosFecha = new int[3];
        for (int i = 0; i < numerosFecha.length; i++){
            numerosFecha[i] = Integer.parseInt(String.valueOf(cadenas[i]));
        }
        String condition = "correcta";
        String mes = "";
        if (numerosFecha[0] < 1 || numerosFecha[0] > 30)
            condition = "erronea";
        else {
            if (numerosFecha[2] < 0){
                condition = "erronea";
            }else {
                if (numerosFecha[1] < 1 || numerosFecha[1] > 12) {
                    condition = "erronea";
                } else {
                    switch (numerosFecha[1]) {
                        case 1:
                            mes = "enero";
                            break;
                        case 2:
                            mes = "febrero";
                            break;
                        case 3:
                            mes = "marzo";
                            break;
                        case 4:
                            mes = "abril";
                            break;
                        case 5:
                            mes = "mayo";
                            break;
                        case 6:
                            mes = "junio";
                            break;
                        case 7:
                            mes = "julio";
                            break;
                        case 8:
                            mes = "agosto";
                            break;
                        case 9:
                            mes = "septiembre";
                            break;
                        case 10:
                            mes = "octubre";
                            break;
                        case 11:
                            mes = "noviembre";
                            break;
                        case 12:
                            mes = "diciembre";
                            break;
                        default:
                            mes = "error";
                    }
               }
            }
        }
        String esBisiesto="";
        if (((numerosFecha[2] % 4 == 0) && (numerosFecha[2] % 100 != 0))
            || (numerosFecha[2] % 400 == 0) ){
            esBisiesto = "ES BISIESTO";
        }
        else{

            esBisiesto = "NO ES BISIESTO";
            }

        String mensaje = "";
        if (condition.equals("erronea")){
            return "LA FECHA ES " + condition;
        } else {
            return "LA FECHA ES " + condition + "EL MES ES: " + mes +
                    " Y EL AÑO " + esBisiesto;
        }


    }
}
/*
10.	Realiza un programa que lea una fecha introduciendo el día, mes y año por separado y nos diga si la fecha
 es correcta o no. Supondremos que todos los meses tienen 30 días. Se debe crear una función donde le pasemos
 los datos y devuelva si es correcta o no.
*/
