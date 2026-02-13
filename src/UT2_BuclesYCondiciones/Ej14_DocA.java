package T2_EjerciciosDocumentos;

public class Ej14_DocA {
    public static void main(String[] args) {
        int array[]= new int [15];
        int k=0;

        for (int i = 1; i <= 5; i++) {
            for ( int j=0; j < i; j++) {
                array[k]=i;
                k++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
