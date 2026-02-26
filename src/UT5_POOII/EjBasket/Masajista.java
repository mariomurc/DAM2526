package UT5_POOII.EjBasket;

public class Masajista extends IntegrantesSeleccion {
    private String titulacion;
    private int añosExperiencia;

    public Masajista(int id, String nombre, String apellido, int edad, String titulacion, int añosExperiencia) {
        super(id, nombre, apellido, edad);
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }
    public void masajes (){
        System.out.println("El masajista " + getNombre() + " esta dando un masaje" );
    }
}
