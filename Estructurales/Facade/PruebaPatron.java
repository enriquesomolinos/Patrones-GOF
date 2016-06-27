package Facade;

import java.io.*;

public class PruebaPatron
{
	public static void main( String args[] ) throws IOException
	{
		BufferedReader entrada=
			new BufferedReader(new InputStreamReader(System.in));
				
		FachadaCajero fachada = new FachadaCajero();
		System.out.println("Introduce operación cajero \n1- Sacar Dinero \n2- Recarga Móvil \nOpción:");	
		int opcion = Integer.parseInt(entrada.readLine());
		if (opcion == 1) 
			System.out.println (fachada.sacarDinero()); 
		else 
			System.out.println (fachada.recargaMovil());		
	}
}