package tp;
/**
 * Class EssaiOrdonnanceur
 * @author Fr�d�ric
 * TP 2 -  semaine 6
 */
public class EssaiOrdonnanceur {

	/**
	 * Main
	 * @param args
	 */
	public static void main(String[] args) {
		OrdoFile o = new OrdoFile();
		Tache t1 = new Tache("tache t1",4);
		Tache t2 = new Tache("tache t2",2);
		Tache t3 = new Tache("tache t3",6);
		o.ajouteObjet(t1);
		o.ajouteObjet(t2);
		o.ajouteObjet(t3);
		while(!o.estVide()){
			System.out.println(o.plusPrioritaire());
		}
		//System.out.println("t1 : priorit�" + t1.getPriorite() + " - intitul� :" + t1.intitule);
		//System.out.println("t2 : priorit�" + t2.getPriorite() + " - intitul� :" + t2.intitule);
		//System.out.println("t3 : priorit�" + t3.getPriorite() + " - intitul� :" + t3.intitule);
	}

}
