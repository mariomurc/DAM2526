package T2_Ejemplos;

public class ArrayBi {
    public static void main(String[] args) {
        int matriz[][] = new int[4][3];
        int valor=0;
        //rellenar la matriz
        System.out.print("¿FILAS O COLUMNAS?: ");
        System.out.println(matriz.length);
        System.out.print("¿FILAS O COLUMNAS?: ");
        System.out.println(matriz[0].length);
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j]=valor;
                valor++;
            }
        }
        //mostrar la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Pos("+i+","+j+"): "+ matriz[i][j] +" " );
            }
            System.out.println();
        }

        //mostrar la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] +" " );
            }
            System.out.println();
        }

    }
}
