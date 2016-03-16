import java.util.Random;
public class EssaiCarte3 {
    public static void main(String [] args) {
	Random rd = new Random();
	Carte carte = new Carte (rd.nextInt(4),rd.nextInt(8));
	for(int i=0; i<9;i++) {
	    Carte c = new Carte (rd.nextInt(4),rd.nextInt(8));
	    if(carte.compareTo(c) >0) {
		carte = c;
	    }
	}
	System.out.println(carte);
    }
}
