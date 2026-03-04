package UT5_POOII.EjemploInterfaz;

public class Rectang implements Figura {
    private float lado;
    private float altura;

    public Rectang(float lado, float altura) {
        this.lado = lado;
        this.altura = altura;
    }

    @Override
    public float area() {
        System.out.println("SOY RECT");
        return lado*altura;
    }

    public float perimetro(){
        System.out.println("RECTAN PERIM");
        return lado*2+altura*2;
    }
}
