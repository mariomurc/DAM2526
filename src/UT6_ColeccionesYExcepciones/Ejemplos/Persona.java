package UT6_ColeccionesYExcepciones.Ejemplos;

import java.util.Objects;

public class Persona {
    String nombre;
    int edad;
    boolean tieneGafas;
    String dni;

/*
    public Persona(String dni, int edad) throws InvalidDniException, InvalidEdadException {
        if (!dni.matches("^[0-9]{8}[A-Z]")) {
            throw new InvalidDniException("DNI no válido: " + dni);
        }
        if (edad < 0) {
            throw new InvalidEdadException("Edad no válida: " + edad);
        }
        this.dni = dni;
        this.edad = edad;
    }
*/
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) throws Exception {
        if (edad < 0){
            //System.out.println("ERROR");
            throw new Exception("Error, Edad Negativa");
        } else {
            this.edad = edad;
        }
    }
    public void setTieneGafas(boolean tieneGafas) {
        this.tieneGafas = tieneGafas;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public boolean isTieneGafas() {
        return tieneGafas;
    }
    public void mostrarPersona(){
        System.out.println("NOMBRE: " + nombre);
        System.out.println("EDAD: " + edad);
        System.out.println("¿TIENE GAFAS?: " + tieneGafas);
    }
    public boolean esMayorEdad(){
        return (edad>=18);
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(nombre, persona.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, tieneGafas);
    }
}
