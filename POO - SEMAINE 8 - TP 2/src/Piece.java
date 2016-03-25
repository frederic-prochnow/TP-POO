/**
 * Class Piece
 * comosoant indivisible tel qu'achete dans le commerce
 * @author Frédéric
 * Semaine 8 tp2
 */
public class Piece implements Assemblable{

	private int nbinventaire;
	private String nom;
	
	Piece (String nom,int nbinventaire){
		this.nom = nom;
		this.nbinventaire = nbinventaire;
	}
	
	/**
	 * @return le nbinventaire
	 */
	public int getNbinventaire() {
		return nbinventaire;
	}

	/**
	 * @param nbinventaire 
	 * le nbinventaire à définir
	 */
	public void setNbinventaire(int nbinventaire) {
		this.nbinventaire = nbinventaire;
	}

	/**
	 * @return le nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom 
	 * le nom à définir
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String toString() {
		return this.getNom() + " (N°" + this.getNbinventaire() + ")";
	}
}
