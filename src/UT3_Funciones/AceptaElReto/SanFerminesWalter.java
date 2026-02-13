package AceptaElReto;

import java.util.Scanner;

public class SanFerminesWalter {

       public static long elMasRapido(String cadenita){// una funcion para encontrar rapidamente xd el toro más rapido
            long elMayor = 1;// long por el tema del enunciado, que ponia que velocidad maxima del toro puede ser de 10 a la
            //9, si exige decimales lo puedo cambiar a double.
            String[] numeros = cadenita.split(" ");
            long[] velocidades = new long[(numeros.length - 1)];
            short elPrimerDato = Short.parseShort(numeros[0]);
            if (elPrimerDato == (numeros.length - 1)){
                //if comprubo que el array tenga las posiciones que indique la primera posicion
                for (int i = 1; i < numeros.length; i++) {
                    velocidades[(i - 1)] = Long.parseLong(numeros[i]);
                    if (velocidades[(i - 1)] > elMayor) {// en vez de ordenarlo con sort he investigado y tecnicamente esto es más optimo.
                        elMayor = velocidades[(i - 1)];
                    }else if (velocidades[(i - 1)] < 1){
                        i = numeros.length - 1;// para cortar el bucle
                        elMayor = -1;
                    }
                }
            }else elMayor = -1;
            return elMayor;//devuelvo la mayor velocidad
        }
        public static void main(String[] args) {
            //String toros = "7 -1 8 3 9 11 12 5";
            //En la linea de encima la sentencia de prueba
            Scanner keyboard = new Scanner(System.in);
            System.out.println("introduce la cantidad de toros en la primera posicion y separa con espacios el resto");
            String toros = keyboard.nextLine();
            long velocidadMaxima = elMasRapido(toros);
            if  (velocidadMaxima != -1){
                System.out.println("Los corredores deben ir a una velocidad de almenos: " + velocidadMaxima + " km's/h");
            }else System.out.println("el formato no es correcto o hay algun torro que va a velocidad 0 o por debajo.");;

        }
    }
/*
Un buen corredor de San Fermines intenta mantener la emoción para fomentar el espectáculo. Este tipo de corredores está
muy en forma y son capaces de correr mucho más deprisa que los toros. Sin embargo, para mantener la emoción,
no lo hacen. Se limitan a mantener una velocidad adecuada para que los toros se mantenga siempre cerca, pero
no lleguen a pillarles.

El problema consiste en, dadas las velocidades de todos los toros que participan en los San Fermines
(y que se suponen constantes), ¿a qué velocidad deben ir estos corredores expertos para mantener el
espectáculo conservando su integridad?

Entrada
La entrada consta de una serie de casos de prueba, cada uno en una línea. El primer número de la misma indica el número
de toros que intervienen en la carrera (n ≥ 1). A continuación aparece un entero por cada uno de los toros, indicando la
velocidad a la que correrá ese toro (recuerda, es velocidad constante). La velocidad es siempre positiva y no excede 109
.

Salida
Para cada caso de prueba se mostrará una línea en la que aparecerá la velocidad a la que deberán ir los corredores
expertos para mantener el espectáculo.

7 1 9 8 7 10 3 12 1 10

12
10
 */

