package assignment_4;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

@SuppressWarnings("serial")

public class Part_2_Car extends JPanel {
	private final int HEIGHT = 800; 
	private final int BASE = 1000;
	
	//Body of the car
	private int xBody[] = {190,195,200, 300, 400, 450, 500, 510, 515, 515, 510, 505, 490, 450, 200, 195, 190,190};
	private int yBody[] = {410,405,400, 400, 400, 450, 450, 460, 475, 500, 505, 510, 515, 515, 515, 510, 505,410};
	//Wind-shield of the car 
	private int xWind[] = {400, 400, 450};
	private int yWind[] = {400, 450, 450};
	//Window
	private int xWind2[] = {325, 325, 360, 360};
	private int yWind2[] = {410, 448, 448, 410};
	//Back tire
	private int xTire1[] = {235, 250, 250, 235, 220, 220, 235};
	private int yTire1[] = {500, 510, 525, 535, 525, 510, 500};
	//Front tire
	private int xTire2[] = {420, 435, 435, 420, 405, 405, 420};
	private int yTire2[] = {500, 510, 525, 535, 525, 510, 500};
			
	public Part_2_Car() {
		setBackground(Color.BLUE);
		setPreferredSize(new Dimension(BASE, HEIGHT));
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(5));
		//Colors in the body
		g2.setColor(Color.DARK_GRAY);
		g2.fillPolygon(xBody, yBody, xBody.length);
		//Colors in the wind-shield
		g2.setColor(Color.LIGHT_GRAY);
		g2.fillPolygon(xWind, yWind, xWind.length);
		//Colors in the window
		g2.setColor(Color.LIGHT_GRAY);
		g2.fillPolygon(xWind2, yWind2, xWind2.length);
		//Colors in the back tire
		g2.setColor(Color.BLACK);
		g2.fillPolygon(xTire1, yTire1, xTire1.length);
		//Colors in the front tire
		g2.setColor(Color.BLACK);
		g2.fillPolygon(xTire2, yTire2, xTire2.length);
		
		
	}
}
