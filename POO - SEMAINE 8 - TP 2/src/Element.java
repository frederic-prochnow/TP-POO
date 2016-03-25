/**
 * Class Element
 * assemblage d'une ou plusieurs pi�ce.
 * @author Fr�d�ric
 * Semaine 8 tp2
 */
public class Element extends Assemblage implements Assemblable{
	
	private String nom;

	
	Element (String nom) {
		this.nom = nom;
	}

	/**
	 * @return le nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom le nom � d�finir
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public int getNbinventaire() {
		return this.getNbinventaire();
	}
	
	public String toString(String type) {
		String liste = "";
		for(Assemblable a:list) {
			liste += a.getNom() + " (N�" + a.getNbinventaire() + ")"+ "\n";
		}
		return this.getNom() + " :" + "\n" + liste ;
	}
}
