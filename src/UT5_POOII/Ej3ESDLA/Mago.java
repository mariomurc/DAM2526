package UT5_POOII.Ej3ESDLA;


public class Mago /*extends Personaje*/{
    private Tunica tunica;
    private Sombrero sombrero;

    public Mago(String nombre, int vida, Punto punto, Tunica tunica, Sombrero sombrero) {
        //super(nombre, vida, punto);
        this.tunica = tunica;
        this.sombrero = sombrero;
    }

    public Tunica getTunica() {
        return tunica;    }
    public void setTunica(Tunica tunica) {
        this.tunica = tunica;    }
    public Sombrero getSombrero() {
        return sombrero;    }
    public void setSombrero(Sombrero sombrero) {
        this.sombrero = sombrero;    }

    @Override
    public String toString() {
        return /*super.toString() +*/
                "\nMago{" +
                "tunica=" + tunica.toString() +
                ", sombrero=" + sombrero.toString() +
                '}';
    }
}