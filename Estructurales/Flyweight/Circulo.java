package Flyweight;

import java.awt.*;
public class Circulo extends Figura
{
	public Circulo(Color color)
	{
		super(color);
	}
	
	public void dibujar(Graphics g, int x, int y, int lado)
	{
		g.setColor(color);
		g.drawArc(x, y, lado, lado, 0, 360);
	}
}