package Iterator;

public class IteradorConcreto implements Iterador
{
	private AgregadoConcreto agregado;
	private int indice = 0;
	
	public IteradorConcreto( AgregadoConcreto agregado )
	{
		this.agregado = agregado;
	}

	public Object primero()
			throws IndexOutOfBoundsException
	{
		Object objeto = null;
		if( !agregado.elementos.isEmpty() )
		{
			indice = 0;
			objeto = agregado.elementos.firstElement();
		}
		else
		{
			throw new IndexOutOfBoundsException();
		}
		return objeto;
	}

	public Object siguiente()
			throws IndexOutOfBoundsException
	{
		Object objeto = null;
		if( indice < agregado.elementos.size() )
		{			
			objeto = agregado.elementos.elementAt(indice);
			indice += 1;
		}
		else
		{
			throw new IndexOutOfBoundsException();
		}
		return objeto;
	}

	public boolean hayMas()
	{
		boolean resultado = true;
		if( agregado.elementos.isEmpty() || 
			indice == agregado.elementos.size() )
		{
			resultado = false;
		}
		return resultado;
	}

	public Object elementoActual()
			throws IndexOutOfBoundsException
	{
		Object objeto = null;
		if( indice < agregado.elementos.size() )
		{
			objeto = agregado.elementos.elementAt( indice );
		}
		else
		{
			throw new IndexOutOfBoundsException();
		}
		return objeto;
	}
}