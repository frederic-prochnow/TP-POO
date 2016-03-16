package iterable;

import java.util.Iterator;

public class PlateauIterator implements Iterator<Integer>{

	int [][] tableau;
	int x;
	int y;
	
	PlateauIterator (int[][] tab) {
		tableau = tab;
	}

	// si hasnext (si il est possible de passer a la case suivante)
	// alors next (donne la valeur de la case suivante et incrémente)
	
	@Override
	public boolean hasNext() {
		boolean b = false;
		if (this.x == tableau.length && this.y == tableau[0].length) {
			b= true;
		} else {
			b = false;
		}
		return b;
	}

	@Override
	public Integer next() {
		if(! this.hasNext()) {
			return tableau[x][y];
		} else {
			return null;
		}
	}

}
