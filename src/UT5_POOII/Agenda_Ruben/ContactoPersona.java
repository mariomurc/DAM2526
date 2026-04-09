package UT5_POOII.Agenda_Ruben;

public class ContactoPersona extends Contacto{
    private String cumpleaños;

    public ContactoPersona(String nombre, String numTel, String cumpleaños) {
        super(nombre, numTel);
        this.cumpleaños = cumpleaños;
    }

    public String getCumpleaños() {return cumpleaños;}
    public void setCumpleaños(String cumpleaños) {this.cumpleaños = cumpleaños;}


    public String getTelefono() {
        String numTelefono;
        numTelefono = getNumTel().substring(0,3) + " " + getNumTel().substring(3,6) + " " + getNumTel().substring(6,9);
        return numTelefono;
    }

    public void llamar() {
        System.out.println("LLAMANDO A LA PERSONA " + getNombre() + " AL NÚMERO " + getTelefono() + " ...");
    }
}
