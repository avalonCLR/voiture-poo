package voiture;

public class TestVoiture {

	public static void main(String[] args) {
		
		Voiture v1 = new Voiture("BMW", 220.0, 8);
		Voiture v2 = new Voiture("Ford", 200.0, 6);
		Voiture v3 = new Voiture("Audi", 240.0, 8);
		
		Voiture[] voitures = {v1, v2, v3};

		//for remplaçé par un foreach
		for (Voiture v : voitures) {
			System.out.println(v.toString());
		}
		
		System.out.println("Le nombre de voitures est : "+voitures.length);
	}

}
