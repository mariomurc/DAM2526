package UT5_POOII.EjemploClaseAbstracta;

public class Main {
    public static void main(String[] args) {
        Perro p = new Perro(4);
        Animales p1 = new Perro(3);
        p.nadar();
        p1.nadar();
        p.moverse();
        p1.moverse();
        Animales array[] = new Animales[5];
        array[0] = p;
        array[1] = p1;
        array[2] = new Gamba(22);
        array[3] = new Caballo(4);
        array[4] = new Perro(4);


    }
}
