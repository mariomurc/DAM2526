package UT5_POOII.EjAgenda_V2;

public class Agenda {

    private Contacto[] contactos;
    private int numContactos;

    public Agenda(int capacidad) {
        contactos = new Contacto[capacidad];
        numContactos = 0;
    }

    public boolean añadirContacto(Contacto c) {
        if (numContactos >= contactos.length) {
            return false; // lleno
        }

        if (existeContacto(c.getNombre())) {
            return false; // repetido
        }

        contactos[numContactos] = c;
        numContactos++;
        return true;
    }

    public boolean eliminarContacto(String nombre) {
        int pos = buscaContacto(nombre);
        if (pos == -1) return false;

        for (int i = pos; i < numContactos - 1; i++) {
            contactos[i] = contactos[i + 1];
        }

        contactos[numContactos - 1] = null;
        numContactos--;

        return true;
    }

    public boolean existeContacto(String nombre) {
        return buscaContacto(nombre) != -1;
    }

    public int buscaContacto(String nombre) {
        for (int i = 0; i < numContactos; i++) {
            if (contactos[i].getNombre().equalsIgnoreCase(nombre)) {
                return i;
            }
        }
        return -1;
    }

    public void listarContactos() {
        if (numContactos == 0) {
            System.out.println("La agenda está vacía.");
            return;
        }

        for (int i = 0; i < numContactos; i++) {
            System.out.println(contactos[i]);
        }
    }

    public void llamarA(String nombre) {
        int pos = buscaContacto(nombre);
        if (pos != -1) {
            contactos[pos].llamar();
        } else {
            System.out.println("No existe el contacto " + nombre);
        }
    }
}
