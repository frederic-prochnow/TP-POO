
public class SuperStock {
	private Stock a;

	public void ajoutArticle(ArticlesEnStock c) {
		a.ajoutArticle(c);
	}

	public boolean equals(Object obj) {
		return a.equals(obj);
	}

	public ArticlesEnStock getArticleByPosition(int num) {
		return a.getArticleByPosition(num);
	}

	public int hashCode() {
		return a.hashCode();
	}

	public int nbReferences() {
		return a.nbReferences();
	}

	public String toString() {
		return a.toString();
	}
	
	ArticlesEnStock getByNom(String nom) {
		for(int i=0; i<a.nbReferences();i++) {
			if(a.getArticleByPosition(i).getNom().equals(nom)) {
				return a.getArticleByPosition(i);
			}	
		}
		return null;
	}
	ArticlesEnStock getByCode(String code) {
		for(int i=0; i<a.nbReferences();i++) {
			if(a.getArticleByPosition(i).getCode().equals(code)) {
				return a.getArticleByPosition(i);
			}	
		}
		return null;
	}

}
