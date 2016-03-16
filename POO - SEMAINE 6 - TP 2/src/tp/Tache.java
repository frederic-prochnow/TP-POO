package tp;
/**
 * class Tache
 * @author Frédéric
 * TP 2 - semaine 6
 */
public class Tache implements Prioritaire {
	
	/**
	 * attribut
	 */
	String intitule;
	int priorite;
	
	/**
	 * Constructeur de la classe Tache
	 * @param intitule
	 * @param priorite
	 */
	Tache(String intitule,int priorite) {
		this.intitule = intitule;
		this.priorite = priorite;
	}
	
	/**
	 * méthode implémenté de l'interface Prioritaire
	 * @Override
	 * retourne n entier représentant la priorité de l'objet
	 * @return int
	 */
	public int getPriorite() {
		return this.priorite;
	}

}
