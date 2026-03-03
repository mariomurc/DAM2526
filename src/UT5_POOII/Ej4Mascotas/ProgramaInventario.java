package UT5_POOII.Ej4Mascotas;

import java.time.LocalDate;

public class ProgramaInventario {
    
    public static void main(String args[]) {

        Inventario.inventMascotas[0] = new Perro("Bobby", LocalDate.of(2015,01,01),
                "Pastor", false);
        Inventario.inventMascotas[1] = new Gato("Pecas", LocalDate.of(2022,01,01),
                "rojo", true);
        Inventario.inventMascotas[2] = new Loro("Arturito", LocalDate.of(2024,01,01),
                "largo", true, "Murcia", true);
        Inventario.inventMascotas[3] = new Canario("Basilio", LocalDate.of(2022,01,01),
                "Largo", true, "amarillo", true);


        //Mostrar la lista de animales (solo tipo y nombre, 1 línea por animal).

        //Mostrar todos los datos de un animal concreto.

        //Mostrar todos los datos de todos los animales.

        //Insertar animales en el inventario.

        //Eliminar animales del inventario.

        //Vaciar








    }
    
}
