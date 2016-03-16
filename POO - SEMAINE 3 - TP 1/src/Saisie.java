import javax.swing.JOptionPane;

public class Saisie {
    public static void main (String [] args) {
	String res = JOptionPane.showInputDialog(null,"hello world");
	int res2 = Integer.parseInt(res);
	String res3 = JOptionPane.showConfirmDialog(null,res);
    }
}
