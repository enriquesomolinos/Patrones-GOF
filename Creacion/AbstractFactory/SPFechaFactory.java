package AbstractFactory;

public class SPFechaFactory implements FechaFactory
{
	public FechaTexto creaFechaTexto()
	{
		return new SPFechaTexto();
	}
	public FechaNum creaFechaNum()
	{
		return new SPFechaNum();
	}	
}