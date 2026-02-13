package T3_Funciones;

import java.util.Scanner;

public class Ejercicio21 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion=0;
        do{
            opcion = menu();
            gestionarOpciones(opcion);
        } while (opcion != 5);
    }

    public static void gestionarOpciones(int opcion){
        double radio = 0.0;
        double resultado=0.0;
        switch (opcion){
            case 1:
                //calculo la circunferencia
                radio = pideRadio();
                resultado=circunferencia(radio);
                System.out.print("Radio: " + radio + " Circunferencia: " );
                System.out.printf("%.2f", resultado);
                break;
            case 2:
                //calculo el area
                radio = pideRadio();
                resultado=area(radio);
                System.out.print("Radio: " + radio + " Area: " );
                System.out.printf("%.2f", resultado);
                break;
            case 3:
                radio = pideRadio();
                resultado=volumen(radio);
                System.out.print("Radio: " + radio + " Volumen: " );
                System.out.printf("%.2f", resultado);
                break;
            case 4:
                radio = pideRadio();
                System.out.print("AREA: ");
                System.out.printf("%.2f", area(radio));
                System.out.println();
                System.out.print("CIRCUNFERENCIA: ");
                System.out.printf("%.2f", circunferencia(radio));
                System.out.println();
                System.out.print("VOLUMEN: " );
                System.out.printf("%.2f", volumen(radio));

                break;
            case 5:
                System.out.println("SE SALDRÁ DEL PROGRAMA!!!!");
                break;
            default:
                System.out.println("NINGUNA DE LAS OPCIOES ES CORRECTA");
        }
        System.out.println();
        System.out.println();


    }
    public static double volumen(double r) {
        return (4.0/3.0)*Math.PI*Math.pow(r,3);
    }

    public static double circunferencia(double r){
        return 2*Math.PI*r;
    }

    public static double area(double r){
        return Math.PI*Math.pow(r,2);
    }

    public static double pideRadio(){
        System.out.println("Introduce el radio:");
        double r= teclado.nextDouble();
        while (r<=0){
            System.out.println("----Radio incorrecto----");
            System.out.println("Introduce DE NUEVO el radio:");
            r= teclado.nextDouble();
        }
        return r;
    }

    public static int menu(){
        pintaMenu();
        System.out.println("Elige una de las opciones anteriores:");
        int opc= teclado.nextInt();
        while (opc!=1 && opc!=2 && opc!=3 && opc!=4 && opc!=5){
            System.out.println("----OPCIÓN INCORRECTA----");
            pintaMenu();
            System.out.println("Elige DE NUEVO una de las opciones anteriores:");
            opc= teclado.nextInt();
        }
        return opc;
    }

    public static void pintaMenu(){
        System.out.println("************* MENÚ DE OPCIONES *************");
        System.out.println("1.- Cálculo Circunferencia");
        System.out.println("2.- Cálculo Área");
        System.out.println("3.- Cálculo Volumen");
        System.out.println("4.- Todas");
        System.out.println("5.- Salir");

    }
}
