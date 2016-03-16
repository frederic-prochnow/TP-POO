import java.util.HashMap;
public class Etudiant {
    HashMap<String,Integer> etunote = new HashMap<>();
    HashMap<String,HashMap<String,Integer>> hashmap = new HashMap<>();
    String nom;

    Etudiant(String nom) {
	this.nom = nom;
    }

    void add(String module,Integer note) {
	etunote.put(module,note);
    }

    public String toString() {
	return "Note"+ etunote.toString();
    }
    
    public static void main (String [] args) {
	Etudiant Pierre = new Etudiant("pierre");
	Etudiant Paul = new Etudiant("paul");
	Etudiant Jacques = new Etudiant("jacques");
	Etudiant Vincent = new Etudiant("vincent");
	Etudiant Francois = new Etudiant("francois");
	HashMap<String,Etudiant> hashmap = new HashMap<>();
	hashmap.put("pierre",Pierre);
	hashmap.put("paul",Paul);
	hashmap.put("jacques",Jacques);
	hashmap.put("vincent",Vincent);
	hashmap.put("francois",Francois);
	Pierre.add("BDD",14);
	Paul.add("Algo",15);
	Jacques.add("POO COO", 16);
	Vincent.add("Codage",17);
	Francois.add("Systeme",18);
	System.out.println(Pierre.toString());
    }
}
