package Strategy;

import java.util.*;

public class EstrategiaConcretaNombre implements Estrategia
{
	public void ordena(Object alumnos[])
	{
		//Comparador para ordenar los alumnos por su nombre
		Comparator NomAluComp = new Comparator()
		{
			public int compare(Object o1, Object o2)
			{
				Universitario uni1 = (Universitario) o1;
				Universitario uni2 = (Universitario) o2;
				
				return uni1.getNombre().compareTo(uni2.getNombre());
			}
		};	
		
		//Ordenamos los objetos del array por el atributo Nombre
		Arrays.sort(alumnos, NomAluComp);
	}
}