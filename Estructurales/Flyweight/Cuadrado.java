package Flyweight;

import java.awt.*;
public class Cuadrado extends Figura
{
	public Cuadrado(Color color)
	{
		super(color);
	}
	
	public void dibujar(Graphics g, int x, int y, int lado)
	{
		g.setColor(color);
		g.drawRect(x, y, lado, lado);
	}
}