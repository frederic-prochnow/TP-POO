
import java.util.GregorianCalendar;

/**
 * Class Document
 * @author Frédéric
 * Semaine 7 TP 1
 */
public class Document {

	/**
	 * @return le dateRetour
	 */
	public GregorianCalendar getDateRetour() {
		return dateRetour;
	}
	/**
	 * @param dateRetour le dateRetour à définir
	 */
	public void setDateRetour(GregorianCalendar dateRetour) {
		this.dateRetour = dateRetour;
	}
	/**
	 * @return le dateEmprunt
	 */
	public GregorianCalendar getDateEmprunt() {
		return dateEmprunt;
	}
	/**
	 * @param dateEmprunt le dateEmprunt à définir
	 */
	public void setDateEmprunt(GregorianCalendar dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}
	/**
	 * @return le emprunteur
	 */
	public int getEmprunteur() {
		return emprunteur;
	}
	/**
	 * @param emprunteur le emprunteur à définir
	 */
	public void setEmprunteur(int emprunteur) {
		this.emprunteur = emprunteur;
	}

	/**
	 * ATTRIBUT
	 */
	private String titre;
	private String auteur;
	private GregorianCalendar date;
	private String cote;
	private boolean emprunter;
	private int emprunteur;
	private GregorianCalendar dateEmprunt;
	private GregorianCalendar dateRetour;
	
	/**
	 * constructeur
	 */
	public Document() {
	}
	public Document(String titre,String auteur,GregorianCalendar date,String cote,GregorianCalendar dateEmprunt,GregorianCalendar dateRetour) {
		this.titre = titre;
		this.auteur = auteur;
		this.date = date;
		this.cote = cote;
		this.emprunter = false;
		this.emprunteur = -1;
		this.dateEmprunt = dateEmprunt;
		this.dateRetour = dateRetour;
		
	}

	public boolean estLibre () {
		if (this.emprunter == true) return false;
		else return true;
	}
	
	public boolean emprunt (int emprunteur) {
		if (this.estLibre()) {
			this.emprunter = true;
			this.emprunteur = emprunteur;
			return true;
		}
		else return false;
	}
	
	public boolean restitution () {
		if (this.estLibre()) return false;
		else {
			this.emprunter  = false;
			this.emprunteur = -1;
			return true;
		}
	}
	
	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public GregorianCalendar getDate() {
		return date;
	}

	public void setDate(GregorianCalendar date) {
		this.date = date;
	}

	public String getCote() {
		return cote;
	}

	public void setCote(String cote) {
		this.cote = cote;
	}
	
	/* !CodeTemplates.overridecomment.nonjd!
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Document)) {
			return false;
		}
		Document other = (Document) obj;
		if (cote == null) {
			if (other.cote != null) {
				return false;
			}
		} else if (!cote.equals(other.cote)) {
			return false;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Document [titre=" + titre + ", auteur=" + auteur + ", date=" + date.getTime() +", cote=" + cote + ", dateEmprunt =" 
	           + dateEmprunt.getTime() + "]";
	}
	
	public int dureeEmprunt() {
		GregorianCalendar de = this.getDateEmprunt();
		GregorianCalendar dr = this.getDateRetour();
		long duree = dr.getTimeInMillis()-de.getTimeInMillis();
		int nbjour = (int) (duree/8.64e+7);
		return nbjour;
	}
	
	public boolean aPourCote (String cote) {
		if(this.cote == cote) {
			return true;
		}
		if(this.cote.equals(cote)) {
			return true;
		}
		return false;
	}
	
}
