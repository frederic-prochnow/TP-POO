package tp;
/**
 * interface ordonnanceur
 * @author Fr�d�ric
 * tp2 - semaine 6
 */
public interface Ordonnanceur {
	
	/**
	 * ajoute un objet prioritaire � l'ordonnanceur
	 * @param p
	 */
	public void ajouteObjet(Prioritaire p);
	
	/**
	 * extrait l'objet qui doit sortir le plus t�t et le supprime de l'ordonnanceur
	 * @return Prioritaire
	 */
	public Prioritaire plusPrioritaire();
	
	/**
	 * retourne vrai s'il n'y a plus d'objets dans l'ordonnanceur
	 * @return boolean
	 */
	public boolean estVide();
}
