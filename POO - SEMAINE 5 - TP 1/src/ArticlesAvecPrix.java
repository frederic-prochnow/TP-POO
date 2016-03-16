
public class ArticlesAvecPrix {
	
	private ArticlesEnStock a;
	private int prix;
	private int prixtotal;
	
	public ArticlesAvecPrix (String nom,String code,int prix) {
		this.a = new ArticlesEnStock (nom,code);
		this.prix = prix;
	}
	
	public void ajouter(int nombre) {
		a.ajouter(nombre);
		prixtotal += this.prix * nombre;
	}

	public boolean equals(Object arg0) {
		return a.equals(arg0);
	}

	public String getCode() {
		return a.getCode();
	}

	public String getNom() {
		return a.getNom();
	}

	public int getQuantite() {
		return a.getQuantite();
	}

	public int hashCode() {
		return a.hashCode();
	}

	public void retirer(int nombre) {
		a.retirer(nombre);
		prixtotal -= this.prix * nombre;
	}

	public String toString() {
		return a.toString();
	}
	
	public void setPrixUnitaire(int prix) {
		this.prix = prix;
	}
	
	public int getPrixTotal() {
		return prixtotal;
	}
	
	public int getPrixMoyen() {
		return this.prixtotal / this.getQuantite();
	}

}
