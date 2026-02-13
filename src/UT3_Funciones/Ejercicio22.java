package T3_Funciones;

public class Ejercicio22 {
    public static void main(String[] args) {
        String[] alumnos = {
                "PACO|49|DAW|8.4",
                "LUCIA|22|DAM|7.9",
                "MARIO|31|ASIR|6.5",
                "ANA|18|DAW|9.1",
                "RAUL|27|DAM|5.8",
                "SOFIA|24|ASIR|7.2",
                "CARLOS|35|DAW|6.9",
                "ELENA|20|DAM|8.7",
                "JORGE|29|ASIR|7.0",
                "BEATRIZ|23|DAW|9.4"
        };

        mostrarNombres(alumnos);
        int mediaEdades = obtenerMediaEdades(alumnos);
        System.out.println("LA MEDIA DE TODOS LOS ALUMNOS ES: " + mediaEdades);

        obtenerNotaMaxima();
        /*
        mostrarAlumnosPorCiclo();
        mostrarAlumnosPorCiclo();
        */


    }

    public static void mostrarLinea(String [] linea){
        for (int i = 0; i < linea.length; i++) {
            System.out.println("DATO " + (i+1) +": "+ linea[i]);
        }
    }

    //RECIBIRÁ UNA LINEA DEL ARRAY DE ALUMNOS Y DEVOLVERÁ UN ARRAY DE STRINGS CON
    //LOS CAMPOS TROCEADOS
    public static String[] parsearLinea(String linea){
        String array[] = new String[4];
        for (int i = 0; i < 3; i++) {
            array[i] =linea.substring(0,linea.indexOf("|"));
            linea = linea.substring(linea.indexOf("|")+1,linea.length());
            //System.out.println(linea);
        }
        array[3]=linea;

        return array;
    }

    //RECIBIRÁ UN ARRAY CON UNA LINEA TROCEADA Y DEVOLVERÁ EL VALOR DE LA EDAD
    public static int obtenerEdadDeLinea(String[] lin){
        int edad = Integer.parseInt(lin[1]);
        return edad;
    }
    //RECIBIRÁ UN ARRAY CON UNA LINEA TROCEADA Y DEVOLVERÁ EL VALOR DE LA NOTA
    public static double obtenerNotaDeLinea(String[] lin){
        double nota = Double.parseDouble(lin[3]);
        return 0.0;
    }
    //RECIBIRÁ EL ARRAY COMPLETO DE ALUMNOS Y MOSTRARÁ ÚNICAMENTE LOS NOMBRES DE LOS
    //ALUMNOS
    public static void mostrarNombres(String[] alumnos){
        String [] linea = new String[4];
        for (int i = 0; i < alumnos.length ; i++) {
            linea = parsearLinea(alumnos[i]);
            System.out.println("NOMBRE ALUMNO " + (i+1) + ": " + linea[0]);
        }
    }

    //RECIBIRÁ EL ARRAY COMPLETO DE ALUMNOS Y RETORNARÁ LA MEDIA DE LAS EDADES DE TODOS
    //LOS ALUMNOS
    public static int obtenerMediaEdades(String[] alumnos){
        String [] linea = new String[4];
        int edadAcumulada=0;
        for (int i = 0; i < alumnos.length ; i++) {
            linea = parsearLinea(alumnos[i]);
            edadAcumulada=edadAcumulada + obtenerEdadDeLinea(linea);
        }
        return edadAcumulada/alumnos.length;
    }
    //RECIBIRÁ EL ARRAY COMPLETO DE ALUMNOS Y RETORNARÁ LA NOTA MÁXIMA DE TODOS LOS ALUMNOS
    public static double obtenerNotaMaxima(String[] alumnos){
        return 0;
    }

    //RECIBIRÁ EL ARRAY COMPLETO DE ALUMNOS Y MOSTRARÁ LOS ALUMNOS ORDENADOS POR CICLO
    public static void mostrarAlumnosPorCiclo(String[] alumnos){

    }
    //RECIBIRÁ EL ARRAY COMPLETO DE ALUMNOS Y MOSTRARÁ LOS ALUMNOS QUE CURSAN
    //EL CICLO RECIBIDO POR PARÁMETRO.
    public static void mostrarAlumnosPorCiclo(String[] alumnos, String ciclo){

    }
}
