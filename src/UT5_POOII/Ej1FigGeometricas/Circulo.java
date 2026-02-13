package UT5_POOII.Ej1FigGeometricas;

public class Circulo extends Figura {

    Punto centro;
    double radio;

    public Circulo(Punto centro, double radio, String color, boolean relleno, String tipoRelleno) {
        super(color, relleno, tipoRelleno);
        this.centro = centro;
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "centro=" + centro +
                ", radio=" + radio +
                ", color='" + color + '\'' +
                ", relleno=" + relleno +
                ", tipoRelleno='" + tipoRelleno + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                '}';
    }

    public double perimetro() {
        return 2 * 3.14 * radio;
    }

    public double diametro() {
        return radio * 2;
    }
}