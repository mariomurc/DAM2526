package UT7_Ficheros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio2A {
    public static void main(String[] args) {
        Path ruta = Paths.get(Constantes.RUTA_ENTRADA + "alumnos_notas.txt");
        float acumulador = 0f, notaMedia = 0f;
        Map<String,Float> mapaAlumnos = new HashMap<>();
        try{
            ArrayList<String> contenidoLeido = (ArrayList<String>) Files.readAllLines(ruta);
            for (String linea:contenidoLeido){
                    String [] lineatroceada = linea.split(" ");
                    for (int i = 2; i < lineatroceada.length ; i++) {
                        acumulador = acumulador + Float.parseFloat(lineatroceada[i]);
                    }
                    notaMedia = acumulador/(lineatroceada.length-2);
                    mapaAlumnos.put(lineatroceada[0] + " " + lineatroceada[1],notaMedia
                            );
                    acumulador=0f;
            }
            System.out.println("\nListado completo:");
            for (Map.Entry<String, Float> entry : mapaAlumnos.entrySet()) {
                System.out.println(entry.getKey() + " NOTA: " + entry.getValue());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
