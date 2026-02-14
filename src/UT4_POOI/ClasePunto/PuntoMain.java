package T4_ObjetosI.EjerciciosTema4;

public class PuntoMain {
    public static void main(String[] args) {
        //APARTADO E
        Punto p1 = new Punto(3,6);
        Punto p2 = new Punto(6,16);
        Punto p3 = new Punto(1,8);


        Punto p4 = Punto.creaPuntoAleatorio();
        System.out.println("OBJETOS CREADOS:" + Punto.cuantosPuntos);
        p4.imprime();
        //APARTADO D
        /*Punto p1 = new Punto(3,6);
        Punto p2 = new Punto(6,16);
        Punto p3 = new Punto(1,8);



        p1.imprime();
        p2.imprime();
        p1.desplaza(5,8);
        p2.desplaza(3,1);
        p1.imprime();
        p2.imprime();

        System.out.println("DIST DE P1 A P2: " + p1.distancia(p2));
        System.out.println("DIST DE P2 A P1: " + p2.distancia(p1));
        System.out.println("DIST DE P1 A P3: " + p1.distancia(p3));
*/

        // APARTADO C
        /*Punto p1 = new Punto(3,6);
        System.out.println("(" + p1.getX() +" ," + p1.getY() + ")");
        int x = p1.getX() + 6;
        p1.setX(x);
        p1.setY(p1.getY() + 8);
        System.out.println("(" + p1.getX() +" ," + p1.getY() + ")");
        p1.setX(-8);
        System.out.println("(" + p1.getX() +" ," + p1.getY() + ")");
*/

        // APARTADO B
        /*Punto p1 = new Punto(-3,6);
        System.out.println("(" + p1.x +" ," + p1.y + ")");*/
        // APARTADO A
     /*   Punto p1 = new Punto();
        Punto p2 = new Punto();
        System.out.println("(" + p1.x +" ," + p1.y + ")");
        p1.x = 5;
        p1.y = 9;
        System.out.println("(" + p1.x +" ," + p1.y + ")");
        p1.x += 3;
        System.out.println("(" + p1.x +" ," + p1.y + ")");*/
    }
}
