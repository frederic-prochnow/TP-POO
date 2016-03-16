package tp;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Ordofile
 * @author Fr�d�ric
 * TP2 - semaine 6
 */
public class OrdoFile implements Ordonnanceur{
	private List <Prioritaire> files = new  ArrayList <>();
	
	
	/**
	 * m�thode impl�ment� de l'interface Ordonnanceur
	 * @Override
	 * ajoute un objet prioritaire � l'ordonnanceur
	 * @param p
	 */
	public void ajouteObjet(Prioritaire p) {
		files.add(p);
	}

	/**
	 * m�thode impl�ment� de l'interface Ordonnanceur
	 * @Override
	 * extrait l'objet qui doit sortir le plus t�t et le supprime de l'ordonnanceur
	 * @return Prioritaire
	 */
	public Prioritaire plusPrioritaire() {
		if(estVide()) {
			return null;
		} else {
			return files.remove(0);
		}
	}

	/**
	 * m�thode impl�ment� de l'interface Ordonnanceur
	 * @Override
	 * retourne vrai s'il n'y a plus d'objets dans l'ordonnanceur
	 * @return boolean
	 */
	public boolean estVide() {
		return files.isEmpty();
	}
	
}
