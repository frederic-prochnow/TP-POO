/**
 * Class EssaiPoste
 * Class de test des différents fichiers
 * @author Frédéric
 * Semaine 8 tp2
 */
public class EssaiPoste {
	public static void main(String [] args) {
		Poste poste = new Poste("Fred");
		poste.add(ecran);
		poste.add(clavier);
		poste.add(souris);
		poste.add(unite_central);
		Piece ecran = new Piece("Ecran",1340);
		Piece clavier = new Piece("Clavier",1934);
		Piece souris = new Piece("Souris",2805);
		Element unite_central = new Element("Unité centrale");
			Piece carte_mere = new Piece("Carte mère",1569);
			Piece extension_memoire = new Piece("Expension mémoire",289);
			Piece disque_scsi = new Piece("Disque SCSI",289);
			unite_central.add(carte_mere);
			unite_central.add(extension_memoire);
			unite_central.add(disque_scsi);
			unite_central.add(carte_graphique);
			Element carte_graphique = new Element("Carte graphique");
				Piece processeur_graphique = new Piece("Processeur graphique",7289);
				carte_graphique.add(processeur_graphique);
				carte_graphique.add(extension_memoire);
		System.out.println(poste.toString());
	}
	
}
