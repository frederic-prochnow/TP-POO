
import java.util.GregorianCalendar;

public class EssaiMediatheque {

	public static void main(String[] args) {
		Mediatheque m = new Mediatheque();
		GregorianCalendar c1 = new GregorianCalendar(2016,01,01);
		GregorianCalendar c2 = new GregorianCalendar(2016,01,02);
		GregorianCalendar c3 = new GregorianCalendar(2016,01,03);
		GregorianCalendar e1 = new GregorianCalendar(2017,01,01);
		GregorianCalendar e2 = new GregorianCalendar(2018,01,02);
		GregorianCalendar e3 = new GregorianCalendar(2019,01,03);
		Document d1 = new Document("d1","a1",c1,"d1a1-01012016",e1,e2);
		Document d2 = new Document("d2","a2",c2,"d2a2-01022016",e2,e3);
		Document d3 = new Document("d3","a3",c3,"d3a3-01032016",e3,e3);
		//Document l1 = new Livre("l1","a4",c1,"l1a4-01012016",e1,"e1",60);
		//Document v1 = new Dvd("v1","a5",c2,"v1a5-01022016",e3,"p1",62);
		m.ajouterDocument(d1);
		m.ajouterDocument(d2);
		m.ajouterDocument(d3);
		//m.ajouterDocument(l1);
		//m.ajouterDocument(v1);
		//for(Document doc : m.getM()) {
		//	System.out.println(doc.toString());
		//}
		System.out.println(d2.dureeEmprunt());
		//m.afficherEmprunts();

	}

}
