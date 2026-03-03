package UT5_POOII.Ej4Mascotas;

import java.time.LocalDate;

abstract class Ave extends Mascota {

    // Atributos
    private String pico;
    private boolean vuela;

    // Constructor
    Ave(String nombre, LocalDate fechaNac, String pico, boolean vuela) {
        super(nombre, fechaNac);
        this.pico = pico;
        this.vuela = vuela;
    }

    void ponerHuevos(){
        System.out.println("TODAS las AVES ponen HUEVOS");
    }

    // MÉTODOS ABSTRACTOS
    
    abstract void muestra();

    abstract void habla();

    abstract void volar();

    // GETTERS Y SETTERS
    
    public String getPico() {
        return pico;
    }
    
    public void setPico(String pico) {
        this.pico = pico;
    }

    public boolean getVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }
}
