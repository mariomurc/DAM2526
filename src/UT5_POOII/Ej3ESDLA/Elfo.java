package UT5_POOII.Ej3ESDLA;

public class Elfo /*extends Personaje*/{
    Carcaj carcajElfo;
    Arco arcoElfo;

    public Elfo(String nombre, int vida, int posX, int posY, Carcaj carcajElfo, Arco arcoElfo) {
    //    super(nombre, vida, posX, posY);

        this.carcajElfo = carcajElfo;
        this.arcoElfo = arcoElfo;
    }

    public Carcaj getCarcajElfo() {
        return carcajElfo;
    }

    public void setCarcajElfo(Carcaj carcajElfo) {
        this.carcajElfo = carcajElfo;
    }

    public Arco getArcoElfo() {
        return arcoElfo;
    }

    public void setArcoElfo(Arco arcoElfo) {
        this.arcoElfo = arcoElfo;
    }

    @Override
    public String toString() {
        return "Elfo{" +
                "carcajElfo=" + carcajElfo.toString() +
                ", arcoElfo=" + arcoElfo.toString() +
                '}';
    }
}
