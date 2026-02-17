package UT5_POOII.Ej3ESDLA;

import java.util.Random;

public class Punto {
    private int x;
    private int y;
    static int cuantosPuntos=0;

    public Punto(int x, int y) {
        if (x < 0 || y < 0){
            System.out.println("ERROR, NO SE ACEPTAN VALORES NEGATIVOS");
        } else {
            this.y = y;
            this.x = x;
            System.out.println("OBJETO PUNTO CREADO");
            cuantosPuntos++;
        }
    }

    public static Punto creaPuntoAleatorio(){
        Random r = new Random();
        int x = r.nextInt(201) - 100;
        int y = r.nextInt(201) - 100;
        //int x1 = r.nextInt(-100, 101 );
        // return new Punto(x,y);
        Punto p = new Punto(x,y);
        return p;
    }


    public void desplaza(int dx, int dy){
       /* this.setX(this.getX() + dx);
        this.setY(this.getY() + dy);
*/
        this.setXY(this.getX() + dx,this.getY() + dy);

    }
    public void setXY(int x, int y){
        if (x < 0 || y < 0){
            System.out.println("ERROR, NO SE ACEPTAN VALORES NEGATIVOS");
        } else {
            this.y = y;
            this.x = x;
            System.out.println("OBJETO PUNTO MODIFICADO");
        }

    }
    public int distancia(Punto p){
        return (int) Math.sqrt(Math.pow(p.getX()-this.getX(),2)
                             + Math.pow(p.getY()-this.getY(),2));
    }

    public void imprime(){
        System.out.println("(" + this.getX() +" ," + this.getY() + ")");
    //    System.out.println("(" + this.x +" ," + this.y + ")");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
