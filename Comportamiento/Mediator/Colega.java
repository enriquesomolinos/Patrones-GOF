package Mediator;

/**
 * Cada Colega conoce a su mediador.  
 */
public abstract class Colega
{
	private Mediador mediador;		//el mediador
	private int id; 				//identificador del colega
	private static int contador=0; 	//secuencia para el id
	
	public Colega(Mediador mediador)
	{
		this.mediador = mediador;
		mediador.setColega(this);
		this.id = getContador();
	}
	
	private static int getContador()
	{
		return contador++;
	}
	
	public Mediador getMediador()
	{
		return mediador;
	}
	
	public void setMediador( Mediador mediador )
	{
		this.mediador = mediador;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public abstract void enviar(String mensaje, int id);
	
	public abstract void recibir(String mensaje);
}