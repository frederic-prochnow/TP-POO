import java.util.ArrayList;
public class Alphabet {
    public static void main (String [] args) {
	ArrayList<String> alphabet = new ArrayList<>(26);
	for(int i = 0; i<26; i++) {
	    int ascii = i+65;
	    char c = (char) ascii;
	    String c2 = ""+c;
	    alphabet.add(i,c2);
	}
	System.out.println("Taille : " + alphabet.size());
	System.out.println("5e el. : " + alphabet.get(4));
	System.out.println("Pos'S' : " + alphabet.indexOf("S"));
	System.out.println("Al.Ct. : " + alphabet.toString());
	alphabet.remove(3);
	alphabet.remove(3);
	alphabet.remove(3);
	System.out.println("Al.Ct. : " + alphabet.toString());
	//alphabet.add(100,"?");
	alphabet.removeAll(alphabet);
	System.out.println("Al.Ct. : " + alphabet.toString());
    }
}
