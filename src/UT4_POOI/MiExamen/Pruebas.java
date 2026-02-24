package UT4_POOI.MiExamen;

import java.util.Arrays;

public class Pruebas {
    private String nombrePrueba;
    private Atleta [] resultadoPrueba;


    public Pruebas(String nombrePrueba) {
        this.nombrePrueba = nombrePrueba;
        this.resultadoPrueba = new Atleta[3];
    }

    @Override
    public String toString() {
        return "Pruebas{" +
                "nombrePrueba='" + nombrePrueba + '\'' +
                ", resultadoPrueba=" + Arrays.toString(resultadoPrueba) +
                '}';
    }

    public String getNombrePrueba() {
        return nombrePrueba;
    }

    public void setNombrePrueba(String nombrePrueba) {
        this.nombrePrueba = nombrePrueba;
    }

    public Atleta[] getResultadoPrueba() {
        return resultadoPrueba;
    }

    public void setResultadoPrueba(Atleta[] resultadoPrueba) {
        this.resultadoPrueba = resultadoPrueba;
    }
}
