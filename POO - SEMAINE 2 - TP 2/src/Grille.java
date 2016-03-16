import java.util.Random;
public class Grille {
    int [][] tableau;
    
    Grille (int x, int y) {
	this.tableau = new int [x][y];
    }

    boolean remplir(int min, int max) {
	boolean b = true;
	for (int i = 0 ; i < tableau.length ; i++) {
	    for (int j = 0 ; j < tableau[0].length ; j++) {
		Random alea = new Random();
		int nb = alea.nextInt(max);
		if (min < nb && nb < max) {
		    tableau [i][j] = nb;
		}
		if (min<max) {
		    b= true;
		} else {
		    b= false;
		}
	    }
	}
	return b;
    }

    void afficher () {
	System.out.println("Grille :");
	for (int i = 0 ; i < tableau.length ; i++) {
	    for (int j = 0 ; j < tableau[0].length ; j++) {
		System.out.print("| "+ tableau[i][j] + " |");
	    }
	    System.out.println();
	}
    }

    void fenetre (int left, int top) {
	new Tableau(left,top,tableau);
    }
}
	    
