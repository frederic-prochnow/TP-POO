import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Random;
public class EssaiCalandar {
    public static int compareTo (GregorianCalendar date1, GregorianCalendar date2) {
	int day1 = date1.get(Calendar.DAY_OF_MONTH);
	int month1 = date1.get(Calendar.MONTH);
	int year1 = date1.get(Calendar.YEAR);
	int day2 = date2.get(Calendar.DAY_OF_MONTH);
	int month2 = date2.get(Calendar.MONTH);
	int year2 = date2.get(Calendar.YEAR);
	if(day1 < day2) {
	    if(month1 < month2) return 1;
	    else return 2; 
	} else return 2;
    }
    
    public static void main (String [] args) {
	GregorianCalendar date = new GregorianCalendar();
	// VERSION DATE COURANTE
	/*System.out.println(date.get(Calendar.DAY_OF_MONTH ) +
			   "/"+date.get(Calendar.MONTH)+
			   "/"+date.get(Calendar.YEAR));
	*/

	// VERSION ALEATOIRE 1990-2010
	/*Random alea = new Random();
	int day1 = alea.nextInt(30)+1; int year1 = 1990;
	int day2 = alea.nextInt(29)+1; int year2 = 2010;
	System.out.println(day1+"/"+Calendar.DECEMBER +"/"+year1);
	System.out.println(day2+"/"+Calendar.JANUARY+"/"+year2);
	*/

	// VERSION ALEATOIRE 2 DATE
	Random alea = new Random();
	int month1 = alea.nextInt(12);	int month2 = alea.nextInt(12);
	GregorianCalendar d1 = new GregorianCalendar (2016,month1,1);
	GregorianCalendar d2 = new GregorianCalendar (2016,month2,1);
	int maxday1 = d1.getActualMaximum(Calendar.DAY_OF_MONTH);
	int maxday2 = d2.getActualMaximum(Calendar.DAY_OF_MONTH);
	int day1 = alea.nextInt(maxday1+1); int day2 = alea.nextInt(maxday2+1);
	GregorianCalendar date1 = new GregorianCalendar (2016,month1,day1);
	GregorianCalendar date2 = new GregorianCalendar (2016,month2,day2);
	System.out.println(date1.get(Calendar.DAY_OF_MONTH ) + "/" + date1.get(Calendar.MONTH) + "/" + date1.get(Calendar.YEAR));
	System.out.println(date2.get(Calendar.DAY_OF_MONTH ) + "/" + date2.get(Calendar.MONTH) + "/" + date2.get(Calendar.YEAR));
	if(compareTo(date1,date2) == 1) System.out.println("date 1");
	else if(compareTo(date1,date2) == 2) System.out.println("date 2");
	else System.out.println("erreur");
    }
}
