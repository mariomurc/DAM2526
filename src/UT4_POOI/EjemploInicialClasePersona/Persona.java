package UT4_POOI.EjemploInicialClasePersona;

public class Persona {
    String nombre;
    int edad;
    boolean tieneGafas;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
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
}
