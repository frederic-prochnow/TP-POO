import java.util.GregorianCalendar;

/**
 * 
 */

/**
 * @author Frédéric
 *
 */
public class Livre extends Document{
	

	

	/* !CodeTemplates.overridecomment.nonjd!
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Livre [" + super.toString() + ", editeur=" + editeur + ", nbpage=" + nbpage + "]";
	}

	/**
	 * @return le editeur
	 */
	public String getEditeur() {
		return editeur;
	}

	/**
	 * @param editeur le editeur à définir
	 */
	public void setEditeur(String editeur) {
		this.editeur = editeur;
	}

	/**
	 * @return le nbpage
	 */
	public int getNbpage() {
		return nbpage;
	}

	/**
	 * @param nbpage le nbpage à définir
	 */
	public void setNbpage(int nbpage) {
		this.nbpage = nbpage;
	}

	private String editeur;
	private int nbpage;
	
	Livre(String titre,String auteur,GregorianCalendar date,String cote,GregorianCalendar dateEmprunt,String editeur,int nbpage) {
		super(titre,auteur,date,cote,dateEmprunt);
		this.editeur = editeur;
		this.nbpage = nbpage;
	}
	
}
