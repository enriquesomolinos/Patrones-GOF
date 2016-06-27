package Interpreter;

// Muestra las empresas por empleado 

import java.util.ArrayList;
import java.util.ListIterator;

public class InterpreteEmpresaEmpleado implements Interprete
{      
   public void interpretar(Contexto contexto)
   {
   	   //String bufferEmpresa = new String("");
   	   //seleccionamos los empleados
   	   ArrayList empleados = contexto.getEmpleados();
   	   ListIterator iteradorEmpleados = empleados.listIterator();
   	   //mientras haya empleadoes...
   	   while (iteradorEmpleados.hasNext())
   	   {
   	   		String empleado = (String)iteradorEmpleados.next();
   	   		System.out.println("Empleado: " + empleado);
   	   		//obtenemos las empresas en los que ha trabajado 
       		ArrayList empleadosyempresas = contexto.getEmpresasPorEmpleado(empleado);
       		ListIterator iteradorEmpresasyEmpleados = empleadosyempresas.listIterator();
       		//los mostramos
       		System.out.print("Empresas: ");
       		while (iteradorEmpresasyEmpleados.hasNext())
       		{
        	   System.out.print((String)iteradorEmpresasyEmpleados.next() + " ");
       		}
       		System.out.println("");
       }
       System.out.println("");
   }
}