public class EssaiRoller {
    public static void main (String [] args) {
	Inscrits [] tableau = new Inscrits [7];
	tableau [0] = new Inscrits(1,45,15,20);
	tableau [1] = new Inscrits(2,32,12,45);
	tableau [2] = new Inscrits(5,12,13,59);
	tableau [3] = new Inscrits(12,12,15,70);
	tableau [4] = new Inscrits(32,75,15,20);
	tableau [5] = new Inscrits(112,75,15,20);

	int i = 0;
	while (tableau [i] != null && i<tableau.length) {
	    System.out.println(tableau[i].toString());
	    i++;
	}
    }
}
