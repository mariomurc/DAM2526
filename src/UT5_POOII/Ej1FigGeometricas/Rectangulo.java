package UT5_POOII.Ej1FigGeometricas;

public class Rectangulo extends Figura {

    Punto p1;
    Punto p2;

    public Rectangulo(Punto p1, Punto p2, String color, boolean relleno, String tipoRelleno) {
        super(color, relleno, tipoRelleno);
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Rectangulo{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }

    public double perimetro() {
        double ancho = Math.abs(p2.x - p1.x);
        double alto = Math.abs(p2.y - p1.y);
        return 2 * (ancho + alto);
    }
}