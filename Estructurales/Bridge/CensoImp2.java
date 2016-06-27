package Bridge;

import java.util.*;
public class CensoImp2 extends CensoImp
{
	public Object[] ordena()
	{		
		//Comparador para ordenar las personas por su DNI
		Comparator DniPerComp = new Comparator()
		{
			public int compare(Object o1, Object o2)
			{
				Persona per1 = (Persona) o1;
				Persona per2 = (Persona) o2;
				return per1.getDni().compareTo(per2.getDni());
			}
		};
	
		//Cargamos todas las personas en un array
		Object perArray[] = personas.values().toArray();
		//Ordenamos el array
		Arrays.sort(perArray, DniPerComp);	
		return perArray;
	}
}
