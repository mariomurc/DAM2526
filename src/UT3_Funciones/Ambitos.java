package T3_Funciones;

import java.util.Arrays;

public class Ambitos {
    public static void main(String[] args) {
        int cantidad = 2000;
        System.out.println(cantidad);
        aumentoCantidad(cantidad);
        System.out.println(cantidad);

        int v[] = {0, 1, 2, 3};
        System.out.println("Vector antes: " + Arrays.toString(v));
        sumaXAlVector(v, 10);
        System.out.println("Vector después: " + Arrays.toString(v));
        sumaXAlVector(v, 30);
        System.out.println("Vector después de despues: " + Arrays.toString(v));

        //        queCantidad();
//        queCantidad1(cantidad);
    }

    public static void sumaXAlVector(int array[], int valor){
        for (int i = 0; i< array.length; i++)
            array[i] = array[i] + valor;

        array =new int[20];

        for (int i = 0; i< array.length; i++)
            array[i] = array[i] + valor;

    }

    public static void aumentoCantidad(int cantidad){
        cantidad = cantidad * 2;
        System.out.println("DENTRO DE LA FUNCIÓN:" + cantidad);
    }


    public static int queCantidad(){
      int cantidad=1234;
         System.out.println(cantidad);
        return 0;
    }

    public static void queCantidad1(int cantidad){
        System.out.println(cantidad);
        //cantidad = cantidad;
        System.out.println(cantidad);

    }

}
