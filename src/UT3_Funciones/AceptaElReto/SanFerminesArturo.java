package AceptaElReto;

import java.util.Scanner;

public class SanFerminesArturo {


        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Cuantas carreras se van a dar");
            int numCarreras = teclado.nextInt();
            int array[]=new int[numCarreras];
            int velocidadMax=0;
            int cont=0;

            for (int i = 0; i < numCarreras; i++) {
                System.out.println("Cuantos toros corren esta carrera");
                int numToros = teclado.nextInt();
                for (int j = 0; j < numToros; j++) {
                    System.out.println("Velocidad del siguiente toro");
                    int velToros = teclado.nextInt();
                    if (velToros>velocidadMax){
                        velocidadMax=velToros;
                    }
                }
                array[i]=velocidadMax;
            }
            for (int i = 0; i < array.length; i++) {
                cont++;
                System.out.println("velocidad del toro mas rapido en la carera numero " + cont + " es " + array[i]);
            }
        }
    }

