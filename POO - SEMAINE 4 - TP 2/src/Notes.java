import java.util.HashMap;
import java.util.Random;
import javax.swing.JOptionPane;
public class Notes {
    public static void main (String [] args) {
	Random alea = new Random();
	JOptionPane Jop = new JOptionPane();
	
	String [] nom = {"Pierre","Paul","Jacques","Vincent","Francois"};

	Integer [] npierre   = new Integer [5];
	Integer [] njacques  = new Integer [5];
	Integer [] nfrancois = new Integer [5];
	Integer [] npaul     = new Integer [5];
	Integer [] nvincent  = new Integer [5];

	for (int i =0; i<5; i++) {
	    int nb = alea.nextInt(10)+10;
	    npierre[i] = nb;   njacques[i] = nb;  nfrancois[i] = nb;
	    npaul[i] = nb;      nvincent[i] = nb;
	}
	
	HashMap<String,Integer[]> etunote = new HashMap<>();
	etunote.put("pierre",npierre);
	etunote.put("jacques",njacques);
	etunote.put("francois",nfrancois);
	etunote.put("paul",npaul);
	etunote.put("vincent",nvincent);

	Jop.showMessageDialog(null,"Bonjour");
	String res = Jop.showInputDialog("Merci de donner le nom de l'etudiant :");
	boolean b = false;
	while (b != true) {
	    if (etunote.containsKey(res)) {
		String message = res + " a eu pour note ...";
		String r = "n"+res;
		Jop.showMessageDialog(null,message + "\n" +
				      etunote.get(res).toString());
		b = true;
	    } else {
		Jop.showMessageDialog(null,"erreur, merci de resaisir le nom!");
		res = Jop.showInputDialog("Merci de donner le nom de l'etudiant :");
	    }
	}
	Jop.showMessageDialog(null,"Merci et a bientot!!");
    }
}

