package UT5_POOII.InterfazPagable;

public class MainPagable {
    public static void main(String[] args) {

        Pagable arrayPagos [] = new Pagable[4];
        Suscriptor arraySuscriptores [] = new Suscriptor[10];


        arraySuscriptores[0] = new SuscVip("Mario","777",new Suscripcion(10,10),1,5);
        arraySuscriptores[1] = new SuscNormal("JuanKar","1234",new Suscripcion(12,6),false);


        arraySuscriptores[0].mostrarInfoSuscriptor();
        arraySuscriptores[0].pagarSuscripcion();

        arraySuscriptores[1].mostrarInfoSuscriptor();
        arraySuscriptores[1].pagarSuscripcion();





     /*   Pagable arrayPagos [] = new Pagable[4];

        arrayPagos[0] = new Suscripcion(10,12);
        arrayPagos[1] = new Factura(10.0f,12.0f);
        arrayPagos[2] = new Suscripcion(100,125);
        arrayPagos[3] = new Factura(100.0f,12.0f);

        for (int i = 0; i < arrayPagos.length; i++) {
            System.out.println(arrayPagos[i].generarTicket());
        }
*/


    }
}
