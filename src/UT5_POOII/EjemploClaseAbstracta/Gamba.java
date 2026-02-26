package UT5_POOII.EjemploClaseAbstracta;

public class Gamba extends Animales {
    public Gamba(int numPatas) {
        super(numPatas);
    }

    public void nadar(){
        System.out.println("La gamba nada que te cagas");
    }
}
