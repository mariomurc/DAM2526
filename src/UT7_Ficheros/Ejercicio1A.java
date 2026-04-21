package UT7_Ficheros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio1A {
    public static void main(String[] args) {
        Path ruta = Paths.get(Constantes.RUTA_ENTRADA + "numeros.txt");
        int numeroMasAlto = 0;
        int numeroMasBajo = 0;

        try {
            ArrayList<String> contenidoLeido = (ArrayList<String>) Files.readAllLines(ruta);
            List<Integer> contenidoNumeros = contenidoLeido.stream()
                    .map(Integer::valueOf) // O Integer::parseInt
                    .collect(Collectors.toList());
            Collections.sort(contenidoNumeros);
            System.out.println("Con la lista de Enteros");
            System.out.println(contenidoNumeros.getFirst());
            System.out.println(contenidoNumeros.getLast());

            System.out.println("Con la lista de Strings");
            System.out.println(Collections.min(contenidoNumeros));
            System.out.println(Collections.max(contenidoNumeros));


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
