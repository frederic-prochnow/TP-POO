/**
 * @author M2103
 *
 */
public class JeuADeux {
    /**
     * @param args
     */
    public static void main(String[] args) {
	int total = 20; // total à atteindre
	// les 2 joueurs
	Joueur cesar= new Joueur("Cesar");
	Joueur beber= new Joueur("beber");
	
	// Partie seul
	int jeu = 0;
	while (cesar.cumul<total || beber.cumul<total) {
	    if(cesar.cumul<total) {
		cesar.jouer();
	    }
	    if(beber.cumul<total) {
		beber.jouer();
	    }
	}
	String pg = "";
	if (cesar.nbLancers < beber.nbLancers) {
	    pg = "<-- CESAR -->";
	}
	if (cesar.nbLancers == beber.nbLancers){
	    pg = "PAS DE GAGANT - EGALITE";
	}
	if (cesar.nbLancers > beber.nbLancers) {
	    pg = "<-- BEBER -->";
	}
       	System.out.println("LE GAGNANT EST ____: " + pg + '\n' +
			   " -- SCORE DE CESAR : " + cesar.nbLancers + '\n' +
			   " -- SCORE DE BEBER : " + beber.nbLancers);		
    }
}
