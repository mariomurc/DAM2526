package UT6_ColeccionesYExcepciones.Ejemplos;

public class Persona1 {
    private String nombre;
    private String dni;
    public Persona1(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
  //  @Override
/*    public boolean equals(Object obj) {
        if (this == obj) return true; // mismo objeto
        if (obj == null || getClass() != obj.getClass()) return false;

        Persona1 persona = (Persona1) obj;
        return dni.equals(persona.dni); // comparamos por DNI
}
@Override
public int hashCode() {
    return dni.hashCode(); // hash basado en DNI
}*/
}
