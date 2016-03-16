package tp;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Ordofile
 * @author Frédéric
 * TP2 - semaine 6
 */
public class OrdoFile implements Ordonnanceur{
	private List <Prioritaire> files = new  ArrayList <>();
	
	
	/**
	 * méthode implémenté de l'interface Ordonnanceur
	 * @Override
	 * ajoute un objet prioritaire à l'ordonnanceur
	 * @param p
	 */
	public void ajouteObjet(Prioritaire p) {
		files.add(p);
	}

	/**
	 * méthode implémenté de l'interface Ordonnanceur
	 * @Override
	 * extrait l'objet qui doit sortir le plus tôt et le supprime de l'ordonnanceur
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
	 * méthode implémenté de l'interface Ordonnanceur
	 * @Override
	 * retourne vrai s'il n'y a plus d'objets dans l'ordonnanceur
	 * @return boolean
	 */
	public boolean estVide() {
		return files.isEmpty();
	}
	
}
