package assignment_2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")

public class StarPanel extends JPanel{
	int i=0;
	private Star star1, star2, star3, star4, star5, star6;
	public StarPanel() {
		star1 = new Star(37, 30, 80);
		star2 = new Star(30, 100, 20);
		star3 = new Star(35, 150, 30);
		star4 = new Star(50, 200, 55);
		star5 = new Star(40, 250, 40);
		star6 = new Star(40, 300, 50);
		
		setPreferredSize(new Dimension(350, 500));
		setBackground(Color.darkGray);
	}
	
	public void paintComponent(Graphics page) {
		super.paintComponent(page);
		
		star1.draw(page);
		star2.draw(page);
		star3.draw(page);
		star4.draw(page);
		star5.draw(page);
		star6.draw(page);
		
	}
}
