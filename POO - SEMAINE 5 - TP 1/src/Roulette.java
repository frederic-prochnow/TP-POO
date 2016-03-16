/**
 * Classe
 * <ul>
 * <li>prems</li>
 * </ul>
 * @author prochnow
 */
import java.util.Random;
import javax.swing.JOptionPane;
public class Roulette {
	/**
	 * Arguments
	 */
	int nombre;
	String couleur;
	String resultat;
	String signe;
	int [] noir = {2,4,6,8,10,11,13,15,17,20,22,24,26,28,29,31,33,35};
	
	Random alea = new Random();
	JOptionPane JOP = new JOptionPane();
	/**
	 * Methode lancer
	 */
	public void lancer () {
		this.nombre = alea.nextInt(36)+1;
		for(int i=0; i<noir.length; i++){
			if(this.nombre == noir[i]) {
				this.couleur = "noir";
			} else if (this.nombre == 0){
				this.couleur = "banque";
			} else {
				this.couleur = "rouge";
			}
		}
		if (this.nombre % 2 == 0) {
			this.signe = "pair";
		} else {
			this.signe = "impair";
		}
		if (this.nombre <= 18) {
			this.resultat = "manque";
		} else {
			this.resultat = "gagne";
		}
		
	}
	/**
	 * Methode toString
	 * @return resultat toString
	 */
	public String toString() {
		return "rien ne va plus : " + "\n" + "" + "\n" + this.nombre + "\n" + this.couleur + "\n" + this.signe + "\n" + this.resultat;
	}
	/**
	 * main
	 * @param args
	 */
	public static void main(String[] args) {
		final JOptionPane JOP = new JOptionPane();
		Roulette r1 = new Roulette();
		r1.lancer();
		String res = r1.toString();
		JOP.showMessageDialog(null,res);
	}

}
