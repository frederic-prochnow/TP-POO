import java.util.List;
import java.util.ArrayList;

public class Mediatheque {

	/**
	 * @return le d
	 */
	public List<Document> getM() {
		return d;
	}

	/**
	 * @param d le d à définir
	 */
	public void setM(List<Document> d) {
		this.d = d;
	}
	
	private List <Document> d;
		
	public Mediatheque(){
		d= new ArrayList <Document>();
	 }
	 
	 public void ajouterDocument(Document document){
		 this.d.add(document);
	 }
	 
	 public Document rechercherCote(String cote){
		 for (Document doc : this.d) {
			 if(doc.getCote().equals(cote)) {
				 return doc;
			 }
		 }
		 return null;
	 }
	 
	 public void afficherEmprunts () {
		 for (Document doc : this.d) {
			 if(doc.estLibre()) {
				 System.out.println("Le document " + doc.getTitre() + " n'est pas encore emprunter;");
			 } else {
				 System.out.println("Le document " + doc.getTitre() + "est emprunter par l'emprunteur" + doc.getEmprunteur() + ";");
			 }
		 }
		 System.out.println("Aucun emprunt est en cours pour la médiathéque !;");
	 }
	 
	 public boolean emprunter(String cote, int emprunteur) {
		 Document doc = rechercherCote(cote);
		 return doc.emprunt(emprunteur);
	 }
	 
	 public boolean restituer(String cote) {
		 Document doc = rechercherCote(cote);
		 return doc.restitution();
	 }
}	

