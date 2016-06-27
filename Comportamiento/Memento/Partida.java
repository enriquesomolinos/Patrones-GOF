package Memento;

public class Partida
{	
	private String nombre;
	private String fase;
	private FechaHora fecha;
	
	public Partida(String nombre, String fase)
	{		
		this.nombre = nombre;
		this.fase = fase;
		this.fecha = new FechaHora();
	}
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	public String getFase()
	{
		return this.fase;
	}
	
	public String getFecha()
	{
		return this.fecha.toString();
	}
	
	public String toString()
	{
		return  "- Partida salvada:\n" + nombre + " # " + fase + " # " + fecha.toString();
	}
}