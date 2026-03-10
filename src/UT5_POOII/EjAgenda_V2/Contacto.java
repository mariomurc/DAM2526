package UT5_POOII.EjAgenda_V2;

public abstract class Contacto implements Llamable {

    private String nombre;
    private String telefono;

    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }
    //public abstract  String getTelefono();

    protected String getTelefonoBase() {
        return telefono;
    }

    @Override
    public String toString() {
        return nombre + " - " + getTelefono();
    }
}
