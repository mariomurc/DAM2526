package UT5_POOII.InterfazPagable;

public class SuscNormal extends Suscriptor{
    boolean anuncios;

    public SuscNormal(String nombre, String dni,Suscripcion suscripcion, boolean anuncios) {
        super(nombre, dni, suscripcion);
        this.anuncios = anuncios;
    }

    public void pagarSuscripcion() {
        double base = getSuscripcion().calcularImporte();
        double total = base;

        if (anuncios){
            total = base + 5;
        }
        System.out.println("&& SUSCRIPCIÓN PAGADA &&");
        System.out.println(getSuscripcion().generarTicket(total));
    }

    private Suscripcion getSuscripcion() {
        return super.suscripcion;
    }

    public void mostrarInfoSuscriptor(){
        super.mostrarInfoSuscriptor();
        String conSin="SIN";
        if (anuncios){
            conSin = "CON";
        }
        System.out.println("SUSCRIPCIÓN " + conSin + "ANUNCIOS: ");
        System.out.println();
    }
}
