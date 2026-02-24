package UT4_POOI.MiExamen;

public class Atleta {
    private String nombreAtleta;
    private int codigoAtleta;
    private String pais;

    public Atleta(String nombreAtleta, int codigoAtleta, String pais) {
        this.nombreAtleta = nombreAtleta;
        this.codigoAtleta = codigoAtleta;
        this.pais = pais;
    }
    public String getNombreAtleta() {
        return nombreAtleta;
    }

    public void setNombreAtleta(String nombreAtleta) {
        this.nombreAtleta = nombreAtleta;
    }

    public int getCodigoAtleta() {
        return codigoAtleta;
    }

    public void setCodigoAtleta(int codigoAtleta) {
        this.codigoAtleta = codigoAtleta;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Atleta{" +
                "nombreAtleta='" + nombreAtleta + '\'' +
                ", codigoAtleta=" + codigoAtleta +
                ", pais='" + pais + '\'' +
                '}';
    }
}
