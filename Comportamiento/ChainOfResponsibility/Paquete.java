package ChainOfResponsibility;

public class Paquete
{
	private String contenido;
	private String destino;
	private double peso;
	
	public Paquete(String contenido, String destino, double peso)
	{
		this.contenido = contenido;
		this.destino = destino;
		this.peso = peso;
	}
	
	public String getContenido()
	{
		return this.contenido;
	}
	
	public String getDestino()
	{
		return this.destino;
	}
	
	public double getPeso()
	{
		return this.peso;
	}
	
	public String toString()
	{
		return "### Paquete # Contenido: "+ contenido + " # Destino: " + destino + " # Peso: " + peso; 
	}
}