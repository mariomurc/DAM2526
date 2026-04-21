package UT7_Ficheros;

import UT7_Ficheros.clasesAdicionales.Cancion;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Ejercicio0A {
    public static void main(String[] args) {
        Path ruta = Paths.get(Constantes.RUTA_ENTRADA+"canciones.txt");
        ArrayList<Cancion> canciones = new ArrayList<>();
        try {
            ArrayList<String> lineas = (ArrayList<String>) Files.readAllLines(ruta);

            for (String linea : lineas) {
                String[] partes = linea.split(":");
                String titulo = partes[1];
                String artista = partes[2];
                int duracion = Integer.parseInt(partes[3]);
                Cancion cancion = new Cancion(titulo, artista, duracion);
                canciones.add(cancion);
            }
        }catch (Exception e){
            System.out.println("No existe el archivo");
            System.out.println(e.getMessage());
        }

        for (Cancion cancion : canciones) {
            System.out.println(cancion.getTitulo());
            System.out.println(cancion.getArtista());
            System.out.println(cancion.getDuracion());
            System.out.println();
        }
    }

}

