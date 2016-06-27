package Mediator;

/**
 * Implementa comportamiento del Mediador 
 * coordinando todos los colegas.
 */
import java.util.*;

public class MediadorConcreto implements Mediador
{
	private Vector colegas = new Vector();
		
	public void setColega(Colega colega)
	{
		colegas.add(colega);
	}
	
	public Colega getColega(int indice)
	{
		return (Colega) colegas.get(indice);
	}
	
	public void enviar(String mensaje, int id)
	{
		if (id == -1)
		{
			for (int i=0; i<colegas.size(); i++)
			{				
				getColega(i).recibir(mensaje);
			}
		} 
		else 
		{
			getColega(id).recibir(mensaje);			
		}    	
	}
}