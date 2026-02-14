package T4_ObjetosI.CarreraCoches;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class MainCarrera {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random r = new Random();
        String[] nombres = {"Ana López", "Carlos Pérez", "María Gómez", "Lucía Torres",
                "Javier Ruiz", "Elena Martín", "Sergio Ramos", "Paula Díaz",
                "Héctor Lara", "Irene Castillo", "David Romero", "Marta Sánchez",
                "Rubén Vidal", "Laura Herrera", "Iván Molina", "Clara Suárez",
                "Adrián Cano", "Nuria Campos", "Óscar Benítez", "Sara Márquez"};
        String [] marcas = {"BMW", "Ford", "SEAT", "PEUGEOT"};

        System.out.println("¿CUANTOS COCHES QUIERES PARA LA CARRERA?");
        int numCoches = teclado.nextInt();
        Coche arrayCoches [] = new Coche[numCoches];
        for (int i = 0; i < numCoches; i++) {
            LocalDate fNac = LocalDate.of(r.nextInt(1950,2009), r.nextInt(12)+1, r.nextInt(1,31));
            arrayCoches[i] = new Coche(marcas[r.nextInt(4)],
                    new Piloto(nombres[r.nextInt(20)],
                               "7777E", fNac),
                    r.nextFloat(1,31));
        }
        System.out.println();
        System.out.println("LA CARRERA VA A COMENZAR");
        teclado.nextLine();
        //ESTE BUCLE CONTROLA EL NÚMERO DE VUELTAS TOTALES
        for (int i = 0; i < numCoches; i++) {
            //ESTE BUCLE SE EJECUTA PARA TODOS LOS COCHES
            //EN CADA VUELTA
            for (int j = 0; j < numCoches; j++) {
                arrayCoches[j].conducir();
                arrayCoches[j].imprimir();
            }
            System.out.println("$$$$$$$$$$$VUELTA COMPLETADA$$$$$$$$$$$");
        }
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("&&&& CARRERA TERMINADA &&&&");
        comprobarGanadorPerdedoresCarrera(arrayCoches);
    }
    public static void comprobarGanadorPerdedoresCarrera(Coche[] arrayCoches){
        int posGanador=0;
        float kmGanador = arrayCoches[0].getnKilometrosRecorridos();
        for (int i = 1; i < arrayCoches.length; i++) {
            if(arrayCoches[i].getnKilometrosRecorridos() > kmGanador){
                posGanador = i;
                kmGanador = arrayCoches[i].getnKilometrosRecorridos();
            }
        }
        int ganadas = arrayCoches[posGanador].getPiloto().getcGanadas();
        arrayCoches[posGanador].getPiloto().setcGanadas(ganadas + 1);
        arrayCoches[posGanador].imprimirConPiloto("GANADOR");
        for (int i = 0; i < arrayCoches.length; i++) {
            if(posGanador != i){
                int perdidas = arrayCoches[i].getPiloto().getcPerdidas();
                arrayCoches[i].getPiloto().setcPerdidas(perdidas + 1);
                arrayCoches[i].imprimirConPiloto("PERDEDOR");
            }

        }


    }



}
