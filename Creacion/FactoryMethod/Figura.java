package FactoryMethod;

import java.awt.*;
public abstract class Figura
{
	int lado = 0;
	public Figura(int lado)
	{
		this.lado = lado;
	}
	public abstract double getArea();
	public abstract void dibujar(Graphics g, int x, int y);
}