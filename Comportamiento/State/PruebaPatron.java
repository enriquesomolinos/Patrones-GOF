package State;

import java.io.*;

public class PruebaPatron
{
	public static void main( String args[] )
	{
		try
		{	
			BufferedReader entrada=
				new BufferedReader(new InputStreamReader(System.in));	
			System.out.println("EJEMPLO DE PATRON ESTADO:");
			System.out.print("Introduce tu nombre: ");
			String nombre = entrada.readLine();
			System.out.print("Introduce tus apellidos: ");
			String apellidos = entrada.readLine();
			Nombre nom = new Nombre(nombre, apellidos);
			Contexto contexto = new Contexto();
			Estado estado;
			System.out.println("\n# Tu nombre con el estado NombreApellidos:");			
			estado = new EstadoNombreApellidos();
			contexto.setEstado(estado);
			contexto.mostrar(nom);
			System.out.println("\n# Tu nombre con el estado ApellidosNombre:");			
			estado = new EstadoApellidosNombre();
			contexto.setEstado(estado);
			contexto.mostrar(nom);			
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
	}
}
