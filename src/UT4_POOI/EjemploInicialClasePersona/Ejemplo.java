package T4_ObjetosI;

public class Ejemplo {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        p1.setNombre("IVAN");
        p1.setEdad(11);
        p1.setTieneGafas(false);
        p2.setNombre("PABLO");
        p2.setEdad(19);
        p2.setTieneGafas(true);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.getNombre() + " " + p1.getEdad());
        System.out.println(p2.getNombre());
        p1.mostrarPersona();
        p2.mostrarPersona();
        p1.setEdad(p1.getEdad()+1);
        p1.mostrarPersona();

        System.out.println(p1.getNombre() + " ES MAYOR DE EDAD:  "
                + p1.esMayorEdad());
        System.out.println(p2.getNombre() + " ES MAYOR DE EDAD:  "
                + p2.esMayorEdad());








    }
}
