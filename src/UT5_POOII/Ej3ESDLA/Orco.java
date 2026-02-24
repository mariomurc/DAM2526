package UT5_POOII.Ej3ESDLA;

public class Orco extends Personaje{

    public Orco(String nombre, int vida, Punto p) {
        super(nombre, vida, p);
    }
    public void desplazar (int incrementoX, int incrementoY){
            incrementoX = incrementoX + 1;
            incrementoY = incrementoY + 1;
            super.desplazar(incrementoX,incrementoY);
    }
    public void gritar(){
        System.out.println("aaaaahhhhhh");
    }
    public void avisarSauron(){
        System.out.println("SOY UN ORCOOOOOOOO");
    }
}
