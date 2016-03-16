package tp;
/**
 * class Tache
 * @author Fr�d�ric
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
	 * m�thode impl�ment� de l'interface Prioritaire
	 * @Override
	 * retourne n entier repr�sentant la priorit� de l'objet
	 * @return int
	 */
	public int getPriorite() {
		return this.priorite;
	}

}
