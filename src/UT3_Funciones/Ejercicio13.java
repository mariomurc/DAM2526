package T3_Funciones;

import java.util.Scanner;

public class Ejercicio13 {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("¿CUANTOS PRODUCTOS QUIERES PROCESAR?");
        int nProductos = teclado.nextInt();

        String [] productos = new String[nProductos];
        int [] precioInicial = new int [nProductos];
        int [] precioFinal = new int [nProductos];

        solicitarDatosProductos(productos,precioInicial,precioFinal);

        int descuento = 0;
        for (int i = 0; i < nProductos ; i++) {
            descuento = porcentaje(precioInicial[i],precioFinal[i]);
            System.out.println("EL PRODUCTO " + productos[i] + "TIENE UN DESCUENTO DEL "
            + descuento + "%");
        }

    }
//RECOJO TODOS LOS NMBRES Y PRECIOS DE CADA UNO DE LOS PRODUCTOS ALMACENANDOLOS EN SU
    //ARRAY CORRESPONDIENTE Y DE FORMAR ORDENADA
    public static void solicitarDatosProductos(String [] productos, int [] precioInicial,
                                               int [] precioFinal){

        for (int i = 0; i < productos.length ; i++) {
            System.out.println("INTRODUCE EL NOMBRE DEL PRODUCTO");
            productos[i] = teclado.nextLine();
            System.out.println("INTRODUCE EL PRECIO INICIAL");
            precioInicial[i] = teclado.nextInt();
            System.out.println("INTRODUCE EL PRECIO FINAL");
            precioFinal[i] = teclado.nextInt();
        }
    }

    public static int porcentaje(int a, int b){
        int des;
        des = b / a;
        des = des * 100;
        des = 100 - des;
        return des;
    }
}
