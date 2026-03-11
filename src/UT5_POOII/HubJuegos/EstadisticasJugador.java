package UT5_POOII.HubJuegos;

public class EstadisticasJugador {
    private int puntos;

    public EstadisticasJugador() {
        this.puntos = 0;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getPuntos() {
        return puntos;
    }

    @Override
    public String toString() {
        return "EstadisticasJugador{" +
                ", puntos=" + puntos +
                '}';
    }
}
