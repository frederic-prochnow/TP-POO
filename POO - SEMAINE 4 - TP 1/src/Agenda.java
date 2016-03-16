import java.util.GregorianCalendar;
import java.util.ArrayList;
public class Agenda {
    ArrayList<Evenement> evenement = new ArrayList<>(10);
    
    public String toString () {
	String res ="";
	for(int i=0; i<evenement.size(); i++) {
	    res = res + evenement.get(i).toString();
	}
	return res;
    }
    
    boolean entrable(Evenement evenement2) {
	for(int i=0; i<9; i++) {
	    if(evenement.get(i).equals(evenement2) &&
	       evenement.get(i).chevauche(evenement2)) {
		return false;
	    }
	}
	return true;
    }
    
    void entrerEvenement(Evenement evenement2) {
	evenement.add(evenement2);
    }
    
    void supprimerEvenement(Evenement evenement2) {
	evenement.remove(evenement2);
    }
    
    void supprimerEvenement(int indice) {
	evenement.remove(indice);
    }
    
    void supprimerChevauchements(Evenement evenement2) {
	for(int i=0; i<10; i++) {
	    if(evenement.get(i).chevauche(evenement2)) {
		supprimerEvenement(i);
	    }
	}
    }

    String contact() {
	return this.contact.toString();
    }

    String contactperiode(Date date1,Date date2) {
	if(this.debut.equals(date1) && this.fin.equals(date2)) {
	    return this.contact.toString();
	}
    }

    String contactevent(Evenement evenement2) {
	return evenement2.contact.toString();
    }    
}
