package UT5_POOII.Ej1FigGeometricas;
import java.util.Date;

public class Figura {

    String color;
    boolean relleno;
    String tipoRelleno;
    Date fechaCreacion;

    public Figura(String color, boolean relleno, String tipoRelleno) {

        this.color = color;
        this.relleno = relleno;
        this.tipoRelleno = tipoRelleno;
        this.fechaCreacion = new Date();
    }

    @Override
    public String toString() {
        return "Figura{" +
                "color='" + color + '\'' +
                ", relleno=" + relleno +
                ", tipoRelleno='" + tipoRelleno + '\'' +
                ", fechaCreacion=" + fechaCreacion +
                '}';
    }
}