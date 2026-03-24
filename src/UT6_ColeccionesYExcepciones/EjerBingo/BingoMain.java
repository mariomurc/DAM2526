package UT6_ColeccionesYExcepciones.EjerBingo;


import java.util.Scanner;

public class BingoMain {
    public static void main(String[] args) {
        GestionBingo bingo = new GestionBingo();
        Scanner teclado = new Scanner(System.in);
        String continuar = "S";
        do {
            bingo.inicializarPartida();
            bingo.jugarPartida();
            bingo.finalizarPartida();
            System.out.println("¿OTRA PARTIDITA?");
            continuar=teclado.next();
        } while (continuar.equalsIgnoreCase("S"));


    }
}
