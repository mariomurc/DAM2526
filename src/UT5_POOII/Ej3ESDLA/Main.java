package UT5_POOII.Ej3ESDLA;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Mago m = new Mago("mario",100,new Punto(0,0),
                new Tunica("VERDE","SEDA"),new Sombrero(23,4));

        Punto p1 = new Punto(3,4);
        Tunica t1 = new Tunica("AZUL", "ALGODON");
        Sombrero s1 = new Sombrero(33,8);
        Mago m1 = new Mago("Antonio", 100, p1,t1,s1);

        System.out.println(m.toString());

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

        Elfo e1 = new Elfo("Laura",100,new Punto(0,0),c,a1);
        System.out.println(e1.toString());



    }
}
