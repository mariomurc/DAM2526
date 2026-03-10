package UT5_POOII.EjAgenda_V2;

public class ContactoEmpresa extends Contacto {

    private String web;

    public ContactoEmpresa(String nombre, String telefono, String web) {
        super(nombre, telefono);
        this.web = web;
    }

    @Override
    public String getTelefono() {
        String t = getTelefonoBase();
        // 914567890 → +34 914 567 890
        return "+34 " +
                t.substring(0, 3) + " " +
                t.substring(3, 6) + " " +
                t.substring(6);
    }

    @Override
    public void llamar() {
        System.out.println(
                "Llamando a la empresa " + getNombre() +
                        " al número " + getTelefono() + "..."
        );
        System.out.println("Pulse 1 para atención al cliente, 2 para soporte técnico...");
    }

    @Override
    public String toString() {
        return "[Empresa] " + super.toString() + " | Web: " + web;
    }
}
