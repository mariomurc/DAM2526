package UT5_POOII.Ej4Mascotas;

import java.time.LocalDate;

class Perro extends Mascota {

    // Atributos
    private String raza;
    private boolean pulgas;

    // Constructor
    Perro(String nombre, LocalDate fechaNac, String raza, boolean pulgas) {
        super(nombre, fechaNac);
        this.raza = raza;
        this.pulgas = pulgas;
    }

    void muestra() {
        System.out.println("Nombre : " + this.getNombre());
        System.out.println("Edad   : " + this.getEdad());
        System.out.println("Estado : " + this.getEstado());
        System.out.println("Nacido : " + this.getFechaNac());
        System.out.println("Raza   : " + this.getRaza());
        System.out.println("Pulgas : " + this.getPulgas());
    }

    void habla() {
        System.out.println("GUAU GUAU");
    }

    // GETTERS Y SETTERS

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean getPulgas() {
        return pulgas;
    }

    public void setPulgas(boolean pulgas) {
        this.pulgas = pulgas;
    }
}
