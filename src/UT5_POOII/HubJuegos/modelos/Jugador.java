
package UT5_POOII.HubJuegos.modelos;

public class Jugador {
    private final String nombre;
    private EstadisticasJugador estadisticas;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.estadisticas = new EstadisticasJugador();
    }

    public String getNombre() {
        return nombre;
    }


    public void setEstadisticas(int puntos) {
        estadisticas.setPuntos(puntos);

    }

    public EstadisticasJugador getEstadisticas() {
        return estadisticas;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", estadisticas=" + estadisticas +
                '}';
    }
}
