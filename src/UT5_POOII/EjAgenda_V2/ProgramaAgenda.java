package UT5_POOII.EjAgenda_V2;

public class ProgramaAgenda {

    public static void main(String[] args) {

        Agenda agenda = new Agenda(10);

        agenda.añadirContacto(new ContactoPersona(
                "Juan Pérez", "612345678", "15/03/1990"));

        agenda.añadirContacto(new ContactoEmpresa(
                "ACME Corp", "914567890", "https://acme.com"));

        agenda.añadirContacto(new ContactoPersona(
                "Laura", "600700800", "01/10/1985"));

        agenda.listarContactos();

        System.out.println("\n--- PRUEBA DE LLAMADAS ---");
        agenda.llamarA("Juan Pérez");
        agenda.llamarA("ACME Corp");
        agenda.llamarA("NoExiste");

        System.out.println("\n--- ELIMINANDO CONTACTO ---");
        agenda.eliminarContacto("Laura");
        agenda.listarContactos();
    }
}
