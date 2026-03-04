package UT5_POOII.EjemploInterfaz;

public class Circulo implements Figura{
    private float diametro;

    public Circulo(float diametro) {
        this.diametro = diametro;
    }

    @Override
    public float area() {
        System.out.println("SOY CIR");
        return diametro/2 * diametro/2 * PI;
    }
}
