package UT5_POOII.Ej2Astros;

public class Planeta extends Astro{

    // Atributos
    private double distSol;
    private boolean tieneSat;
    private Satelite[] satelites;

    // Constructor
    Planeta(String nombre, double masa, double diamMedio, double rotEje,  double traslacion,
           double distSol) {
        super(nombre, masa, diamMedio, rotEje, traslacion);
        this.distSol = distSol;
        this.tieneSat = false;
        this.satelites = new Satelite[5];
    }


    // Añadimos un satélite
    public void añadirSatelite(Satelite s) {
        //Añadir un satélite a la lista
        int i=1;
        boolean hayHueco = false;
        if (!this.tieneSat){
            satelites[0] = s;
            satelites[0].setDistPlaneta(3000.0);
            satelites[0].setOrbPlaneta(5000000000.0);
            this.tieneSat = true;
            s.setPlaneta(this);
        } else{
            while(i<satelites.length && !hayHueco){
                if (satelites[i] == null){
                    hayHueco = true;
                    satelites[i] = s;
                    satelites[i].setDistPlaneta(3000.0);
                    satelites[i].setOrbPlaneta(5000000000.0);
                    s.setPlaneta(this);
                }
                i++;
            }
        }

    }

    // Mostramos información del planeta
    public void muestra() {
        super.muestra();
        System.out.println("Distancia al sol : " + this.getDistSol());
        System.out.println("Tiene satélites  : " + this.getTieneSat());
        if (tieneSat) {
            for (int i = 0; i < getSatelites().length; i++) {
                if (satelites[i] == null)
                    break;

                satelites[i].muestra();
            }
        } 
    }

    // GETTERS Y SETTERS

    public double getDistSol() {
        return distSol;
    }
    public void setDistSol(double distSol) {
        this.distSol = distSol;
    }
    public boolean getTieneSat() {
        return tieneSat;
    }
    public void setTieneSat(boolean tieneSat) {
        this.tieneSat = tieneSat;
    }
    public Satelite[] getSatelites() {
        return satelites;
    }
    public void setSatelites(Satelite[] satelites) {
        this.satelites = satelites;
    }

}
