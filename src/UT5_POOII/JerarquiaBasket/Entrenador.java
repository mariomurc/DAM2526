package UT5_POOII.JerarquiaBasket;
public class Entrenador extends Integrante {

	private String idFederacion;
    
	public Entrenador() {
        super();
	}

	public Entrenador( int id, String nombre, String apellidos, int edad, String idFederacion ) {
		super(id, nombre, apellidos, edad);
		this.idFederacion = idFederacion;
	}

	public String getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}

	public void dirigirPartido() {
		System.out.println("Dirige un partido (Entrenador)");
	}

	public void entrenar() {
		System.out.println("Entrena (Entrenador)");
	}

}
