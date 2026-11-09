package exercici1;

public class Metge extends Persona {
		
	public String centreTreball;

	public Metge(String nom, String nacionalitat, String centreTreball) {
		super(nom, nacionalitat);
		this.centreTreball = centreTreball;
	}
	
	public void mostraCentreTreball() {
		System.out.println("El metge " + super.nom + " treballa al centre " +
				this.centreTreball);
	}

	
	
}
