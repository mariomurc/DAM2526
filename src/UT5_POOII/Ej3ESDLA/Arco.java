package UT5_POOII.Ej3ESDLA;

public class Arco {
    private double precision;
    private double tension;


    public Arco(double precision, double tension) {
        this.precision = precision;
        this.tension = tension;
    }


    public double getPrecision() {
        return precision;
    }

    public void setPrecision(double precision) {
        this.precision = precision;
    }

    public double getTension() {
        return tension;
    }

    public void setTension(double tension) {
        this.tension = tension;
    }

    @Override
    public String toString() {
        return "Arco{" +
                "precision=" + precision +
                ", tension=" + tension +
                '}';
    }
}
