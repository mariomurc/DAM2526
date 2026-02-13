package T2_Ejemplos;

public class CopiaArrays {
    public static void main(String[] args) {
        int arrayEdades[] = {12,15,16,18};
        int arrayEdadesCopia[];
        int nuevoArrayCopia[];

        arrayEdadesCopia=arrayEdades;
        System.out.println("ReCORRO ARRAY EDADES");
        for (int i = 0; i <arrayEdades.length ; i++) {
            System.out.println(arrayEdades[i]);
        }
        System.out.println("ReCORRO ARRAY EDADES COPIA");
        for (int i = 0; i <arrayEdadesCopia.length ; i++) {
            System.out.println(arrayEdadesCopia[i]);
        }
        arrayEdades[0] = 55;
        arrayEdades[1] = 55;
        arrayEdades[2] = 55;
        arrayEdades[3] = 55;
        System.out.println("ReCORRO ARRAY EDADES");
        for (int i = 0; i <arrayEdades.length ; i++) {
            System.out.println(arrayEdades[i]);
        }
        System.out.println("ReCORRO ARRAY EDADES COPIA");
        for (int i = 0; i <arrayEdadesCopia.length ; i++) {
            System.out.println(arrayEdadesCopia[i]);
        }

        nuevoArrayCopia = new int[arrayEdades.length];

        for (int i = 0; i < arrayEdades.length; i++) {
            nuevoArrayCopia[i] = arrayEdades[i];
        }
        arrayEdades[0] = 66666;
        arrayEdades[1] = 66666;
        arrayEdades[2] = 66666;
        arrayEdades[3] = 66666;
        System.out.println("ReCORRO ARRAY EDADES");
        for (int i = 0; i <arrayEdades.length ; i++) {
            System.out.println(arrayEdades[i]);
        }
        System.out.println("ReCORRO NUEVO ARRAY COPIA");
        for (int i = 0; i <nuevoArrayCopia.length ; i++) {
            System.out.println(nuevoArrayCopia[i]);
        }
        int arrayEdades1[] = {12,15,16,18};
        String arrayEdadesFinal[] = new String[arrayEdades1.length];
       // System.arraycopy(arrayEdades1,0, arrayEdadesFinal,
       //         1, arrayEdades1.length-1);

        System.out.println("ReCORRO ARRAY EDADES1");
        for (int i = 0; i <arrayEdades1.length ; i++) {
            System.out.println(arrayEdades1[i]);
        }
        System.out.println("ReCORRO ARRAY EDADES FINAL");
        for (int i = 0; i <arrayEdadesFinal.length ; i++) {
            System.out.println(arrayEdadesFinal[i]);
        }

    }
}
