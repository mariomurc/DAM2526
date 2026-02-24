package UT5_POOII.Ej3ESDLA;

public class Personaje {
    private String nombre;
    private int vida;
    private Punto punto;


    public Personaje(String nombre, int vida, Punto p) {
        this.nombre = nombre;
        this.vida = vida;
        this.punto = p;
    }

    public void desplazar (int incrementoX, int incrementoY){
        this.getPunto().desplaza(incrementoX,incrementoY);

    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Punto getPunto() {
        return punto;
    }

    public void setPunto(Punto punto) {
        this.punto = punto;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", vida=" + vida +
                ", punto=" + punto +
                '}';
    }
}
