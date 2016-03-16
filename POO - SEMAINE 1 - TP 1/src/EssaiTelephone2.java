import java.util.Random;
public class EssaiTelephone2 {
    public static void main (String [] args) {
	Random alea = new Random();
	for (int i=0; i<5; i++) {
	    int nb1 = alea.nextInt(9)+1;
	    int nb2 = alea.nextInt(100);
	    int nb3 = alea.nextInt(100);
	    int nb4 = alea.nextInt(100);
	    int nb5 = alea.nextInt(100);
	    Telephone numero = new Telephone (nb1,nb2,nb3,nb4,nb5);
	    numero.toString();
	    System.out.println(numero);
	}
    }
}
