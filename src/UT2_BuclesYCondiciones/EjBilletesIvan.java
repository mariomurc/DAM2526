package EjerciciosDocumentos;
import java.util.Scanner;

public class EjBilletesIvan {
    public static void main(String[] args) {
            int billetes500 = 0;
            byte billetes200 = 0;
            byte billetes100 = 0;
            byte billetes50 = 0;
            byte billetes20 = 0;
            byte billetes10 = 0;
            byte billetes5 = 0;
            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduzca una cantidad de dinero que sea multiplo de 5");
            int cantTotal = teclado.nextInt();
            int cant = cantTotal;
            int cantDurums;
            if (cant%5 == 0)
            {
                cantDurums = cant/7;
                System.out.println("Perfecto, vamos a desglosarlo para que tengas tus " + cant + " con la menor cantidad de billetes posible: ");
                do {
                    if (cant >= 500){
                        cant = cant - 500;
                        billetes500++;
                    }
                    else if (cant >= 200){
                        cant = cant - 200;
                        billetes200++;
                    }
                    else if (cant >= 100){
                        cant = cant - 100;
                        billetes100++;
                    }
                    else if (cant >= 50){
                        cant = cant - 50;
                        billetes50++;
                    }
                    else if (cant >= 20){
                        cant = cant - 20;
                        billetes20++;
                    }
                    else if (cant >= 10){
                        cant = cant - 10;
                        billetes10++;
                    }
                    else {
                        cant = cant - 5;
                        billetes5++;
                    }
                }while (cant != 0);
                System.out.println("Con " + cantTotal );
                System.out.println(billetes500 + " billetes de 500 ");
                System.out.println(billetes200 + " billetes de 200 ");
                System.out.println(billetes100 + " billetes de 100 ");
                System.out.println(billetes50 + " billetes de 50, " + billetes20 + " billetes de 20, " + billetes10 + " billetes de 10 y " + billetes5 + " billetes de 5 ");
                System.out.println("Además te puedes comprar " + cantDurums + " menús durums");
            }else {
                System.out.println("Esa cantidad no vale");
            }
        }
    }

