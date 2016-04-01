package pacman;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Pacman extends JFrame{
	private int cpt ; 	
	private Color couleur1, couleur2; 
	
	public Pacman(String titre,int x,int y, int largeur,int hauteur) {		
		super(titre);
		this.setSize( largeur, hauteur );
		this.setVisible( true );
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
		this.setLocation(x,y);
		this.couleur1 = Color.BLACK;
		this.couleur2 = Color.LIGHT_GRAY;
	}
					
	public void animer (int nbr_mouvement)	{ 
		for (cpt=0; cpt<nbr_mouvement; cpt++) {				
			this.repaint();			
			try { Thread.sleep(150); } 
			catch (InterruptedException e) { e.printStackTrace(); }
		}
	}
		
	public void paint (Graphics g){		
		g.setColor(Color.GREEN);
		g.fillRect(0,0,500,500);
		if((cpt*50)<300){
		g.setColor(Color.RED);
		g.fillArc(70 + cpt*50 , 60, 50, 50, 30, 300);	
		g.setColor(Color.YELLOW);
		g.fillOval(350,80,30,30);
		}
		else if((cpt*15)<300){
			g.setColor(Color.RED);
			g.fillArc(300,cpt*15,50,50,-50,300);
		}
		else {
			g.setColor(Color.RED);
			g.fillArc(300,300,50,50,-50,300-(cpt*2));
		}
	}
	
	public static void main(String[] args) {		
		 new Pacman("Pacaman", 150, 150,500,500).animer(250);
	}	
}
