package assignment_4;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings("serial")

public class Part_4_Animation extends JPanel {
	private final int HEIGHT = 800; 
	private final int BASE = 1000;
	private Timer timer;
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
	//Road
	private int xRoad[] = {0, 1000, 1000, 0};
	private int yRoad[] = {540, 540, 800, 800};
			
	public Part_4_Animation() {
		setBackground(Color.BLUE);
		setPreferredSize(new Dimension(BASE, HEIGHT));
		final int DELAY = 5;
	    timer = new Timer(DELAY, new CarMover());
	    timer.start();
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
		g2.setColor(Color.BLACK);
		g2.fillPolygon(xRoad, yRoad, xRoad.length);
	}
	  private class CarMover implements ActionListener {
		    public void actionPerformed(ActionEvent event) {
		    //Allow for the car to move on a timer
		    //This is for moving the body in the X direction
		      for (int i = 0; i < xBody.length; i++) {
		    	  xBody[i]++;
		      }
		    //Moves wind-shield in the X direction
		      for (int i = 0; i < xWind.length; i++) {
		    	  xWind[i]++;
		      }
		    //Moves window in the X direction
		      for (int i = 0; i < xWind2.length; i++) {
		    	  xWind2[i]++;
		      }
		    //Moves tire 1 in the X direction
		      for (int i = 0; i < xTire1.length; i++) {
		    	  xTire1[i]++;
		      }
		    //Moves tire 2 in the X direction
		      for (int i = 0; i < xTire2.length; i++) {
		    	  xTire2[i]++;
		      }
		    	  
		      repaint();
		    }
		  }
}
