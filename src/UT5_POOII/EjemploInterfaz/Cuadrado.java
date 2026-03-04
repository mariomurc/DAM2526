package UT5_POOII.EjemploInterfaz;

public class Cuadrado implements Figura {
    private float lado;

    public Cuadrado(float lado) {
        this.lado = lado;
    }

    @Override
    public float area() {
        System.out.println("SOY CUADRA");
        return lado*lado;
    }
}
