package T4_ObjetosI.CarreraCoches;

import java.util.Random;

public class Coche {
    //ATRIBUTOS
    private String marca;
    //private String nombrePiloto;
    private Piloto piloto;
    private float nKilometrosRecorridos;
    private float cantidadGasolina;

    //CONSTRUCTOR CLASE
    public Coche(String marca, Piloto piloto, float cantidadGasolina){
        this.marca = marca;
        this.piloto = piloto;
        this.cantidadGasolina = cantidadGasolina;
        this.nKilometrosRecorridos = 0.0f;
        System.out.println("COCHE CREADO");
    }

    public void conducir(){
        Random random = new Random();
        float kmAleatorio = random.nextFloat(1, 31);
        float gasAux = this.cantidadGasolina - (kmAleatorio - (1.0f/3.0f));
        if(gasAux < 0){
            repostar();
            System.out.println(this.piloto.getNombre() + " Esta repostando (pierde turno)");
        }
        else {
            this.cantidadGasolina = this.cantidadGasolina - (kmAleatorio - (1.0f/3.0f));
            this.nKilometrosRecorridos += kmAleatorio;
            System.out.println(this.piloto.getNombre() + " Avanza en la carrera");
        }
    }

    public void repostar(){
        Random random = new Random();
        this.cantidadGasolina = this.cantidadGasolina + random.nextFloat(0,31);
    }

    public void imprimir(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Dueño Nombre: " + this.piloto.getNombre());
        System.out.println("Cantidad Gasolina: " + this.cantidadGasolina);
        System.out.println("Numero de Kilometros: " + this.nKilometrosRecorridos);
    }
    public void imprimirConPiloto(String situacion){
        this.piloto.imprimirPiloto(situacion);
        this.imprimir();
    }

    //GETERS Y SETERS
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public float getnKilometrosRecorridos() {
        return nKilometrosRecorridos;
    }

    public void setnKilometrosRecorridos(float nKilometrosRecorridos) {
        this.nKilometrosRecorridos = nKilometrosRecorridos;
    }

    public float getCantidadGasolina() {
        return cantidadGasolina;
    }

    public void setCantidadGasolina(float cantidadGasolina) {
        this.cantidadGasolina = cantidadGasolina;
    }
}
