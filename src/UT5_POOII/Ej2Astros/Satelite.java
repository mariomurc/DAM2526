package UT5_POOII.Ej2Astros;
public class Satelite extends Astro{

    // Atributos
    private double distPlaneta;
    private double orbPlaneta;
    private Planeta planeta;

    // Constructor
    Satelite(String nombre, double masa, double diamMedio, double rotEje,
             double traslacion) {
        super(nombre, masa, diamMedio, rotEje, traslacion);
        this.distPlaneta = 0;
        this.orbPlaneta = 0;
        this.planeta = null;
    }
    public void añadirPlanetaASatelite(Planeta p, double dist, double orb){
        this.planeta = p;
        //this.planeta.setTieneSat(true);
        this.planeta.añadirSatelite(this);
        this.distPlaneta = dist;
        this.orbPlaneta = orb;
    }

    // Mostramos solo parte de su información
    public void muestra() {
        System.out.println("*** SATÉLITE: "+this.getNombre() +" ***");
        super.muestra();
        System.out.println("Distancia planeta: " + getDistPlaneta());
        System.out.println("Órbita al planeta: " + getOrbPlaneta());
        if (planeta != null) {
        	System.out.println("Pertenece planeta: " + planeta.getNombre());
        }
        
    }

    // GETTERS Y SETTERS
    ;
    
    public double getDistPlaneta() {
        return distPlaneta;
    }
    public void setDistPlaneta(double distPlaneta) {
        this.distPlaneta = distPlaneta;
    }
    public double getOrbPlaneta() {
        return orbPlaneta;
    }
    public void setOrbPlaneta(double orbPlaneta) {
        this.orbPlaneta = orbPlaneta;
    }
    public Planeta getPlaneta() {
        return planeta;
    }
    public void setPlaneta(Planeta planeta) {
        this.planeta = planeta;
    }

}
