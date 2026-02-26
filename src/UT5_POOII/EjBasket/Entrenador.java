package UT5_POOII.EjBasket;

public class Entrenador extends IntegrantesSeleccion {
    private int idFederacion;

    public Entrenador(int id, String nombre, String apellido, int edad, int idFederacion) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }
    public void dirigirPartido (){
        System.out.println("El entrenador " + getNombre() + " esta dirigiendo un partido");
    }
    public void dirigirEntrenamiento (){
        System.out.println("El entrenador " + getNombre() + " esta dirigiendo un entrenamiento");

    }
}
