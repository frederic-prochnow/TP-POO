/**
 * Class Poste
 * cette classe l'ensemble des composants du poste d'une personne
 * @author Frédéric
 * Semaine 8 tp2
 */
public class Poste extends Assemblage {

	private String utilisateur;
	
	Poste (String utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	/**
	 * @return le utilisateur
	 */
	public String getUtilisateur() {
		return utilisateur;
	}

	/**
	 * @param utilisateur le utilisateur à définir
	 */
	public void setUtilisateur(String utilisateur) {
		this.utilisateur = utilisateur;
	}

	
	public String toString () {
		String utilisateur = "Poste de \" " + this.getUtilisateur() + "\" ";
		String res = "";
		for(Assemblable a:list) {
			res += a.toString() + "\n";
		}
		return utilisateur + "\n" + res;
	}
}
