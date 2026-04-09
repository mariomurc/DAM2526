
package UT5_POOII.HubJuegos;


import UT5_POOII.HubJuegos.hub.HubJuegos;
import UT5_POOII.HubJuegos.modelos.ResultadoPartida;

public class Main {
        public static void main(String[] args) {
            HubJuegos hub = new HubJuegos();

            // Registrar jugadores
            hub.registrarJugador("Mario");
            hub.registrarJugador("Ana");
            hub.registrarJugador("Luis");
            hub.registrarJugador("Luis");
            hub.registrarJugador("Carlos");
            hub.registrarJugador("Raúl");
            hub.registrarJugador("Raúl1");








            // Listar jugadores
            System.out.println("=== JUGADORES REGISTRADOS ===");
            hub.listarJugadores();
            System.out.println();

            // Listar juegos
            System.out.println("=== JUEGOS DISPONIBLES ===");
            hub.listarJuegos();

            //EL SIGUIENTE BLOQUE PODRÍAMOS METERLO EN UN BUCLE QUE TERMINE AL PULSAR 0, CON UN MENÚ DEL TIPO:
            // 1.- ADIVINA EL NÚMERO
            // 2.- PPT
            // 3.- 3 EN RAYA
            // 0.- VOLVER AL MENÚ PRINCIPAL
            //EN MI IMPLEMENTACIÓN VOY A JUGAR UNA PARTIDA DE CADA TIPO DE JUEGO

            // Partida 1: Adivina el Número (requiere entrada por consola)
            System.out.println("=== PARTIDA: Adivina el Número ===");
            //PEDÍRIA POR TECLADO:
            //  - UN ID_JUEGO O NOMBRE DE JUEGO
            //  - Y EN FUNCIÓN DEL JUEGO, UNO O DOS STRINGS DE JUGADORES DEL SISTEMA
            //

            ResultadoPartida r1 = hub.iniciar("A1", new String[]{"Luis"});
            System.out.println("Resultados Partida Adivina: ");
            if (r1.ganador != null ){
                System.out.print("GANADOR: ");
                System.out.println(r1.ganador.getNombre());
            }
            else {
                System.out.println("HA GANADO LA CPU");
            }
            hub.mostrarRankingGlobal();

            /////////////////////////////////////////////////////////////////////////////
            ResultadoPartida r2 = hub.iniciar("A1", new String[]{"Ana"});
            System.out.println("Resultados Partida Adivina: ");
            if (r2.ganador != null ){
                System.out.print("GANADOR: ");
                System.out.println(r2.ganador.getNombre());
            }
            else {
                System.out.println("SIN GANADOR");
            }
            hub.mostrarRankingGlobal();



            /*
            // Partida 2: Piedra Papel Tijeras (requiere entrada por consola)
            System.out.println("=== PARTIDA: PPT (Ana vs Mario) ===");
            ResultadoPartida r2 = hub.iniciar("PPT1", new String[]{"Ana", "Mario"});
            System.out.println("Resultado PPT: " + (r2.ganador != null ? ("gana " + r2.ganador.getNombre()) : "EMPATE") + "");

            // Partida 3: Tres en Raya (auto-jugado aleatorio)
            System.out.println("=== PARTIDA: Tres en Raya (Mario vs Luis) ===");
            ResultadoPartida r3 = hub.iniciar("T1", new String[]{"Mario", "Luis"});
            System.out.println("Resultado 3enRaya: " + (r3.ganador != null ? ("gana " + r3.ganador.getNombre()) : "EMPATE") + "");

            // Ranking final
            System.out.println("=== RANKING FINAL (por puntos) ===");
            Jugador[] ranking = hub.obtenerRankingGlobal();
            for (int i = 0; i < ranking.length; i++) {
                System.out.println((i+1) + ". " + ranking[i].getNombre() + " (" + ranking[i].getPuntos() + ")");
            }
*/
            System.out.println();
            System.out.println();
            System.out.println("FIN DEL JUEGO.");
        }
    }
