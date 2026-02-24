package UT5_POOII.Ej3ESDLA;

public class Nazgul extends Personaje{
    public Nazgul(String nombre, int vida, Punto p) {
        super(nombre, vida, p);
    }
    public void desplazar (int incrementoX, int incrementoY){
        super.desplazar(incrementoX,incrementoY);

    }
    public void gritar(){
        System.out.println("AAAAAAAAAHHHHHHHHHH");
    }
    public void avisarSauron(){
        System.out.println("SOY UN NAZGULLLLL");
    }
}
