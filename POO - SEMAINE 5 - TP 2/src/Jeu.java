/**
 * Class Jeu
 * @author Frédéric
 */
import java.util.Random;

public class Jeu {
	
	/**
	 * void main
	 * @param args
	 */
	public static void main(String[] args) {
		Random r=new Random();
		String[] gifs={"images/un.gif","images/deux.gif","images/trois.gif","images/quatre.gif"};
		int taille=10;
		Plateau grille=new Plateau(gifs,taille);
		int[][] jeu=new int[taille][taille];
		 // Remplissage aléatoire du tableau
		for (int i=0;i<taille;i++) {
			for (int j=0;j<taille;j++)	{
				jeu[i][j]=r.nextInt(gifs.length+1);
			}
		}
		/**
		 * methode set
		 * @params jeu
		 */
		grille.setJeu(jeu);
		grille.affichage();
		

	}

}
