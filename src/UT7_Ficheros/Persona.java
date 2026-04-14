package UT7_Ficheros;

public class Persona {
    private int id;
    private String nombre;
    private String dni;

    public Persona(int id,String nombre, String dni) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}
