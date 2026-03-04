package UT5_POOII.InterfazPagable;

public class MainPagable {
    public static void main(String[] args) {
        Pagable arrayPagos [] = new Pagable[4];

        arrayPagos[0] = new Suscripcion(10,12);
        arrayPagos[1] = new Factura(10.0f,12.0f);
        arrayPagos[2] = new Suscripcion(100,125);
        arrayPagos[3] = new Factura(100.0f,12.0f);

        for (int i = 0; i < arrayPagos.length; i++) {
            System.out.println(arrayPagos[i].generarTicket());
        }



    }
}
