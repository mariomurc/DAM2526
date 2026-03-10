package UT5_POOII.EjAgenda_V2;

public class ContactoPersona extends Contacto {

    private String cumpleaños;

    public ContactoPersona(String nombre, String telefono, String cumpleaños) {
        super(nombre, telefono);
        this.cumpleaños = cumpleaños;
    }

    @Override
    public String getTelefono() {
        String t = getTelefonoBase();

        // Insertar espacios cada 3 cifras: 612345678 → 612 345 678
        return t.substring(0, 3) + " " +
                t.substring(3, 6) + " " +
                t.substring(6);
    }

    @Override
    public void llamar() {
        System.out.println(
                "Llamando a la persona " + getNombre() +
                        " al número " + getTelefono() + "..."
        );
    }

    @Override
    public String toString() {
        return "[Persona] " + super.toString() + " | Cumple: " + cumpleaños;
    }
}
