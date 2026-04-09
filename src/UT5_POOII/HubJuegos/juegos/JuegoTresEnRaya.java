
package UT5_POOII.HubJuegos.juegos;


import UT5_POOII.HubJuegos.modelos.Jugador;
import UT5_POOII.HubJuegos.modelos.ResultadoPartida;
import UT5_POOII.HubJuegos.modelos.TipoJuego;
import UT5_POOII.HubJuegos.interfaces.Puntuable;

public class JuegoTresEnRaya extends Juego implements Puntuable {
    private char[][] tablero = new char[3][3];
    private int turno;
    private Jugador ganador;
    private boolean finalizado;

    public JuegoTresEnRaya() {
        super("T1", "Tres en Raya", TipoJuego.VERSUS);
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

    @Override
    public void inicializar(Jugador[] jugadores) {
        super.inicializar(jugadores);
        tablero = new char[3][3];
        turno = 0;
        ganador = null;
        finalizado = false;
    }

    @Override
    public void jugarTurno() {
        Jugador actual = jugadores[turno % 2];
        char ficha = (turno % 2 == 0 ? 'X' : 'O');

        int fila = (int)(Math.random() * 3);
        int col  = (int)(Math.random() * 3);

        if (tablero[fila][col] == 0) {
            tablero[fila][col] = ficha;
            if (hayGanador(ficha)) {
                ganador = actual;
                finalizado = true;
            } else if (++turno == 9) {
                finalizado = true; // empate
            }
        }
    }

    private boolean hayGanador(char f) {
        for (int i = 0; i < 3; i++)
            if (tablero[i][0] == f && tablero[i][1] == f && tablero[i][2] == f) return true;
        for (int j = 0; j < 3; j++)
            if (tablero[0][j] == f && tablero[1][j] == f && tablero[2][j] == f) return true;
        return (tablero[0][0] == f && tablero[1][1] == f && tablero[2][2] == f) ||
               (tablero[0][2] == f && tablero[1][1] == f && tablero[2][0] == f);
    }

    @Override
    public boolean estaFinalizado() { return finalizado; }

    @Override
    public ResultadoPartida obtenerResultado() {
        //if (ganador != null) ganador.agregarPuntos(calcularPuntuacion(ganador));
        return new ResultadoPartida(ganador);
    }

    @Override
    public int calcularPuntuacion(Jugador j) { return 5; }
}
