package Facade;

import java.io.*;

public class PruebaPatron
{
	public static void main( String args[] ) throws IOException
	{
		BufferedReader entrada=
			new BufferedReader(new InputStreamReader(System.in));
				
		FachadaCajero fachada = new FachadaCajero();
		System.out.println("Introduce operaci�n cajero \n1- Sacar Dinero \n2- Recarga M�vil \nOpci�n:");	
		int opcion = Integer.parseInt(entrada.readLine());
		if (opcion == 1) 
			System.out.println (fachada.sacarDinero()); 
		else 
			System.out.println (fachada.recargaMovil());		
	}
}