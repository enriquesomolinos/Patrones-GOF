package FactoryMethod;

import java.awt.*;
public class Circulo extends Figura
{
	public Circulo(int lado)
	{
		super (lado);
	}
	public double getArea()
	{
		return (Math.PI * lado * lado);
	}
	public void dibujar(Graphics g, int x, int y)
	{
		g.setColor (Color.black);
		g.drawArc (x, y, lado, lado, 0, 360);
	}
}