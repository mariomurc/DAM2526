package UT5_POOII.Ej4Mascotas;

import java.time.LocalDate;
import java.time.Period;

abstract class Mascota {

    // Atributos
    private String nombre;
    private int edad;
    private String estado;
    private LocalDate fechaNac;

    // Constructor
    public Mascota(String nombre,  LocalDate fechaNac) {
        this.nombre = nombre;
        this.edad = Period.between(fechaNac,LocalDate.now()).getYears();
        this.estado = "VIVO";
        this.fechaNac = fechaNac;
    }

    // MÉTODOS ABSTRACTOS

    abstract void muestra();

    abstract void habla();

    // OTROS MÉTODOS
    
    public void cumpleaños() {
        this.edad = this.edad + 1;
    }

    public void morir() {
        this.estado = "Muerto";
    }

    // GETTERS Y SETTERS
    
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

}
