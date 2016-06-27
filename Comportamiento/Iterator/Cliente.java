package Iterator;

import java.util.*;

public class Cliente
{
	public static void main( String arg[] )
	{
		try
		{
			Vector aux = new Vector();
			Universitario uni1 = new Universitario("12345678","Pepe","Informática","Alcalá");
			Universitario uni2 = new Universitario("48438979","Cristina","Farmacia","Complutense");
			Universitario uni3 = new Universitario("62654698","David","Medicina","Alcalá");
			Universitario uni4 = new Universitario("75542987","Laura","Derecho","Carlos III");
			aux.add(uni1);
			aux.add(uni2);
			aux.add(uni3);
			aux.add(uni4);
			
			Agregado agregado = new AgregadoConcreto(aux);
			Iterador iterador = agregado.crearIterador();
						
			while (iterador.hayMas())
			{								
				Universitario uni = (Universitario)iterador.elementoActual();
				System.out.println(uni.toString());
				iterador.siguiente();	
			}			
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
	}
}