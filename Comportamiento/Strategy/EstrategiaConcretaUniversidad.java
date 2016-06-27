package Strategy;

import java.util.*;

public class EstrategiaConcretaUniversidad implements Estrategia
{
	public void ordena(Object alumnos[])
	{
		//Comparador para ordenar los alumnos por su nombre
		Comparator NomUniComp = new Comparator()
		{
			public int compare(Object o1, Object o2)
			{
				Universitario uni1 = (Universitario) o1;
				Universitario uni2 = (Universitario) o2;
				
				return uni1.getUniversidad().compareTo(uni2.getUniversidad());
			}
		};	
		
		//Ordenamos los objetos del array por el atributo Nombre
		Arrays.sort(alumnos, NomUniComp);
	}
}