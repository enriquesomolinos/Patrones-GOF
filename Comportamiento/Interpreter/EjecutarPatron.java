package Interpreter;

// Probamos el patr�n

public class EjecutarPatron 
{                
	public static void main(String[] args) 
	{	
		//creamos un contexto
		Contexto contexto = new Contexto();
		//introducimos las empresas
		contexto.a�adirEmpresa("IBM");
		contexto.a�adirEmpresa("Indra");    
		contexto.a�adirEmpresa("ONO");       
		//y los empleados
		contexto.a�adirEmpleado("Juan");         
		contexto.a�adirEmpleado("Marta"); 
		contexto.a�adirEmpleado("Javier");
		//relacionamos empresas y empleados
		contexto.a�adirEmpresayEmpleado(new EmpresayEmpleado("IBM", "Marta"));
		contexto.a�adirEmpresayEmpleado(new EmpresayEmpleado("ONO", "Juan"));  
		contexto.a�adirEmpresayEmpleado(new EmpresayEmpleado("Indra", "Juan"));
		contexto.a�adirEmpresayEmpleado(new EmpresayEmpleado("Indra", "Javier"));  
		//creamos un int�rprete para el cliente
		InterpreteCliente cliente = new InterpreteCliente(contexto);
		//ponemos casos de prueba
		System.out.println("EJEMPLO DE PATRON INTERPRETE");
		System.out.println();
		System.out.println("Interpretando -> muestra empleados:");
		cliente.interpreta("muestra empleados");
		System.out.println("Interpretando -> muestra empleados por empresas:");
		cliente.interpreta("muestra empleados por empresas");       
		System.out.println("Interpretando -> muestra empresas:");
		cliente.interpreta("muestra empresas"); 
		System.out.println("Interpretando -> muestra empresas por empleados:");
		cliente.interpreta("muestra empresas por empleados");       
	}
} 