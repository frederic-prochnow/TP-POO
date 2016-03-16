import java.util.GregorianCalendar;
public class Evenement {
    String intitule, lieu;
    GregorianCalendar debut, fin;

    Evenement(String intitule,String lieu,
	      GregorianCalendar debut,GregorianCalendar fin,Contact contact) {
	this.intitule = intitule;
	this.lieu     = lieu;
	this.debut    = debut;
	this.fin      = fin;
	this.contact = contact;
    }

    public String toString() {
	return "[" + this.intitule + "_aura lieu a_" + this.lieu
	    + "_ a la date du_" +
/	    this.debut.DAY_OF_MONTH + "/" +
	    this.debut.MONTH + "/" +
	    this.debut.YEAR+ "_jusqu'en date du_" +
	    this.fin.DAY_OF_MONTH + "/" +
	    this.fin.MONTH + "/" +
	    this.fin.YEAR + "]"+ "\n";
    }

    boolean equals(Evenement evenement) {
	if(this.intitule.equals(evenement.intitule) &&
	   this.lieu.equals(evenement.lieu) &&
	   this.debut.equals(evenement.debut) &&
	   this.fin.equals(evenement.fin)) {
	    return true;
	} else {
	    return false;
	}
    }

    boolean chevauche(Evenement evenement) {
	if(this.fin.before(evenement.debut) &&
	   evenement.fin.before(this.debut)) {
	    return false;
	} else {
	    return true;
	}
    }   
}
    
