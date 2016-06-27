package AbstractFactory;

public class USFechaFactory implements FechaFactory
{
	public FechaTexto creaFechaTexto()
	{
		return new USFechaTexto();
	}
	public FechaNum creaFechaNum()
	{
		return new USFechaNum();
	}	
}