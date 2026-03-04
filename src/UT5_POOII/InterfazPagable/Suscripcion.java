package UT5_POOII.InterfazPagable;

public class Suscripcion implements Pagable{
    private float precioMensual;
    private int meses;

    public Suscripcion(float precioMensual, int meses) {

        this.precioMensual = precioMensual;
        this.meses = meses;
    }
    public double calcularImporte(){
        return this.precioMensual*this.meses;
    }
    public String generarTicket(double importeCalculado){
        return "TOTAL SUSCRIPCION: " + importeCalculado;
    }

    public float getPrecioMensual() {
        return precioMensual;
    }

    public int getMeses() {
        return meses;
    }
}
