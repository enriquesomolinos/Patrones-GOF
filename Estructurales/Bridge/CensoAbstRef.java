package Bridge;

public class CensoAbstRef extends CensoAbst
{	
	//devuelve los teléfonos de las personas ordenadas
	public Object[] ordena() 
	{		
		Object[] personasOrdenadas = super.ordena();
		Object[] telefonos = new Object[personasOrdenadas.length];
		
		for (int i=0; i<personasOrdenadas.length; i++)
		{
			Persona per = (Persona)personasOrdenadas[i];
			telefonos[i] = per.getTfno();			
		}		
		return telefonos;
	}
}