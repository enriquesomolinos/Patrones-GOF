package Visitor;

/**
 * Es el responsable de guardar todas las llamadas que se han realizado y clasificarlas.
 */
 
import java.util.*;

public class Llamadas
{			
	private Vector llamadasHorarioReducido = new Vector();
	private Vector llamadasHorarioNormal = new Vector();
	
	//añade una llamada a la lista dependiendo de su tipo (reducida o normal)
	public void añadirLlamada(Llamada llamada)
	{
		if ( llamada.getDia() == 'L' || llamada.getDia() == 'M'
			|| llamada.getDia() == 'X' || llamada.getDia() == 'J'
			|| llamada.getDia() == 'V' )
		{
			if ( llamada.getHora() >= 8 && llamada.getHora() < 18 )
			{
				llamadasHorarioNormal.addElement( llamada );
			}			
			else 	
			{
				llamadasHorarioReducido.addElement( llamada );
			}
		}
		else 	
		{
			llamadasHorarioReducido.addElement( llamada );
		}
	}
	
	//devuelve todas las llamadas de horario reducido	
	public Vector getLlamadasHorarioReducido()
	{
		return this.llamadasHorarioReducido;
	}
	
	//devuelve todas las llamadas de horario normal	
	public Vector getLlamadasHorarioNormal()
	{
		return this.llamadasHorarioNormal;
	}	
}