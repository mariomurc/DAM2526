package UT6_ColeccionesYExcepciones.EjBingo;

import java.util.HashSet;

public class Carton {
    private int idCarton;
    private HashSet<Integer> cartonJugador;
    private int aciertos;


    public Carton(int idCarton) {
        this.idCarton = idCarton;
        this.cartonJugador = new HashSet<>();
        this.aciertos=0;
    }
    public void setCartonJugador(HashSet<Integer> carton){
        this.cartonJugador = carton;
    }

    public int getIdCarton() {
        return idCarton;
    }

    public HashSet<Integer> getCartonJugador() {
        return cartonJugador;
    }

    public int getAciertos() {
        return aciertos;
    }

    @Override
    public String toString() {
        return "Carton{" +
                "idCarton=" + idCarton +
                ", cartonJugador=" + cartonJugador +
                '}';
    }
}

