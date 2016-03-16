public class Inscrit {

    String Dossard;
    int score;
    int temps;
    
    public Inscrit(int dossard, int score, int min, int sec) {
	if (dossard <1 || dossard >100 ||
	    score <0 || score >50 ||
	    temps <0 || temps >60) {
	    dossard = null;
	}
	else {
	    this.score = score;
	    this.temps = temps;
	    this.dossard = dossard;
	}
    }
    
    public String toString() {
	Dossard = String.valueOf(dossard);
	Dossard = "N°"+ Dossard;
	temps = min * 60 + sec;
	return ("[" + Dossard +": "+ score + " - " + temps +" sec]");
    }
}
