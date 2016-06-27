package Bridge;

import java.util.*;
public class CensoImp1 extends CensoImp
{
	public Object[] ordena()
	{		
		//Comparador para ordenar las personas por su nombre
		Comparator NomPerComp = new Comparator()
		{
			public int compare(Object o1, Object o2)
			{
				Persona p1 = (Persona) o1;
				Persona p2 = (Persona) o2;
				return p1.getNombre().compareTo(p2.getNombre());
			}
		};
	
		//Cargamos todas las personas en un array
		Object perArray[] = personas.values().toArray();
		//Ordenamos el array
		Arrays.sort(perArray, NomPerComp);	
		return perArray;
	}
}
