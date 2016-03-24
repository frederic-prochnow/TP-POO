/**
 * class ProcessusAfficheur
 * @author Frédéric
 * TP 2 semaine 7
 */
import javax.swing.JOptionPane;
public class ProcessusAfficheur implements Processus,Prioritaire {

	private int Priorite;
	private int execute;
	private int compteur;
	private boolean fini;
	private String message;
	
	/* !CodeTemplates.overridecomment.nonjd!
	 * @see Processus#execute()
	 */
	@Override
	public void execute() {
		for(int i=0; i<this.execute; i++) {
			JOptionPane.showMessageDialog(null, message);
			this.compteur ++;
		}
	}



	/* !CodeTemplates.overridecomment.nonjd!
	 * @see Processus#estFini()
	 */
	@Override
	public boolean estFini() {
		if(this.compteur == this.execute) {
			this.fini = true;
			return fini;
		} else {
			return false;
		}
	}



	/* !CodeTemplates.overridecomment.nonjd!
	 * @see Prioritaire#getPriorite()
	 */
	@Override
	public int getPriorite() {
		return this.Priorite;
	}
	
	

	/**
	 * 
	 */
	public ProcessusAfficheur() {
		this.Priorite = 3;
		this.execute = 1;
		this.compteur = 0;
		this.fini = false;
		this.message = JOptionPane.showInputDialog("votre message ?");
	}
	
	public static void main (String [] args) {
		ProcessusAfficheur pa = new ProcessusAfficheur();
		pa.execute();
		System.out.println(pa.estFini() + " et " + pa.getPriorite());
	}

}
