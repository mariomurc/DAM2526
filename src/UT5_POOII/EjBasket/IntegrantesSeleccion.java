package UT5_POOII.EjBasket;

public class IntegrantesSeleccion {
    private int id;
    private String nombre;
    private String apellido;
    private int edad;

    public IntegrantesSeleccion(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void concentrarse(){
        System.out.println(getNombre() + " " + getApellido()+ " se esta concentrando para el partido ");
    }

    public void viaje(){
        System.out.println(getNombre() + " " + getApellido()+ " esta de viaje para el partido ");
    }
}
