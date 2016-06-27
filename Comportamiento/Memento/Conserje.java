package Memento;

/**
 * Es el responsable de la custodia de los recuerdos. 
 * Nunca opera o examina el contenido de un recuerdo.
 */
 
import java.util.*;

public class Conserje
{
	private Vector recuerdos = new Vector();
	
	public void setRecuerdo(Recuerdo recuerdo)
	{
		recuerdos.addElement(recuerdo);
	}
	
	public Recuerdo getRecuerdo(int indice)
	{
		if (indice<recuerdos.size())
		{
			Recuerdo r = (Recuerdo) recuerdos.get(indice);
			return r;	
		}
		else return null;		
	}
	
}