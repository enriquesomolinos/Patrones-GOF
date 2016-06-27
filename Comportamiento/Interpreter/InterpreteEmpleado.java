package Interpreter;

// Muestra los empleados

import java.util.ArrayList;
import java.util.ListIterator;

public class InterpreteEmpleado implements Interprete
{  
	//implementacion del metodo interpretar de la interfaz Interprete
	public void interpretar(Contexto contexto)
	{
		ArrayList empleados = contexto.getEmpleados();				//empleados
	    ListIterator iteradorEmpleados = empleados.listIterator();	//iterador
	    System.out.print("Empleados: ");
	    while (iteradorEmpleados.hasNext())
	    {   
	    	System.out.print((String)iteradorEmpleados.next() + ", ");
	    }
	    System.out.println("");
	    System.out.println("");
	}
}

