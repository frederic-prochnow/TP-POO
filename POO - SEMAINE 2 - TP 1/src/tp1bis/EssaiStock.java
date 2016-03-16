public class EssaiStock {
    public static void main (String [] args) {

	Stock stock = new Stock(20);
	int stock_total = 0;
	
	stock.ajoutArticle(new ArticlesEnStock("PC","xdf10"));
	stock.ajoutArticle(new ArticlesEnStock("ECRAN","koz106"));
	//System.out.println(stock.toString());
	stock.getArticleByPosition(0).ajouter(20);
	stock.getArticleByPosition(1).ajouter(30);
	//System.out.println(stock.toString());
	stock.getArticleByPosition(1).retirer(10);
	for(int i=0; i< stock.nbReferences() ; i++) {
	    stock_total = stock_total + stock.getArticleByPosition(i).getQuantite();
	}
	System.out.println(stock.toString());
	System.out.println("TOTAL : " + stock_total);
    }
}
	
