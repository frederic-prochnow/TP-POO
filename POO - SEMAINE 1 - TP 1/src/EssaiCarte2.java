import java.util.Random;
public class EssaiCarte2 {
    public static void main(String [] args) {
	Random alea = new Random();
	Carte c1 = new Carte (alea.nextInt(5),alea.nextInt(8));
	Carte c2 = new Carte (alea.nextInt(5),alea.nextInt(8));
	System.out.println("c1 : " + c1.toString());
	System.out.println("c2 : " + c2.toString());
	int res = c1.compareTo(c2);
	if (res ==0) {
	    System.out.println("PAREIL");
	}
	if (res <0) {
	    System.out.println("C2 WINNER");
	}
	if (res >0) {
	    System.out.println("C1 WINNER");
	}
    }
}
