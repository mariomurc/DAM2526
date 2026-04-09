package UT5_POOII.Ej4Mascotas;

import java.time.LocalDate;

public class ProgramaInventario {
    
    public static void main(String args[]) {
        Inventario inv = new Inventario();
        inv.arrayMascotas[0] = new Perro("Bobby", LocalDate.of(2015,01,01),
                "Pastor", false);

        inv.arrayMascotas[1] = new Gato("Pecas", LocalDate.of(2022,01,01),
                "rojo", true);
        inv.arrayMascotas[2] = new Loro("Arturito", LocalDate.of(2024,01,01),
                "largo", true, "Murcia", true);
        inv.arrayMascotas[3] = new Canario("Basilio", LocalDate.of(2022,01,01),
                "Largo", true, "amarillo", true);

       //Mostrar la lista de animales (solo tipo y nombre, 1 línea por animal).
        inv.mostrarListaAnimales();
        //Mostrar todos los datos de un animal concreto.
      //  Scanner teclado = new Scanner(System.in);
      //  System.out.println("De que animal quieres que te muestre info");
      //  String a = teclado.nextLine();
        System.out.println("**********************************");
        System.out.println("**********************************");
        System.out.println("**********************************");
       inv.mostrarDatosDeAnimal(Perro.class);
        System.out.println("**********************************");
        System.out.println("**********************************");
        System.out.println("**********************************");
        //Mostrar todos los datos de todos los animales.
        inv.mostrarTodosAnimales();
        //Insertar animales en el inventario.
        /*inv.insertarAnimal(new Canario("Basilio1", LocalDate.of(2022,01,01),
       º             "Largo1", true, "amarillo1", true));*/
        System.out.println("##########################");
        inv.mostrarTodosAnimales();
        //Eliminar animales del inventario.
/*
        inv.queTodosLosQuePuedanHablen();
        inv.queTodosLosQuePuedanVuelen();
        inv.queTodosLosQuePuedanSaluden();
*/


        //Vaciar








    }
    
}
