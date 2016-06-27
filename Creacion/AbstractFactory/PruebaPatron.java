package AbstractFactory;

import java.io.*;
public class PruebaPatron
{
	public static void main( String args[] ) throws IOException
	{		
		BufferedReader entrada=
			new BufferedReader(new InputStreamReader(System.in));	
		FechaFactory factory;	
		FechaTexto ft;
		FechaNum fn;			 
		String formato, pais;
		
		System.out.println("Selecciona formato fecha (T/N): ");	
		formato = entrada.readLine().toUpperCase();
		System.out.println("Selecciona pais fecha (E/U): ");	
		pais = entrada.readLine().toUpperCase();
		if (pais.equals("E"))
		{
			factory = new SPFechaFactory();
			if (formato.equals("T"))
			{				
				ft = factory.creaFechaTexto();
				System.out.println(ft.presentaFT());
			}
			else if (formato.equals("N"))
			{
				fn = factory.creaFechaNum();
				System.out.println(fn.presentaFN());
			}
			else 
			{
				System.out.println("Formato incorrecto.");	
				System.exit(0);
			}
		}
		else if (pais.equals("U"))
		{
			factory = new USFechaFactory();
			if (formato.equals("T"))
			{				
				ft = factory.creaFechaTexto();
				System.out.println(ft.presentaFT());
			}
			else if (formato.equals("N"))
			{
				fn = factory.creaFechaNum();
				System.out.println(fn.presentaFN());
			}
			else 
			{
				System.out.println("Formato incorrecto.");	
				System.exit(0);
			}

		}
		else 
		{
			System.out.println("Pais incorrecto.");	
			System.exit(0);
		}
		
	}

}
