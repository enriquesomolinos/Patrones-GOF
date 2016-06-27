package Observer;

/**
 * Gestiona a sus observadores.
 * Notifica cambios en la cotizaci�n de una acci�n.
 */

import java.util.Vector;

public class SujetoConcreto implements Sujeto
{
	//los observadores de una acci�n
	private Vector observadores = new Vector();
	
	//la acci�n monitorizada
	private Valor valor;
	
	public void setValor(Valor v)
	{
		this.valor = v;
	}
	
	public Valor getValor()
	{
		return this.valor;
	}

	//a�ade un observador a la lista
	public void a�adirObservador(Observador o)
	{
		if( observadores.contains( o ) == false )
		{
			observadores.addElement( o );
		}	
	}
	
	//elimina un observador de la lista
	public void eliminarObservador(Observador o)
	{
		observadores.removeElement( o );
	}
	
	//notifica a todos los observadores que se ha producido 
	//un cambio en la cotizaci�n de un valor
	public void notificarObservadores()
	{		
		for( int i = 0; i < observadores.size(); ++i )
		{
			Observador o = (Observador) observadores.elementAt(i);
			o.actualizar();
		}
	}
	
}