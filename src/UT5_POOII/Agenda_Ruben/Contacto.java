package UT5_POOII.Agenda_Ruben;

public abstract class Contacto implements Llamable {
    private String nombre;
    private String numTel;

    public Contacto(String nombre, String numTel) {
        this.nombre = nombre;
        this.numTel = numTel;
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getNumTel() {return numTel;}
    public void setNumTel(String numTel) {this.numTel = numTel;}


    public abstract String getTelefono();
    public abstract void llamar();
}
