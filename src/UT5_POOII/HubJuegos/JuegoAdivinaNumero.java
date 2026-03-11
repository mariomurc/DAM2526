
package UT5_POOII.HubJuegos;

import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego implements Puntuable {
    private int numeroSecreto;
    private int intentosRestantes;
    private boolean finalizado;
    private final Scanner sc = new Scanner(System.in);

    public JuegoAdivinaNumero() {

        super("A1", "Adivina el Número", TipoJuego.SINGLEPLAYER);
    }

    @Override
    protected boolean validarJugadores(Jugador[] jugadores) {
        if (jugadores == null || jugadores.length != 1) {
            System.out.println("ESTE JUEGO REQUIERE UN ÚNICO JUGADOR");
            return false;
        }
        if (jugadores[0] == null) {
            System.out.println("JUGADOR NO ENCONTRADO");
            return false;
        }
        return true;
    }

    @Override
    public void inicializar(Jugador[] jugadores) {
        super.inicializar(jugadores);
        numeroSecreto = new Random().nextInt(50) + 1; // 1..50
        intentosRestantes = 7;
        finalizado = false;
    }

    @Override
    public void jugarTurno() {
        System.out.print("[Adivina] Introduce un número (1-100): ");
        int intento = sc.nextInt();
        intentosRestantes--;
        if (intento == numeroSecreto) {
            System.out.println("¡Correcto!");
            finalizado = true;
        } else {
            if (intento < numeroSecreto){
                System.out.println("Demasiado bajo");
            } else {
                System.out.println("Demasiado Alto");
            }
            if (intentosRestantes == 0) finalizado = true;
        }
    }

    @Override
    public boolean estaFinalizado() { return finalizado; }

    @Override
    public ResultadoPartida obtenerResultado() {
        Jugador j = jugadores[0];
        int pts = calcularPuntuacion(j);
        System.out.println("PUNTUACIÓN OBTENIDA: " + pts);
        j.setEstadisticas(pts);
        return new ResultadoPartida(j);
    }

    @Override
    public int calcularPuntuacion(Jugador j) {
        return 10 * intentosRestantes; // más puntos si acierta antes
    }
}
