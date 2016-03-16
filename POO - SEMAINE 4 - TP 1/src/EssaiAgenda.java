import java.util.GregorianCalendar;
import java.util.ArrayList;
public class EssaiAgenda {
    public static void main (String [] args) {
	Agenda agenda = new Agenda();
	GregorianCalendar date1 = new GregorianCalendar(2015,03,25);
	GregorianCalendar date2 = new GregorianCalendar(2015,03,27);
	GregorianCalendar date3 = new GregorianCalendar(2015,03,28);
	GregorianCalendar date4 = new GregorianCalendar(2015,03,29);
	Evenement evenement1 = new Evenement("EVENT1","LILLE",date1,date2);
	Evenement evenement2 = new Evenement("EVENT2","LILLE",date3,date4);
	Evenement evenement3 = new Evenement("EVENT3","LILLE",date1,date2);
	agenda.entrerEvenement(evenement1);
	agenda.entrerEvenement(evenement2);
	agenda.entrerEvenement(evenement3);
	System.out.println(agenda.toString());
    }
}
