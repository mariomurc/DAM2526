package UT4_POOI.MiExamen;

import java.util.Arrays;

public class Deportes {
    private String nombreDeporte;
    private Pruebas[] pruebas = new Pruebas[5];
    private static int numPruebas;
    public Deportes(String nombreDeporte, Pruebas[] pruebas) {
        this.nombreDeporte = nombreDeporte;
        this.pruebas = pruebas;
        numPruebas = 0;
    }

    public String getNombreDeporte() {
        return nombreDeporte;
    }

    public void setNombreDeporte(String nombreDeporte) {
        this.nombreDeporte = nombreDeporte;
    }

    public Pruebas[] getPruebas() {
        return pruebas;
    }

    public void setPruebas(Pruebas[] pruebas) {
        this.pruebas = pruebas;
    }
    public void añadirPrueba(String p){
        this.pruebas[numPruebas]=new Pruebas(p);
        numPruebas++;
        System.out.println("AÑADIDA LA PRUEBA: "+ p + " EN EL DEPORTE " + this.getNombreDeporte());
    }
    @Override
    public String toString() {
        return "Deportes{" +
                "nombreDeporte='" + nombreDeporte + '\'' +
                ", pruebas=" + Arrays.toString(pruebas) +
                '}';
    }
}
