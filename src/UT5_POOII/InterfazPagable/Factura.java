package UT5_POOII.InterfazPagable;

public class Factura implements Pagable {
    private float base;
    private float iva;

    public Factura(float base, float iva) {
        this.base = base;
        this.iva = iva;
    }
    public double calcularImporte(){
        return this.base*this.iva/100 + this.base;
    }
    //public String generarTicket(){ return "TOTAL FACTURA: " + calcularImporte(); }
    public String generarTicket(double importeCalculado){

        return "TOTAL FACTURA: " + importeCalculado;
    }
}
