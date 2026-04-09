package UT5_POOII.Agenda_Ruben;

public class Agenda {
    private Contacto arrayContactos[] = new Contacto[10];

    public Contacto[] getArrayContactos() {
        return arrayContactos;
    }

    public void setArrayContactos(Contacto arrayContactos[]) {
        this.arrayContactos = arrayContactos;
    }

    public boolean añadirContacto(Contacto c){

            if (existeContacto(c.getNombre())){
                return false;
            }

        for (int i = 0; i < arrayContactos.length; i++) {
            if (arrayContactos[i] == null){
                arrayContactos[i] = c;
                return true;
            }
        }
        return false;
    }

    public boolean eliminarContacto(String nombre){
        for (int i = 0; i < arrayContactos.length; i++) {
            if (arrayContactos[i] != null){
                if (arrayContactos[i].getNombre().equalsIgnoreCase(nombre)){
                    arrayContactos[i] = null;
                    return true;
                }
            }
        }
        return false;
    }
    public boolean existeContacto(String nombre){
        for (int i = 0; i < arrayContactos.length; i++) {
            if (arrayContactos[i] != null){
                if (arrayContactos[i].getNombre().equalsIgnoreCase(nombre)){
                    return true;
                }
            }
        }
        return false;
    }

    public void listarContactos(){
        int contador = 0;
        for (int i = 0; i < arrayContactos.length; i++) {
            if (arrayContactos[i]!= null) {
                System.out.println("NOMBRE: " + arrayContactos[i].getNombre());
                System.out.println("TELEFONO: " + arrayContactos[i].getTelefono());
                System.out.println("***********************");
            }else{
                contador++;
            }
        }
        if (contador == arrayContactos.length){
            System.out.println("***********************");
            System.out.println("LA AGENDA SE ENCUENTRA VACÍA");
            System.out.println("***********************");
        }
    }

    public int buscaContacto(String nombre){
        for (int i = 0; i < arrayContactos.length; i++) {
            if (arrayContactos[i] != null) {
                if (arrayContactos[i].getNombre().equalsIgnoreCase(nombre)){
                        return i;
                    }
                }
            }
        return -1;
    }
}
