/**
 * @author M2103
 *
 */
public class JeuAPlusieurs {
    /**
     * @param args
     */
    public static void main(String[] args) {
	// ------------MENU----------------------------------------
	int nbjoueur = Integer.parseInt(args[0]);
	int total = Integer.parseInt(args[1]);
	System.out.println("BIENVENUE" + "\n" +
			   "NB JOUEUR :" + nbjoueur);
	System.out.println("merci" + "\n" +
			   "score total" + total);
	
	// -----------GESTION JOUEURS------------------------------
	Joueur [] joueur = new Joueur [nbjoueur];
		
	for(int i=0; i<nbjoueur; i++) {
	    String joueurnom = "J"+i;
	    joueur[i] = new Joueur(joueurnom);
	}
	
	int jeu = 0;
	int sommepoint = 20 * nbjoueur;
	while (sommepoint !=0) {
	    for (int i=0; i<nbjoueur; i++) {
		if(joueur[i].cumul< total) {
		    joueur[i].jouer();
		    sommepoint = sommepoint - joueur[i].cumul;
		}
	    }
	}
	
	String pg = "";
	System.out.println("VOICI LES RESULTATS :");
	for (int i=0; i<nbjoueur; i++) {
	    System.out.println("Joueur" + i +
			       " a obtenu comme score :" +
			       joueur[i].cumul);
	}
    }
}
