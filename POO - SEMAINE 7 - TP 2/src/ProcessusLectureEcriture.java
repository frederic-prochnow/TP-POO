/**
 * Interface processus
 * @author Frédéric
 * TP 2 semaine 7
 */
import javax.swing.JOptionPane;
public class ProcessusLectureEcriture implements Processus,Prioritaire {

	private int priorite;
	private String message;
	private int boucle;
	private int compteur;
	private boolean fini;

	/* !CodeTemplates.overridecomment.nonjd!
	 * @see Prioritaire#getPriorite()
	 */
	@Override
	public int getPriorite() {
		return this.priorite;
	}

	/* !CodeTemplates.overridecomment.nonjd!
	 * @see Processus#execute()
	 */
	@Override
	public void execute() {
		if (this.compteur == 1) {
			this.message = JOptionPane.showInputDialog("Quel est votre message ?");
			this.compteur ++;
		}
		if (this.compteur == 2) {
			JOptionPane.showMessageDialog(null, message);
		}
		
	}

	/* !CodeTemplates.overridecomment.nonjd!
	 * @see Processus#estFini()
	 */
	@Override
	public boolean estFini() {
		if(this.compteur == this.boucle) {
			this.fini = true;
			return fini;
		} else {
			return false;
		}
	}

	public ProcessusLectureEcriture() {
		this.priorite = 1;
		this.boucle = 2;
		this.compteur = 1;
		this.fini = false;
	}
	public static void main (String [] args) {
		ProcessusLectureEcriture pa = new ProcessusLectureEcriture();
		pa.execute();
		System.out.println(pa.estFini() + " et priorite :" + pa.getPriorite() + " et boucle :" + pa.boucle);
	}

}
