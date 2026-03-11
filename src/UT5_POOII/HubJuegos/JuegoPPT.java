
package UT5_POOII.HubJuegos;

import java.util.Scanner;

public class JuegoPPT extends Juego implements Puntuable {
    private final Scanner sc = new Scanner(System.in);
    private Jugador ganador;
    private boolean finalizado;

    public JuegoPPT() {
        super("PPT1", "Piedra Papel Tijeras", TipoJuego.VERSUS);
    }

    @Override
    protected boolean validarJugadores(Jugador[] jugadores) {
        if (jugadores == null || jugadores.length != 2) {
            System.out.println("ESTE JUEGO REQUIERE DOS JUGADORES");
            return false;
        }
        if (jugadores[0] == null || jugadores[1] == null) {
            System.out.println("JUGADORES NO ENCONTRADOS");
            return false;
        }
        return true;
    }

    private Movimiento leerMovimiento(Jugador j) {
        System.out.println("[PPT] " + j.getNombre() + ": 1) Piedra  2) Papel  3) Tijeras");
        int v = sc.nextInt();
        switch (v) {
            case 1: return Movimiento.PIEDRA;
            case 2: return Movimiento.PAPEL;
            case 3: return Movimiento.TIJERAS;
            default: return Movimiento.PIEDRA; // fallback simple
        }
    }

    private int comparar(Movimiento a, Movimiento b) {
        if (a == b) return 0;
        if ((a == Movimiento.PIEDRA && b == Movimiento.TIJERAS) ||
            (a == Movimiento.PAPEL  && b == Movimiento.PIEDRA) ||
            (a == Movimiento.TIJERAS&& b == Movimiento.PAPEL)) return 1;
        return -1;
    }

    @Override
    public void jugarTurno() {
        Movimiento m1 = leerMovimiento(jugadores[0]);
        Movimiento m2 = leerMovimiento(jugadores[1]);
        int r = comparar(m1, m2);
        if (r == 0) {
            ganador = null; // empate
        } else {
            ganador = (r > 0) ? jugadores[0] : jugadores[1];
        }
        finalizado = true;
    }

    @Override
    public boolean estaFinalizado() { return finalizado; }

    @Override
    public ResultadoPartida obtenerResultado() {
        //lo he planteado para que solo haya un ganador. Si ganador es null => EMPATE
        if (ganador != null)
            ganador.setEstadisticas(calcularPuntuacion(ganador));
        return new ResultadoPartida(ganador);
    }

    @Override
    public int calcularPuntuacion(Jugador j) { return 3; }
}
