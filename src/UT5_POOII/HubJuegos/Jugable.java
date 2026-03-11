
package UT5_POOII.HubJuegos;



public interface Jugable {
    void inicializar(Jugador[] jugadores);
    void jugarTurno();
    boolean estaFinalizado();
    ResultadoPartida obtenerResultado();
}
