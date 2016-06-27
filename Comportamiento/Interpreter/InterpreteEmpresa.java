package Interpreter;

// Muestra los empresas

import java.util.ArrayList;
import java.util.ListIterator;

public class InterpreteEmpresa implements Interprete
{  
	//implementacion del metodo interpretar de la interfaz Interprete
	public void interpretar(Contexto contexto)
	{
		ArrayList empresas = contexto.getEmpresas();				//empresas	
		ListIterator iteradorEmpresas = empresas.listIterator();	//iterador
		System.out.print("Empresas: ");
		while (iteradorEmpresas.hasNext())
		{		
			System.out.print((String)iteradorEmpresas.next() + ", ");
		}
		System.out.println("");
		System.out.println("");
	}
}

