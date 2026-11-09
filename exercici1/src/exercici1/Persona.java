package exercici1;

public class Persona {

	public String nom;
	public String nacionalitat;

	public Persona(String nom, String nacionalitat) {
		this.nom = nom;
		this.nacionalitat = nacionalitat;
	}

	public void mostraNacionalitat() {	
		System.out.println("La nacionalitat de " + this.nom + " es " +	this.nacionalitat);
	}

}
