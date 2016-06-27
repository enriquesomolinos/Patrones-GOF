package Flyweight;

import java.awt.*;
public abstract class Figura
{		
	protected Color color;
	
	public Figura(Color color)
	{			
		this.color = color;
	}
			
	public Color getColor()
	{
		return this.color;
	}
	
	public abstract void dibujar(Graphics g, int x, int y, int lado);
}