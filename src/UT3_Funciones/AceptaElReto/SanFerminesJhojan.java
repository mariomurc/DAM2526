package AceptaElReto;

import java.util.Scanner;

public class SanFerminesJhojan {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            while (teclado.hasNextInt()) {
                int n = teclado.nextInt(); // número de toros
                int max = 0;
                for (int i = 0; i < n; i++) {
                    int velocidad = teclado.nextInt();
                    if (velocidad > max) {
                        max = velocidad;
                    }
                }
                System.out.println(max);
            }

            teclado.close();
        }
    }

