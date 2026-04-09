package UT5_POOII.JerarquiaBasket;

public class Integrante {
	protected int id;
	protected String Nombre;
	protected String Apellidos;
	private int Edad;

	public Integrante() {
            
            
	}
 
	
	
	public Integrante(int id, String nombre, String apellidos, int edad) {
                
		this.id = id;
		this.Nombre = nombre;
		this.Apellidos = apellidos;
		this.Edad = edad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellidos() {
		return Apellidos;
	}

	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}

	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public void concentrarse() {
		//¿podríamos especificar si es un jugador, entrenador o masajista?
		System.out.println("Un integrante del equipo se concentra");
	}

	public void viajar() {
		//¿podríamos especificar si es un jugador, entrenador o masajista?
		System.out.println("Un integrante del equipo viaja");
	}

}
