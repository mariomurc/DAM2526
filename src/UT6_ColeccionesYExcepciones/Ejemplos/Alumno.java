package UT6_ColeccionesYExcepciones.Ejemplos;
import java.util.Objects;
public class Alumno {


        private String nombre;
        private int edad;
        public Alumno(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }
        @Override
        public String toString() {
            return nombre + " (" + edad + ")";
        }
        @Override


        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Alumno))
                return false;
            Alumno alumno = (Alumno) o;
            return edad == alumno.edad &&
                    Objects.equals(nombre, alumno.nombre);
        }
        @Override
        public int hashCode() {
            return Objects.hash(nombre, edad);
        }

}
