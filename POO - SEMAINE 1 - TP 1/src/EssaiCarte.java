public class EssaiCarte {
    public static void main (String [] args) {
	for(int i=0; i<4; i++) {
	    for(int j=0; j<7; j++) {
		System.out.println((new Carte(i,j)).toString());
	    }
	}
    }
}
