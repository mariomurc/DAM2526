package T4_ObjetosI.EjerciciosTema4;

public class RectanguloMain {
    public static void main(String[] args) {

        //APARTADO D

        //APARTADO C
        Rectangulo r1 = new Rectangulo(2,5, 5, 8);
        System.out.println("(" + r1.getX1() +"," + r1.getY1() + ")"
                + " (" + r1.getX2() +"," + r1.getY2() + ")");
        r1.setX1(r1.getX1()+1);

        System.out.println("(" + r1.getX1() +"," + r1.getY1() + ")"
                + " (" + r1.getX2() +"," + r1.getY2() + ")");

        r1.setX1(r1.getX1()+6);
        System.out.println("(" + r1.getX1() +"," + r1.getY1() + ")"
                + " (" + r1.getX2() +"," + r1.getY2() + ")");



        //APARTADO B
        /*Rectangulo r1 = new Rectangulo(2,5, 5, 3);
        System.out.println("(" + r1.x1 +"," + r1.y1 + ")"
                + " (" + r1.x2 +"," + r1.y2 + ")");*/
        //APARTADO A
        /*Rectangulo r1 = new Rectangulo();
        System.out.println("(" + r1.x1 +"," + r1.y1 + ")"
                + " (" + r1.x2 +"," + r1.y2 + ")");
        r1.x1=1;
        r1.y1=6;
        r1.x2=9;
        r1.y2=15;
        System.out.println("(" + r1.x1 +"," + r1.y1 + ")"
        + " (" + r1.x2 +"," + r1.y2 + ")");

        int base = r1.x2 - r1.x1;
        int altura = r1.y2 - r1.y1;
        int area = base * altura;
        int perimetro = base * 2 + altura * 2;
        System.out.println("El area de r1 es "+area);
        System.out.println("El perimetro de r1 es "+perimetro);*/
    }

}
