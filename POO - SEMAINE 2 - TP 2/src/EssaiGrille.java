public class EssaiGrille {
    public static void main (String [] args) {
	Grille g = new Grille(3,5);
	g.remplir(0,100);
	g.afficher();
	g.fenetre(3,5);
    }
}
