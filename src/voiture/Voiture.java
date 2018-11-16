package voiture;

public class Voiture {

	String marque;
	double vitesse;
	int puissance;
	
	public Voiture(String marque, double vitesse, int puissance) {
		this.marque = marque;
		this.vitesse = vitesse;
		this.puissance = puissance;
	}
	
	public String voitureToString() {
		return "Marque "+marque+" Vitesse "+vitesse+" Puissance "+puissance;
	}
	
}
