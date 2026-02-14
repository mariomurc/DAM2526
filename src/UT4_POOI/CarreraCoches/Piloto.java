package T4_ObjetosI.CarreraCoches;

import java.time.LocalDate;

public class Piloto {
    private String nombre;
    private final String dni;
    private final LocalDate fechaNac;
    private int cGanadas;
    private int cPerdidas;

    public Piloto(String nombre, String dni, LocalDate fechaNac) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNac = fechaNac;
        this.cGanadas = 0;
        this.cPerdidas = 0;
    }

    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}
    public String getDni(){return dni;}
    public LocalDate getFechaNac(){return fechaNac;}
    public int getcGanadas() {return cGanadas;}
    public void setcGanadas(int cGanadas) {this.cGanadas = cGanadas;}
    public int getcPerdidas() {return cPerdidas;}
    public void setcPerdidas(int cPerdidas){this.cPerdidas = cPerdidas;}

    public void imprimirPiloto(String situacion){
        System.out.println("************************************");
        System.out.println("***** DATOS PILOTO "+ situacion +" ********");
        System.out.println("************************************");
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("DNI: " + this.getDni());
        System.out.println("Fecha Nacimiento: " + this.getFechaNac());
        System.out.println("Carreras Ganadas: " + this.getcGanadas());
        System.out.println("Carreras Perdidas: " + this.getcPerdidas());
    }
}
