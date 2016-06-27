package Visitor;

public class LlamadaProvincial extends Llamada
{	
	private final double establecimiento = 0.0833;
	
	public LlamadaProvincial(int minutos, int hora, char dia)
	{
		super(minutos, hora, dia);
	}
	
	/* Implementaci�n del m�todo aceptar de la clase Llamada. Acepta la 
   	 * visita de un visitante concreto e invoca al m�todo visitar del mismo 
   	 * para que realice la acci�n que deba. Se env�a como par�metro el 
   	 * propio objeto, que es el elemento visitado*/
   	public double aceptar(Visitante visitante) 
   	{
   		return this.establecimiento + visitante.visitar(this);
   	}
}