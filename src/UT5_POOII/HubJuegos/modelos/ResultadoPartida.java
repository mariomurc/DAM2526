
package UT5_POOII.HubJuegos.modelos;

public class ResultadoPartida {
    public final Jugador ganador; // puede ser null en caso de empate
    public ResultadoPartida(Jugador ganador) {
        this.ganador = ganador;
    }
}
