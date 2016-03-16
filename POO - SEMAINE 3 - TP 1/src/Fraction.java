public class Fraction {
    int inf,sup;
    Fraction (int sup,int inf) {
	this.sup = sup;
	this.inf = inf;
    }

    public String toString() {
	return this.sup + " / " + this.inf;
    }

    int compareTo (Fraction fraction) {
	double f1 = this.sup / this.inf;
	double f2 = fraction.sup / fraction.inf;
	if(f1==f2) return 0;
	else if(f1<f2)  return -1;
	else  return 1;
    }

    Fraction somme (Fraction fraction) {
	if(this.inf==fraction.inf) {
	    return new Fraction((this.sup + fraction.sup),this.inf);
	} else {
	    int inf  = fraction.inf * this.inf ;
	    return new Fraction(((fraction.sup * this.inf) +
				 (this.sup * fraction.inf)),inf);
	}
    }

    void additionner (Fraction fraction) {
	if(this.inf==fraction.inf) {
	    this.inf = this.inf;
	    this.sup += fraction.sup;
	} else {
	    this.sup = (fraction.sup * this.inf) + (this.sup * fraction.inf);
	    this.inf = fraction.inf * this.inf ;
	}
    }

    Fraction produit (Fraction fraction) {
	return new Fraction((this.sup * fraction.sup),(this.inf * fraction.inf));
    }

    Fraction produit (int entier) {
	return new Fraction((this.sup * entier),this.inf);
    }

    void multiplier (Fraction fraction) {
	this.sup = this.sup * fraction.sup ;
	this.inf = this.inf * fraction.inf ;
    }

    void multiplier (int entier) {
	this.sup = this.sup * entier ;
	this.inf = this.inf;
    }
	
    public static void main (String [] args) {
	Fraction f1 = new Fraction (1,3);
	Fraction f2 = new Fraction (1,6);
	Fraction f3 = f1.somme(f2);
	Fraction f4 = f1.produit(f2);
	Fraction f5 = f1.produit(3);
	System.out.println("CALCUL 1 : f1 (" + f1.toString() +
			   ") + f2 (" + f2.toString() + ");" );
	
	//System.out.println("AVANT : " + f3.toString()) ;
	f1.additionner(f2);
	System.out.println("APRES : " + f1.toString());

	
	System.out.println("CALCUL 2 : f1 (" + f1.toString() +
			   ") X f2 (" + f2.toString() + ");" );

	//System.out.println("AVANT : " + f4.toString()); 
	f1.multiplier(f2);
	System.out.println("APRES : " + f1.toString());

	
	System.out.println("CALCUL 3 : f1 (" + f1.toString() +
			   ") X 3;" );
	
	//System.out.println("AVANT : " + f5.toString());
	f1.multiplier(3);
	System.out.println("APRES : " + f1.toString());
    }
}
