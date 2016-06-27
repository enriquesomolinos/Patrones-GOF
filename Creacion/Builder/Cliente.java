package Builder;

import java.io.*;

public class Cliente
{
	public static void main( String args[] ) throws IOException
	{		
		BufferedReader entrada=
			new BufferedReader(new InputStreamReader(System.in));	
		
		Director dire = new Director();
		System.out.println("Selecciona patio (S/N): ");	
		String patio = entrada.readLine().toUpperCase();
		if (patio.equals("S"))		
		{
			ICasa casa = dire.construyeCasa(true);
			System.out.println(casa.getDescripcion());
			
		}
		else if (patio.equals("N"))		
		{
			ICasa casa = dire.construyeCasa(false);
			System.out.println(casa.getDescripcion());
		}
		else 
		{
			System.out.println("Error");
		}		
	}			
}