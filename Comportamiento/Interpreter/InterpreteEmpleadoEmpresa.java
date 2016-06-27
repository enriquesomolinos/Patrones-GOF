package Interpreter;

// Muestra los empleados ordenados por empresa 
import java.util.*;

public class InterpreteEmpleadoEmpresa implements Interprete
{ 
	//implementacion del metodo interpretar de la interfaz Interprete     
   	public void interpretar(Contexto contexto)
   	{
   		//obtenemos los empresas
   	   	ArrayList empresas = contexto.getEmpresas();
   	   	ListIterator iteradorEmpresas = empresas.listIterator();	//iterador
   	   	while (iteradorEmpresas.hasNext())
   	   	{
   	     	String empresa = (String)iteradorEmpresas.next();	//empresa actual
   	     	//obtenemos los empleados de la empresa actual
       	 	ArrayList empleadosyempresas = contexto.getEmpleadosPorEmpresa(empresa);
         	System.out.println("Empresa:" + empresa);
         	ListIterator iteratorEmpleadosyEmpresas = empleadosyempresas.listIterator();
      	 	System.out.print("Empleados: ");
       	 	while (iteratorEmpleadosyEmpresas.hasNext())
         	{
         		//mostramos los empleadoes
            	System.out.print((String)iteratorEmpleadosyEmpresas.next() + " ");
         	}
         	System.out.println("");
       	}
       	System.out.println("");
   	}
}