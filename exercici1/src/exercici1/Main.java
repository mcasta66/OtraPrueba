package exercici1;

public class Main {

	public static void main(String[] args) {
		Persona persona1 = new Persona("Miguel", "Española");
		persona1.mostraNacionalitat();
		System.out.println(persona1.nom);

		Metge metge1 = new Metge("Marta", "Italiana", "Hospital Clínic");
		metge1.mostraNacionalitat();
		metge1.mostraCentreTreball();
		
		
	}

}
