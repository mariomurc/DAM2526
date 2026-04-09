
package UT5_POOII.HubJuegos.interfaces;


import UT5_POOII.HubJuegos.modelos.Jugador;
import UT5_POOII.HubJuegos.modelos.ResultadoPartida;

public interface Jugable {
    void inicializar(Jugador[] jugadores);
    void jugarTurno();
    boolean estaFinalizado();
    ResultadoPartida obtenerResultado();
}
