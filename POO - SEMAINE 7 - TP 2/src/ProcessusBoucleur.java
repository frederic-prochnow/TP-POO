/**
 * Class ProcessusBoucleur
 * @author Frédéric
 * TP 2 semaine 7
 */
import javax.swing.JOptionPane;
public class ProcessusBoucleur implements Processus,Prioritaire{
	private int boucle;
	private int compteur;
	private int priorite;
	private String message;
	private boolean fini;
	
	public ProcessusBoucleur() {
		this.message = JOptionPane.showInputDialog("Quel est votre phrase ?");
		this.fini = false;
		this.priorite = 2;
		String message2 = JOptionPane.showInputDialog("Nombre de tour ?");
		this.boucle = Integer.parseInt(message2);
	}

	@Override
	public void execute() {
		for(int i=0; i<this.boucle; i++) {
			JOptionPane.showMessageDialog(null, message);
			this.compteur ++;
		}
		
	}

	@Override
	public boolean estFini() {
		if(this.compteur == this.boucle) {
			this.fini = true;
			return fini;
		} else {
			return false;
		}
	}

	@Override
	public int getPriorite() {
		return this.priorite;
	}
	
	public static void main (String [] args) {
		ProcessusBoucleur pa = new ProcessusBoucleur();
		pa.execute();
		System.out.println(pa.estFini() + " et priorite :" + pa.getPriorite() + " et boucle :" + pa.boucle);
	}
}	
