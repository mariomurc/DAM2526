package UT4_POOI.ClaseAlumno;

import java.sql.SQLOutput;

public class Alumno {
    String nombre;
    int edad;
    String curso;
    double notaMedia;
    private String dni;

    public Alumno(String nombre, int edad, String curso, double notaMedia, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
        this.notaMedia = notaMedia;
        this.dni = dni;
    }

    public void subirNota(double puntos){

        if(this.notaMedia+puntos <= 10){
            this.notaMedia = this.notaMedia + puntos;
            System.out.println("NOTA SUBIDA");
        }
        else
        {
           System.out.println("LA NOTA FINAL DEBE ESTAR ENTRE 0 y 10");
           System.out.println("SE ASIGNA LA NOTA MÁXIMA");
           this.notaMedia=10;

        }
    }

    public void mostrarInfo(){
        System.out.println("***** INFO DEL ALUMNO *****");
        System.out.println("NOMBRE: " + this.nombre);
        System.out.println("EDAD: " + this.edad);
        System.out.println("CURSO: " + this.curso);
        System.out.println("NOTA MEDIA: " + this.notaMedia);
    }

    public boolean estaAprobado(){
        return (this.notaMedia >= 5);

        /*if (this.notaMedia >= 5) {
            return true;
        } else {
            return false;
        }*/
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public String getDni() {
        return dni;
    }
}
