package T2_Ejemplos;

import java.util.Arrays;

public class ArrayAlReves {
    public static void main(String[] args) {
        int arrayEdades[] = {121,115,163,18};
        int arrayCopia[] = new int[4];
        Arrays.sort(arrayEdades);
        int posDestino=0;
        for (int i = arrayEdades.length-1; i >= 0 ; i--) {
            arrayCopia[posDestino]= arrayEdades[i];
            posDestino++;
        }
        for (int i = 0; i < arrayCopia.length; i++) {
            System.out.println(arrayCopia[i]);
        }
    }
}
