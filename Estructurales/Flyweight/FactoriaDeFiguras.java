package Flyweight;

import java.util.*;
import java.awt.*;

public class FactoriaDeFiguras
{
	//store color
   	private static final Hashtable circulosPorColor = new Hashtable();
	private static final Hashtable cuadradosPorColor = new Hashtable();
	
   	public static final int CUADRADO = 0;
	public static final int CIRCULO = 1;
	Figura fig;
	
	public Figura getFigura(int tipo, Color color)
	{
		if (tipo == this.CUADRADO)
		{
			fig = (Cuadrado) cuadradosPorColor.get(color);
			if (fig == null)
			{
				fig = new Cuadrado(color);
				cuadradosPorColor.put(color,fig);
				System.out.println("Creamos un cuadrado de color: " + color);
			}
			return fig;
		}
		else
		{
			fig = (Circulo) circulosPorColor.get(color);
			if (fig == null)
			{
				fig = new Circulo(color);
				circulosPorColor.put(color,fig);
				System.out.println("Creamos un circulo de color: " + color);
			}
			return fig;			
		}
	}   	

}