package Visitor;

/*Llamada. Representa un elemento que ser� visitado. Define el m�todo
 *aceptar, que acepta a un visitante para que realice las acciones oportunas*/
public abstract class Llamada
{
	private int duracion;	//duracion de la llamada en minutos
	private int hora;		//hora a la que se hizo la llamada
	private char dia;		//d�a de la semana en que se hizo la llamada (L..D)
	
	public Llamada(int minutos, int hora, char dia)
	{
		this.duracion = minutos;
		this.hora = hora;
		this.dia = dia;
	}
	
	public void setDuracion(int minutos)
	{
		this.duracion = minutos;
	}
	
	public int getDuracion()
	{
		return this.duracion;
	}

	public void setHora(int hora)
	{
		this.hora = hora;
	}
	
	public int getHora()
	{
		return this.hora;
	}
	
	public void setDia(char dia)
	{
		this.dia = dia;
	}
	
	public int getDia()
	{
		return this.dia;
	}
	
	public String toString()
	{
		return "# Llamada realizada el d�a " + dia + " a las " + hora 
				+ " horas, con una duraci�n de " + duracion + " minutos.";
	}
	public abstract double aceptar(Visitante visitante);	//m�todo aceptar	
}
