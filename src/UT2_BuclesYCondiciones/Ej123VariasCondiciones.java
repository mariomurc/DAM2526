package EjerciciosDocumentos;
//EJERCICIO 1-2-3 DE VARIAS CONDICIONES BASTANTE AMPLIADO
import java.util.Scanner;

public class Ej123VariasCondiciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String premium="";
        byte opcion;
        float costeTotal=0;

        do {
            System.out.println("---- MENÚ ----");
            System.out.println("1.- NUEVO PEDIDO");
            System.out.println("2.- MOSTRAR COSTE TOTAL PEDIDOS");
            System.out.println("3.- SALIR");
            System.out.println("ELIGE UNA DE LAS OPCIONES ANTERIORES");
            opcion = teclado.nextByte();
            switch (opcion){
                case 1:
                    System.out.println("INTRODUCE EL PRECIO DEL PEDIDO");
                    float precio = teclado.nextFloat();
                    do {
                        System.out.println("¿ERES USUARIO PREMIUM? (SI/NO)");
                        premium = teclado.next();
                    } while (!premium.equals("SI") && !premium.equals("NO"));

                    if (precio >= 50 || premium.equals("SI")){
                        System.out.println("ENVIO GRATUITO");
                    } else{
                        System.out.println("ENVIO CON COSTES ADICIONALES");
                        precio = precio + 4;
                    }
                    System.out.println("EL COSTE DEL PEDIDO ES: " + precio);
                    costeTotal = costeTotal + precio;
                    break;
                case 2:
                    System.out.println("COSTE TOTAL DE TODOS LOS PEDIDOS: " + costeTotal);
                    break;
                case 3:
                    System.out.println("FIN DEL PROGRAMA");
                    break;
                default:
                    System.out.println("LA OPCIÓN ELEGIDA NO ES VÁLIDA");
            }
        } while (opcion != 3);
    }
}
