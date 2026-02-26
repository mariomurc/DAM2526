package UT5_POOII.EjBasket;

public class ProgramaPrincipal {
    public static void main(String[] args) {

        IntegrantesSeleccion[] integrantes = new IntegrantesSeleccion[10];
        IntegrantesSeleccion jugador = new Jugador(1, "Ruben", "Serrano", 18, 7, "Alero");
        IntegrantesSeleccion entrenador = new Entrenador(2, "Raúl", "Gonzalez", 19, 1111);
        IntegrantesSeleccion masajista = new Masajista(3, "Martin", "Gonzalez", 18, "Fisioterapia", 2);

        integrantes[0] = jugador;
        integrantes[1] = entrenador;
        integrantes[2] = masajista;

        for (int i = 0; i < integrantes.length; i++) {
            if (integrantes [i]!= null){
                integrantes[i].concentrarse();
                integrantes[i].viaje();
                System.out.println("************");
            }
        }

        for (int i = 0; i < integrantes.length; i++) {
            if (integrantes[i] != null) {
                if (integrantes[i] instanceof Jugador) {
                    System.out.println("*****************");
                    Jugador jugador1 = (Jugador) integrantes[i];
                    jugador1.jugar();
                    jugador1.entrenar();
                }


                else if (integrantes[i] instanceof Entrenador) {
                    System.out.println("*****************");

                    Entrenador entrenador1 = (Entrenador) integrantes[i];
                    entrenador1.dirigirPartido();
                    entrenador1.dirigirEntrenamiento();

                }


                else if (integrantes[i] instanceof Masajista) {
                    System.out.println("*****************");
                    Masajista masajista1 = (Masajista) integrantes[i];
                    masajista1.masajes();
                }
            }
        }

    }
}
