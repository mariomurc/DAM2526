package UT5_POOII.EjBasket;

public class Jugador extends IntegrantesSeleccion {
    private int dorsal;
    private String demarcacion;

    public Jugador(int id, String nombre, String apellido, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellido, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public void jugar (){
        System.out.println("El jugador " + getNombre()+ " esta jugando un partido");
    }
    public void entrenar (){
        System.out.println("El jugador " + getNombre() + " esta entrenando");
    }
}
