/**
 * Class abstraite EnsembleAvecBooleen
 * @author Frédéric
 *  Semaine 8 TP 1
 */
public class EnsembleAvecBooleen {

	Boolean [] tab;
	Integer max;
	
	public EnsembleAvecBooleen (Integer max) {
		tab = new Boolean [max];
		for(int i=0;i<max;i++){
			tab[i] = false;
		}
		this.max = max;
	}
	
	public boolean add(Integer i) {
		if(tab[i] == false || i<max) {
			tab[i] = true;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isEmpty() {
		boolean b = true;
		for(boolean bo:tab){
			if(bo == true && b == true) {
				b= false;
			}
		}
		return b;
	}
	
	public void clear () {
		for(int i=0;i<size();i++){
			tab[i] = false;
		}
	}
	
	public boolean remove(Integer i) {
		if(tab[i] == true || i>max) {
			tab[i] = false;
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		String res = "{";
		int i = 0;
		boolean b = true;
		while (b) {
			if(tab[i] == true) {
				res += i;
				b = false;
			} else {
				i++;
				if(i==size()) {
					b=false;
				}
				
			}
		}
		for(int j = i; i<size();i++) {
			if(tab[j] == true) {
				res += ";" + j;
			}
		}	
		res += "}";
		return res;
	}
	
	public boolean contains (Integer i) {
		if(tab[i] == true) {
			return true;
		} else {
			return false;
		}
	}
	
	public int size() {
		return tab.length;
	}

}
