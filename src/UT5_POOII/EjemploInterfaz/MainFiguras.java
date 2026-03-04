package UT5_POOII.EjemploInterfaz;

public class MainFiguras {
    public static void main(String[] args) {
        Figura arrayFiguras[] = new Figura[5];
        arrayFiguras[0] = new Circulo(5);
        arrayFiguras[1] = new Rectang(5,7);
        arrayFiguras[2] = new Cuadrado(5);
        arrayFiguras[3] = new Circulo(8);
        arrayFiguras[4] = new Circulo(12);

        for (int i = 0; i < arrayFiguras.length; i++) {
            System.out.println(arrayFiguras[i].area());

            if (arrayFiguras[i] instanceof Rectang){
                System.out.println(((Rectang) arrayFiguras[i]).perimetro());
            }
        }



    }
}
