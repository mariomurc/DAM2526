package UT5_POOII.Ej3ESDLA;

public class Elfo extends Personaje{
    Carcaj carcajElfo;
    Arco arcoElfo;

    public Elfo(String nombre, int vida, Punto p, Carcaj carcajElfo, Arco arcoElfo) {
        super(nombre, vida, p);
        this.carcajElfo = carcajElfo;
        this.arcoElfo = arcoElfo;
    }
    public void desplazar (int incrementoX, int incrementoY){
        incrementoX = incrementoX + 3;
        incrementoY = incrementoY + 3;
        super.desplazar(incrementoX,incrementoY);
    }
    public void sanar(){
        System.out.println("SOY UN ELFO Y TE SANO!");
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
