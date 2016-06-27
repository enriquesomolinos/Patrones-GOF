package Iterator;

import java.util.Vector;

public class AgregadoConcreto implements Agregado
{
	public Vector elementos;

	public AgregadoConcreto(Vector vec)
	{
		elementos = vec;
	}
	
	public Iterador crearIterador()
	{
		return new IteradorConcreto( this );
	}
	
	 
}