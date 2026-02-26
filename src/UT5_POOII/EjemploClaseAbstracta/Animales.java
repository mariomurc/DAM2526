package UT5_POOII.EjemploClaseAbstracta;

public abstract class Animales {
    int numPatas;

    public Animales(int numPatas) {
        this.numPatas = numPatas;
    }

    void moverse(){
        System.out.println("SOY UN ANIMAL QUE SE MUEVE");
    }
    abstract void nadar();
}
