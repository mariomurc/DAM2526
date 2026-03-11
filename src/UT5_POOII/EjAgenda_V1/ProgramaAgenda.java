package UT5_POOII.EjAgenda_V1;

public class ProgramaAgenda {

    public static void main(String[] args) {

        Agenda agenda = new Agenda(10); // capacidad fija

        agenda.añadirContacto(new Contacto("Juan", "654321987"));
        agenda.añadirContacto(new Contacto("Ana", "600700800"));
        agenda.añadirContacto(new Contacto("Juan", "999999999"));

        agenda.listarContactos();

        System.out.println("¿Existe Ana? " + agenda.existeContacto("Ana"));
        System.out.println("¿Existe Pedro? " + agenda.existeContacto("Pedro"));

        agenda.eliminarContacto("Ana");

        agenda.listarContactos();
    }
}
