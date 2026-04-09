package UT5_POOII.JerarquiaBasket;

 
public class Jugador extends Integrante {

	private int dorsal;
	private String demarcacion;

	public Jugador() {
		super();
	}

	public Jugador(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
		super(id, nombre, apellidos, edad);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}

	public void jugarPartido() {
		System.out.println("Juega un partido (Jugador)");
	}

	public void entrenar() {
		System.out.println("Entrena (Jugador)");
	}

}
