package UT7_Ficheros;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class MainFicheros {
    public static void main(String[] args) {
        escribirFichero();
        leerFichero();
        List<Persona> personas = leerPersonasDesdeArchivo("persona.txt");
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }

    public static void escribirFichero(){
        Path path = Paths.get("demo.txt");
        String contenido = " desde Linux este es OTROOOOOOO EN MAYUSCULAS ejemplo de escritura!\n";
        try {
            Files.write(path, contenido.getBytes(),StandardOpenOption.APPEND);
            System.out.println("Archivo creado y escrito satisfactoriamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void leerFichero(){
        String nombreCompletoFichero = "fichero.txt";
        Path rutaFichero = Paths.get(nombreCompletoFichero);
        try {
            ArrayList<String> lineas = (ArrayList<String>)Files.readAllLines(rutaFichero);
            System.out.println("Vamos a mostrar el contenido del fichero: " + nombreCompletoFichero);
            for(String linea : lineas){
                System.out.println(linea);
            }
            for (int i = 0; i < lineas.size(); i++) {
                lineas.set(i, lineas.get(i)+1);
            }
            for(String linea : lineas){
                System.out.println(linea);
            }

            System.out.println("[Final del fichero]");
        } catch (NoSuchFileException e) {
            System.err.println("Ese fichero no existe");
        } catch (FileSystemException e) {
            System.err.println("Excepcion de sistema de ficheros " + e);
        } catch (IOException e) {
            System.err.println("Excepcion generica al consultar el fichero " + e);
        }

    }



    public static List<Persona> leerPersonasDesdeArchivo(String nombreArchivo){
        Path path = Paths.get(nombreArchivo);
        List<Persona> personas = new ArrayList<>();
        try {
            List<String> lineas = Files.readAllLines(path);
            for (String linea : lineas) {
                String[] partes = linea.split(", ");
                int id = Integer.parseInt(partes[0]);
                String nombre = partes[1];
                String dni = partes[2];
                Persona persona = new Persona(id, nombre, dni);
                personas.add(persona);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return personas;
    }


}
