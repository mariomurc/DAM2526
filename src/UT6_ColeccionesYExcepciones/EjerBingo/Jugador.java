package UT6_ColeccionesYExcepciones.EjerBingo;

import java.util.ArrayList;

public class Jugador {
    private String nif;
    private ArrayList<Carton> listaCartones;

    public Jugador(String nif) {
        this.nif = nif;
        this.listaCartones = new ArrayList<>();
    }
    public String getNif() {
        return nif;
    }

    public ArrayList<Carton> getListaCartones() {
        return listaCartones;
    }
    public void setListaCartones(ArrayList<Carton> listaCartones) {
        this.listaCartones = listaCartones;
    }
    public void addCarton(Carton c){
        this.listaCartones.add(c);
    }

    @Override
    public String toString() {
        return "Jugadores{" +
                "nif='" + nif + '\'' +
                ", listaCartones=" + listaCartones +
                '}';
    }
}
