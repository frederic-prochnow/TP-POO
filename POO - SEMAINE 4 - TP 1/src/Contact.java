public class Contact {
    Contact(String nom,String mail) {
	this.nom = nom;
	this.mail = mail;
    }
    public String toString() {
	return "nom =" + this.nom + "-mail =" + this.mail;
    }
}
