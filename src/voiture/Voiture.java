package voiture;

public class Voiture {

	//attributs de l'objet
	String marque;
	
	

	double vitesse;
	int puissance;
	
	public Voiture(String marque, double vitesse, int puissance) {
		this.marque = marque;
		this.vitesse = vitesse;
		this.puissance = puissance;
	}
	
	@Override
	public String toString() {
		return "Voiture [marque=" + marque + ", vitesse=" + vitesse + ", puissance=" + puissance + "]";
	}
}
