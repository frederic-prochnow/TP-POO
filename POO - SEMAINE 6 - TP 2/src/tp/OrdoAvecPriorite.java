package tp;

/**
 * Class OrdoAvecPriorite
 * @author Frédéric
 * TP2 - Semaine 6
 */
public class OrdoAvecPriorite implements Ordonnanceur {
	
	/**
	 * attribut
	 */
	private OrdoFile [] files;
	
	/**
	 * Constructeur de la classe
	 * @param List <OrdoFile> Of
	 */
	OrdoAvecPriorite(int i) {
		files = new OrdoFile [i];
		for(int j=0; j<files.length; j++) {
			files[j] = new OrdoFile();
		}
	}
	
	/**
	 * méthode implémenté de l'interface Ordonnanceur
	 * @Override
	 * ajoute un objet prioritaire à l'ordonnanceur
	 * @param p
	 */
	public void ajouteObjet(Prioritaire p) {
		int i = p.getPriorite();
		files[i].ajouteObjet(p);
	}

	/**
	 * méthode implémenté de l'interface Ordonnanceur
	 * @Override
	 * extrait l'objet qui doit sortir le plus tôt et le supprime de l'ordonnanceur
	 * @return Prioritaire
	 */
	public Prioritaire plusPrioritaire() {
		for(int i=0; i<files.length; i++) {
			Prioritaire p = files[i].plusPrioritaire();
			if(files[i].plusPrioritaire() != null) {
				return p;
			}
		}
		return null;
	}

	/**
	 * méthode implémenté de l'interface Ordonnanceur
	 * @Override
	 * retourne vrai s'il n'y a plus d'objets dans l'ordonnanceur
	 * @return boolean
	 */
	public boolean estVide() {
		for (int i=0; i<files.length;i++) {
			if(!files[i].estVide()) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		OrdoAvecPriorite o = new OrdoAvecPriorite(7);
		Tache t1 = new Tache("tache t1",4);
		Tache t2 = new Tache("tache t2",2);
		Tache t3 = new Tache("tache t3",6);
		o.ajouteObjet(t1);
		o.ajouteObjet(t2);
		o.ajouteObjet(t3);
		while(!o.estVide()){
			System.out.println(o.plusPrioritaire());
		}
		//System.out.println("t1 : priorité" + t1.getPriorite() + " - intitulé :" + t1.intitule);
		//System.out.println("t2 : priorité" + t2.getPriorite() + " - intitulé :" + t2.intitule);
		//System.out.println("t3 : priorité" + t3.getPriorite() + " - intitulé :" + t3.intitule);
	}
}
