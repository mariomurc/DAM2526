package UT5_POOII.InterfazPagable;

public class SuscVip extends Suscriptor{
    private int idVip;
    private int aniosVip;

    public SuscVip(String nombre, String dni, Suscripcion suscripcion, int idVip, int aniosVip) {

        super(nombre, dni, suscripcion);
        this.idVip = idVip;
        this.aniosVip = aniosVip;
    }


    @Override
    public void pagarSuscripcion() {
        double base = getSuscripcion().calcularImporte();
        double descuento = base * (aniosVip / 100.0);
        System.out.println("&& SUSCRIPCIÓN PAGADA &&");
        System.out.println(getSuscripcion().generarTicket(base - descuento));
    }


    public Suscripcion getSuscripcion() {
        return super.suscripcion;
    }

    public void mostrarInfoSuscriptor(){
        super.mostrarInfoSuscriptor();
        System.out.println("ID VIP: " + this.idVip);
        System.out.println("AÑOS COMO VIP: " + this.aniosVip);
        System.out.println();
    }
}
