import java.util.ArrayList;
import java.util.List;

public class EnsembleAvecArrayList {

	List <Integer> tab = new ArrayList <>();
	Integer max;
	
	public EnsembleAvecArrayList(Integer max){
		this.max = max;
	}
	
	public boolean add(Integer i){
		if(tab.contains(i) || i>max){
			return false;
		} else {
			tab.add(i);
			return true;
		}
	}
	
	public boolean isEmpty() {
		boolean b = true;
		for(int i=0; i<max;i++) {
			if(tab.contains(i)&& b == true) {
				b= false;
			}
		}
		return b;
	}
	
	public void clear() {
		tab.clear();
	}
	
	
	public boolean remove(Integer i) {
		if(tab.contains(i)){
			tab.remove(i);
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		// version non trier en croissant et 
		// non respect de la typographie demander
		String res ="{";
		for(Integer i:tab) {
			res += i + ";";
		}
		res += "}";
		return res;
	}
	
	public boolean contains(Integer i){
		for(Integer j : tab) {
			if(j.equals(i)) {
				return true;
			} 
		}
		return false;
	}
	
	public int size() {
		return tab.size();
	}

}
