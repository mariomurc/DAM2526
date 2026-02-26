package UT5_POOII.EjemploClaseAbstracta;

public class Perro extends Animales{
    public Perro(int numPatas) {
        super(numPatas);
    }

    public void nadar(){
        System.out.println("El perro nada aceptablemente");
    }
}
