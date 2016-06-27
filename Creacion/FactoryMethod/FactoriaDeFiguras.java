package FactoryMethod;

public class FactoriaDeFiguras
{
	public static final int CUADRADO = 0;
	public static final int CIRCULO = 1;
	public Figura getFigura(int tipo, int lado)
	{
		if (tipo == this.CUADRADO)
		{
			return (new Cuadrado(lado));
		}
		else
		{
			return (new Circulo(lado));
		}
	}
}