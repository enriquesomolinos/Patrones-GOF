package Singleton;
/* Control de entrada para Patrón Singleton */

import java.io.*;
import java.util.*;

public class ControlEntrada
{
	private static BufferedReader entrada=
			new BufferedReader(new InputStreamReader(System.in));	

	//Obtenemos una referencia al contador de login
   	//private static ContadorLogin contador = ContadorLogin.getInstancia();
    
	private static String usuario, res;
		
	public static void main(String args[])
	{
		ContadorLogin contador = ContadorLogin.getInstancia();
		while (true)
		{
			try 
			{
				do
				{	
					System.out.println("\n\n--- Operaciones de Login ---");
					System.out.println(" 1 - Login. ");
					System.out.println(" 2 - Salir. ");
					System.out.print(" Seleccione la operación: ");
					res=entrada.readLine();
				} while ( !res.equals("1") && !res.equals("2") );
	
				// login 
				if (res.equals("1"))
				{
					System.out.println("\n -- Login -- ");
					System.out.print("Introduzca usuario: ");
					usuario=entrada.readLine();			
					if (contador.devolverEstadoCuenta(usuario)) {
			      		System.out.println("Ya se ha registrado en el sistema.");			      		
			    	} else {
			    		System.out.println("Bienvenido al sistema");	
			    	}			
					
				}
				// salir
				else if (res.equals("2")) System.exit(0);
			} catch( IOException ioe )
			{
				System.out.println( "\nError de entrada/salida: " + ioe.toString() );  		
			} catch( Exception e )
			{
				// Captura cualquier otra excepción
				System.out.println( e.toString() );  		
			}			
		}
	}

}


