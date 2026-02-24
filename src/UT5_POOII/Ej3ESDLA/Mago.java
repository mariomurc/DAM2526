package UT5_POOII.Ej3ESDLA;


public class Mago extends Personaje{
    private Tunica tunica;
    private Sombrero sombrero;

    public Mago(String nombre, int vida, Punto p, Tunica tunica, Sombrero sombrero) {
        super(nombre, vida, p);
        this.tunica = tunica;
        this.sombrero = sombrero;
    }
    public void desplazar (int incrementoX, int incrementoY){
        incrementoX = incrementoX * 2;
        incrementoY = incrementoY * 2;
        super.desplazar(incrementoX,incrementoY);
    }
    public void sanar(){
        System.out.println("SOY UN MAGO Y TE SANO!");
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
        return super.toString() +
                "\nMago{" +
                "tunica=" + tunica.toString() +
                ", sombrero=" + sombrero.toString() +
                '}';
    }
}