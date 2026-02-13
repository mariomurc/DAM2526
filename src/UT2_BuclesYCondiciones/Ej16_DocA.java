package T2_EjerciciosDocumentos;

import java.util.Arrays;

public class Ej16_DocA {
    public static void main(String[] args) {
        int array[]= new int [15];
        int k=0;

        for (int i = 1; i <= 5; i++) {
            Arrays.fill(array,k,i,i);
            Arrays.fill(array,i,k,i);
            Arrays.fill(array,k+i,i,i);
            Arrays.fill(array,k,i+k,i);
            k++;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
