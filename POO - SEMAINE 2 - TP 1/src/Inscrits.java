public class Inscrits {

    String dossard;
    int score;
    int temps;
    
    public Inscrits(int dossard, int score, int min, int sec) {
	if (dossard <1 || dossard >100 ||
	    score <0 || score >50 ||
	    temps <0 || temps >60) {
	    dossard = 0;
	    this.temps = 0;
	}
	else {
	    this.score = score;
	    this.temps = temps;
	    temps = min * 60 + sec;
	}
	this.dossard = String.valueOf(dossard);
	this.dossard = "N"+ this.dossard;
    }
    
    public String toString() {
	return ("[" + dossard +": "+ score + " - " + temps +" sec]");
    }
}
