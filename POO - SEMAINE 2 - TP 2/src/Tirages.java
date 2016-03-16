import java.util.Random;
public class Tirages {
    public static void main (String [] args) {

	int [] nb = new int [10] ;
	Random alea = new Random();
	int nb_de_nb = alea.nextInt(6)+5;
	int somme = 0;
	double moyenne = 0.0;
	int minimum = 20;
	int maximum = 0;
	
	System.out.print("Liste generee : ");
	for (int i=0; i< nb_de_nb ; i++) {
	    nb [i] = alea.nextInt(11)+10;
	    System.out.print(" " + nb[i] + " ");
	    somme = somme + nb [i];
	}
	System.out.println();
	System.out.print("Moyenne = ");
	moyenne = ((double)somme) / ((double)nb_de_nb);
	System.out.println(moyenne);
	for (int i=0; i< nb_de_nb ; i++) {
	    if(minimum > nb [i]) {
		minimum = nb [i];
	    }
	    if(maximum < nb [i]) {
		maximum = nb [i];
	    }
	}
	System.out.println("Minimum = " + minimum);
	System.out.println("Maximum = " + maximum);
	
    }
}
	
