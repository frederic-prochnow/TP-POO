package cartman;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Cartman extends JFrame{
	public 	Cartman(String titre, int x,int y, int largeur,int hauteur) {
		super(titre);						//titre de la fenêtre
		this.setLocation(x,y); 				//position de la fenêtre
		this.setSize( largeur, hauteur ); 	//taille de la fenêtre
		this.setVisible( true );			// rend visible l'objet	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fermeture automatique	
	}
	
	public void paint (Graphics g){		
		g.setColor(Color.RED);
		g.fillOval(150, 200, 200, 150);
	
		Color BROWN = new Color(90,58,34);
		int [] x = {160,340,320,180};
		int [] y = {310,310,350,350};
		g.setColor(BROWN);
		g.fillPolygon(x,y,4);	
		
		g.setColor(Color.BLACK);
		g.fillOval(240, 250, 10, 10);
		g.fillOval(240, 270, 10, 10);
		g.fillOval(240, 290, 10 , 10);
		
		g.setColor(Color.YELLOW);
		g.fillOval(125,260,50,40);
		g.fillOval(325,260,50,40);
		
		
		g.setColor(Color.PINK);
		g.fillOval(145,100,200,150);

		g.setColor(Color.WHITE);
		g.fillOval(260,150,40,60);
		g.fillOval(200,150,40,60);
		
		g.setColor(Color.BLACK);
		g.fillOval(220,180,10,10);
		g.fillOval(270,180,10,10);
		
		g.fillArc(195,340,50,20,0,180);
		g.fillArc(255,340,50,20,0,180);
		
		g.setColor(Color.BLUE);
		g.fillArc(150,95,190,110,0,180);
		
		g.setColor(Color.YELLOW);
		g.fillOval(220,90,50,20);
		
		
		
	}
	public static void main(String[] args) {	
		new Cartman("Cartman",300,160,500,500);		
	}	
}
