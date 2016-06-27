package Visitor;

public class LlamadaMetropolitana extends Llamada
{	
	private final double establecimiento = 0.0685;
	
	public LlamadaMetropolitana(int minutos, int hora, char dia)
	{
		super(minutos, hora, dia);
	}
	
	/* Implementación del método aceptar de la clase Llamada. Acepta la 
   	 * visita de un visitante concreto e invoca al método visitar del mismo 
   	 * para que realice la acción que deba. Se envía como parámetro el 
   	 * propio objeto, que es el elemento visitado*/
   	public double aceptar(Visitante visitante) 
   	{
   		return this.establecimiento + visitante.visitar(this);
   	}
}