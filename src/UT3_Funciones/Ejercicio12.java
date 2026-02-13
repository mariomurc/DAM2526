package T3_Funciones;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce los kilómetros: ");
        double km = teclado.nextDouble();

        while (km <= 0) {
            System.out.println("EEROR: Introduce un número válido");
            System.out.println("Introduce los kilómetros: ");
            km = teclado.nextDouble();
        }

        System.out.println("¿A que quieres convertirlo? (Millas o MillasNauticas) ");
        String medida = teclado.next();

        double millas = aMillas(km, medida);

        if (medida.equals("Millas")) {
            System.out.println(km + " km son " + millas + " millas");
        } else if (medida.equals("MillasNauticas")) {
            System.out.println(km + " km son " + millas + " millas nauticas");
        }
    }

    public static double aMillas(double km, String medida) {
        if (medida.equals("Millas")) {
            return km * 0.621371;
        } else if (medida.equals("MillasNauticas")) {
            return km * 0.539957;
        }
        return km;
    }
}
