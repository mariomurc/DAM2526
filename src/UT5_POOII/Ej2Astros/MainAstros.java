package UT5_POOII.Ej2Astros;

public class MainAstros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//completar
		Planeta p1 = new Planeta("Tierra",3.4,5.6,6.7,
				7.8,9.9);
		//p1.muestra();
		Satelite s1 = new Satelite("Luna",6.7,3.4,5.6,9.8);
		//s1.muestra();
		Satelite s2 = new Satelite("Pizarro",6.7,3.4,5.6,9.8);
		//s2.muestra();
		//CREAMOS UN PLANETA Y LE AÑADIMOS DOS SATÉLITES
		p1.añadirSatelite(s1);
		p1.añadirSatelite(s2);
		p1.muestra();
		System.out.println("***************************************************");
		System.out.println("***************************************************");
		System.out.println("***************************************************");
		System.out.println("***************************************************");
		System.out.println("***************************************************");

		Planeta p2 = new Planeta("Jupiter",3.4,5.6,6.7,
				7.8,9.9);

		Satelite s3 = new Satelite("Orion",6.7,3.4,5.6,9.8);
		Satelite s4 = new Satelite("Io",6.7,3.4,5.6,9.8);

		s3.añadirPlanetaASatelite(p2,5555.5,6666.6);
		s4.añadirPlanetaASatelite(p2,7777.7,8888.8);
		p2.muestra();

	}

}
