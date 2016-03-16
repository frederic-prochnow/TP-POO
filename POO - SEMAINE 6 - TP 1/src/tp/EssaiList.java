package tp;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Frédéric
 *
 */
public class EssaiList {

	public static void main(String[] args) {
		List<String> liste = new ArrayList<>();
		liste.add("a");
		liste.add("b");
		liste.add("c");
		liste.add("abc");
	
		for(String s: liste) {
			System.out.println(s);
		
		}
	}
}
