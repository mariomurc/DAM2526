package T2_Strings;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MueveArroba {
    public static void main(String[] args) {

            Scanner teclado= new Scanner(System.in);
            String orden;
            byte contadorVertical=2;
            byte contadorHorizontal=2;
            char array[][]= new char[5][5];
            //INICIALIZAR LA MATRIZ

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    array[i][j]='-';
                }
            }
        //COLOCAR LA @ EN SU POSICIÓN INICIAL
        array[contadorHorizontal][contadorVertical]='@';
            //PONER PIEDRAS
            int total = (array.length * array[0].length) / 8;
            int cont=0;
            while (cont < total) {
                int px=(int)(0 + Math.random() * (4 - 0 + 1));
                int py=(int)(0 + Math.random() * (4 - 0 + 1));
                System.out.println(px + " " + py);
                if (array[px][py] == '-') {
                    array[px][py] = 'P';
                    cont++;
                }
            }


            //MOSTRAR LA MATRIZ
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(array[i][j]);
                }
                System.out.println("");
            }

            do {

                System.out.println("Arriba(para ir arriba)/Abajo(para ir abajo)/Derecha(para ir a la derecha)/Izquierda(para ir a la izquierda)/Salir(para salir)");
                orden=teclado.nextLine();
                orden=orden.toLowerCase();

                if((contadorVertical==array[0].length-1 && orden.equals("abajo"))
                        ||(contadorVertical==0 && orden.equals("arriba"))
                        ||(contadorHorizontal==array.length-1 && orden.equals("derecha"))
                        || (contadorHorizontal==0 && orden.equals("izquierda"))){
                    System.out.println("Has llegado al límite, vuelve a intentarlo");
                }else{
                    array[contadorVertical][contadorHorizontal]='-';
                    switch (orden) {
                        case "arriba":
                            if (array[contadorVertical-1][contadorHorizontal] != 'P')
                                contadorVertical--;
                            else
                                System.out.println("HAY UNA PIEDRA");
                            break;
                        case "abajo":
                            contadorVertical++;
                            break;
                        case "derecha":
                            contadorHorizontal++;
                            break;
                        case "izquierda":
                            contadorHorizontal--;
                            break;
                    }
                }
                array[contadorVertical][contadorHorizontal]='@';
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.print(array[i][j]);
                    }
                    System.out.println("");
                }
            }while(!orden.equalsIgnoreCase("Salir"));


    }
}
