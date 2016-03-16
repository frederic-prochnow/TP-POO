import java.util.Random;
public class Paquet {
    public static void main (String [] args) {
	// CREATION DU TABLEAU
	Carte carte [] = new Carte [32];
	Carte memoire = new Carte (0,0);
	int cpt = 0;
	for(int i=0; i<4; i++) {
	    for(int j=0; j<8; j++) {
		carte[cpt] = new Carte(i,j);
		cpt++;
	    }
	}
	// AFFICAHGE AVANT MELANGE
	System.out.println("------AVANT MELANGE------");
	for(int i=0; i<32; i++) {
	    System.out.println(i+" : "+ carte[i].toString());
	}
	// MELANGE
	for(int i=0; i<32; i++) {
	    Random rd1 = new Random();
	    Random rd2 = new Random();
	    int alea1 = rd1.nextInt(32);
	    int alea2 = rd2.nextInt(32);
	    memoire = carte [alea2];
	    carte [alea2] = carte [alea1];
	    carte [alea1] = memoire;
	}
	// AFFICAHGE APRES MELANGE
	System.out.println("------APRES MELANGE------");
	for(int i=0; i<32; i++) {
	    System.out.println(i+" : "+ carte[i].toString());
	}
	// TRIE
	
    }
}
