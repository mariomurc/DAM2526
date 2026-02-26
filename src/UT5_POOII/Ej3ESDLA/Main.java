package UT5_POOII.Ej3ESDLA;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Personaje per[] = new Personaje[4];
        per[0] = crearMago("Antonio");
        crearMago("María");

        per[1] = crearElfo("Julián");
        crearElfo("Laura");

        per[2] = crearOrco("Marina");
        crearOrco("Gael");

        per[3] = crearNazgul("Elian");
        crearNazgul("Candela");

        for (int i = 0; i < per.length ; i++) {
            System.out.println(per[i].toString());
        }




    }
    public static Elfo crearElfo(String nombre){
        Arco a1 = new Arco(3.4,6.7);
        Random r = new Random();
        Carcaj c;
        int aleatorio = r.nextInt(0,21);
        System.out.println("VALOR ALEATORIO: " + aleatorio);
        if (aleatorio == 0){
            c = new Carcaj("CUERO");
        } else{
            Flecha arrayF[] = new Flecha[20];
            for (int i = 0; i < aleatorio; i++) {
                arrayF[i]=new Flecha("verde",22,true);
            }
            c = new Carcaj("PAPEL",arrayF);
        }

        Elfo e1 = new Elfo(nombre,100,new Punto(0,0),c,a1);
        return e1;
    }
    public static Orco crearOrco(String nombre){
        Orco o = new Orco(nombre, 100, new Punto(0,0));
        return o;
    }
    public static Mago crearMago(String nombre){
        Mago m = new Mago(nombre,100,new Punto(0,0),
                new Tunica("VERDE","SEDA"),new Sombrero(23,4));
        return m;
    }
    public static Nazgul crearNazgul(String nombre){
        Nazgul n = new Nazgul(nombre, 100, new Punto(0,0));
        return n;
    }
}
