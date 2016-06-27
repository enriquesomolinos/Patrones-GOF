package Bridge;

//Implementador
//Calse general para manejar el censo
import java.util.*;

public abstract class CensoImp
{	
	protected Hashtable personas = new Hashtable();
	private Persona objper;
	
	//consulta los datos de una persona
	public Persona consultaPersona(String dni)
	{
		objper = (Persona) personas.get(dni);
		if (objper != null)
		{				
			return objper;
		}
		else
		{
			return null;
		}
	}
	
	//alta de una persona en el censo
	public void altaPersona(Persona per)
	{
		personas.put(per.getDni(),per);
	}
	
	//baja de una persona del censo
	public boolean bajaPersona(String dni)
	{
		objper = (Persona) personas.get(dni);
		if (objper != null)
		{
			personas.remove(dni);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//total personas en el censo
	public int numeroPersonas()
	{
		return personas.size();	
	}
	
	//imprime el contenido del censo
	public String toString()
	{
		return personas.toString();
	}
	
	//ordena el censo
	public abstract Object[] ordena();
}
