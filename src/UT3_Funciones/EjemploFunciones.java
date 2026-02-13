import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class EjemploFunciones {

    public static void main(String[] args) {
        String nombre;
        int edad;
        int array[]={8,4,6,8,2};

        int sumaTotal=sumaVector(array);


        imprimeHolaMundo();
        imprimeParametros("Mario",33);
        Scanner teclado = new Scanner(System.in);
        sumarYPintar(4,7);
        int resul = sumarYDevolver(10,20);
        System.out.println("RESULTADO DEVUELTO: " + resul);

        for (int i = 0; i < 3; i++) {
            System.out.println("DIME TU NOMBRE");
            nombre=teclado.nextLine();
            System.out.println("DIME TU EDAD");
            edad=teclado.nextInt();
            imprimeParametros(nombre, edad);
            teclado.nextLine();
        }


    }


    public static int sumaVector(int v[]) {
        int suma = 0;
        for (int i = 0; i < v.length; i++)
            suma += v[i];
        return suma;
    }
    public static void sumarYPintar(int num1, int num2){
        System.out.println(num1+num2);
    }

    public static int sumarYDevolver(int num1, int num2){
        int resultado;
        resultado = num1+num2;
        return resultado;
    }

    public static void imprimeParametros(String nombre, int edad){
        System.out.println("Te llamas " + nombre + " y tu edad es: " + edad);
    }

    public static void imprimeHolaMundo(){
        System.out.println("IMPRIMO Y POCO MÁS");
    }



}