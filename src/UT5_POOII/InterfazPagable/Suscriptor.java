package UT5_POOII.InterfazPagable;

public abstract class Suscriptor {

    private String nombre;
    private String dni;   // único
    protected Suscripcion suscripcion; // relación: TIENE UNA

    public Suscriptor(String nombre, String dni, Suscripcion suscripcion) {
        this.nombre = nombre;
        this.dni = dni;
        this.suscripcion = suscripcion;
    }

    public abstract void pagarSuscripcion(); // comportamiento distinto
    public void mostrarInfoSuscriptor(){
        System.out.println("***** DATOS SUSCRIPTOR *****");
        System.out.println("NOMBRE SUSCRIPTOR: " + this.nombre);
        System.out.println("DNI SUSCRIPTOR: " + this.dni);
        System.out.println("***** INFO SUSCRIPCIÓN ***** ");
        System.out.println("PRECIO MENSUAL: " +this.suscripcion.getPrecioMensual());
        System.out.println("MESES SUSCRIPCIÓN: " + this.suscripcion.getMeses());
    }

}
