package Command;

// Crea la reunión, el comando y el invocador

public class Cliente
{
	public static void main(String args[])
	{	
		try
		{					    			
			//fecha de la reunión
			FechaHora fh = new FechaHora(1,6,2005,10,30);
			//la reunión
			Reunion r = new Reunion("Proyecto","Roberto, María, Javier","Sala reunión 1",fh);
			System.out.println("\n- Antes de ejecutar el comando:" + r.toString());
			
			//comando
			ComandoDeshacer comando = new ComandoCambiarLocalizacion();
			comando.setReunion(r);
			//invocador
			Invocador inv = new Invocador();
			//establece y ejecuta el comando
			inv.setComando(comando);
			inv.ejecutaComando("Sala reunión 2");						
			System.out.println("\n- Después de ejecutar el comando:" + r.toString());			
			inv.deshacerComando();
			System.out.println("\n- Deshacer:" + r.toString());			
			inv.rehacerComando();
			System.out.println("\n- Rehacer:" + r.toString());			
		}
		catch( Exception e )
		{
			e.toString();
		}
	}
}
