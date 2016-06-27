package Strategy;

import java.util.*;

public class Contexto
{
	private Estrategia estrategia;
	private Vector universitarios;
	
	public Contexto(Estrategia e, Vector u)
	{
		this.estrategia = e;
		this.universitarios = u;
	}
	
	public void setEstrategia(Estrategia e)
	{
		this.estrategia = e;
	}
	
	public void ejecutaEstrategia()
	{
		Object alumnos[] = universitarios.toArray();		
		estrategia.ordena(alumnos);	
		for (int i = 0; i<alumnos.length; i++) 
		{
			System.out.println (alumnos[i].toString());
	    }
	}

}