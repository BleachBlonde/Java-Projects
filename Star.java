package assignment_2;

import java.awt.Color;
import java.awt.Graphics;

public class Star {
	private int x, y, width, p1x, p1y, p2x, p2y, p3x, p3y;
	private int p4x, p4y, p5x, p5y;
	private Color color;
	
	public Star(int size, int topX, int topY) {
		width = size;
		x = topX;
		y = topY;
	}
	
	public void draw(Graphics page) {
		page.setColor(Color.white);
		p1x = x + width/2;
		p1y = y;
		p2x = x + width;
		p2y = (int)((y) + .4*(double)(width));
		p3x = (int)((x) + .8*(double)(width));
		p3y = y + width;
		p4x = (int)((x) + .2*(double)(width));
		p4y = y + width;
		p5x = x;
		p5y = p2y;
		
		page.drawLine(p1x, p1y, p3x, p3y);
		page.drawLine(p2x, p2y, p4x, p4y);
		page.drawLine(p3x, p3y, p5x, p5y);
		page.drawLine(p4x, p4y, p1x, p1y);
		page.drawLine(p5x, p5y, p2x, p2y);
		
		
	}
	
	public void setWidth(int size)
	{
		width = size;
	}

	public void setColor(Color shade)
	{
		color = shade;
	}

	public void setX(int upperX)
	{
		x = upperX;
	}

	public void setY(int upperY)
	{
		y = upperY;
	}

	public int getDiameter()
	{
		return width;
	}

	public Color getColor()
	{
		return color;
	}

	public int getX()
	{
		return x;
	}

	public int getY()
	{
		return y;
	}
}
