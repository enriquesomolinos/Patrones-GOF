package FactoryMethod;

import java.awt.*;
public class Cuadrado extends Figura
{
	public Cuadrado(int lado)
	{
		super (lado);
	}
	public double getArea()
	{
		return (lado * lado);
	}
	public void dibujar(Graphics g, int x, int y)
	{
		g.setColor (Color.black);
		g.drawRect (x, y, lado, lado);
	}
}