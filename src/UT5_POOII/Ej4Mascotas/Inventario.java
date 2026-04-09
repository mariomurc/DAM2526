package UT5_POOII.Ej4Mascotas;

public class Inventario {

    public Mascota[] arrayMascotas = new Mascota[5];
    private int totalMascotas=4;
    // Devuelve un String con el tipo de Animal
    private String getTipoMascota(Mascota m) {
        if (m instanceof Perro) {
            return "Perro";
        } else if (m instanceof Gato) {
            return "Gato";
        } else if (m instanceof Loro) {
            return "Loro";
        } else if (m instanceof Canario) {
            return "Canario";
        } else {
            return null;
        }
    }

    // Muestra la lista de animales (solo tipo y nombre)
    public void mostrarListaAnimales() {
        for (int i = 0; i < arrayMascotas.length; i++) {
            if (arrayMascotas[i]!= null){
                if (arrayMascotas[i] instanceof Perro){
                    System.out.println("TIPO: PERRO");
                    System.out.println( arrayMascotas[i].getNombre());
                } else if (arrayMascotas[i] instanceof Gato) {
                    System.out.println("TIPO: GATO ");
                    System.out.println( arrayMascotas[i].getNombre());
                } else if (arrayMascotas[i] instanceof Loro){
                    System.out.println("TIPO: LORO");
                    System.out.println( arrayMascotas[i].getNombre());
                } else if (arrayMascotas[i] instanceof Canario) {
                    System.out.println("TIPO: CANARIO");
                    System.out.println( arrayMascotas[i].getNombre());
                }
                System.out.println("-------------------------------");
            }
        }

    }
    public void insertarAnimal(Mascota mascota) {
        if (arrayMascotas != null) {
            arrayMascotas[totalMascotas] = mascota;
            totalMascotas++;
        }
    }

    void mostrarDatosDeAnimal(Class<?> tipo){
            for (int i = 0; i < arrayMascotas.length; i++) {
                if (arrayMascotas[i] != null) {
                    if(tipo.equals(arrayMascotas[i].getClass())){
                        arrayMascotas[i].muestra();
                    }
                }
            }

        }

    public void mostrarTodosAnimales() {
        for (int i = 0; i < arrayMascotas.length; i++) {
            if (arrayMascotas[i] != null) {
                arrayMascotas[i].muestra();

            }
        }
    }
/*
    public void insertarAnimal(Mascota a) {
        animales.add(a);
    }

    public boolean eliminarAnimal(int indice) {
        if (indice >= 0 && indice < animales.size()) {
            animales.remove(indice);
            return true;
        } else {
            return false;
        }
    }

    public void vaciarInventario() {
        animales.clear();
    }*/
}
