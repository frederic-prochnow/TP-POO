import java.util.GregorianCalendar;

/**
 * 
 */

/**
 * @author Frédéric
 *
 */
public class Dvd extends Document {
	
	/* !CodeTemplates.overridecomment.nonjd!
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Dvd [" + super.toString() + ", producteur=" + producteur + ", duree=" + duree + "]";
	}
	/**
	 * @return le producteur
	 */
	public String getProducteur() {
		return producteur;
	}
	/**
	 * @param producteur le producteur à définir
	 */
	public void setProducteur(String producteur) {
		this.producteur = producteur;
	}
	/**
	 * @return le duree
	 */
	public int getDuree() {
		return duree;
	}
	/**
	 * @param duree le duree à définir
	 */
	public void setDuree(int duree) {
		this.duree = duree;
	}
	private String producteur;
	private int duree;
	/**
	 * 
	 */
	public Dvd(String titre,String auteur,GregorianCalendar date,String cote,GregorianCalendar dateEmprunt,String producteur,int duree) {
		super(titre,auteur,date,cote,dateEmprunt);
		this.producteur = producteur;
		this.duree = duree;
	}

}
