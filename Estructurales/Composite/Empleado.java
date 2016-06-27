package Composite;

//Empleado sin subordinados
import java.util.*;

public class Empleado extends Trabajador
{	
	public Empleado(String puesto, float salario) 
	{
		super(puesto, salario);				
	}
	
	public void añadirSubordinado(Trabajador t) 
	{		
	}

	public void eliminarSubordinado(Trabajador t) 
	{		
	}
	
	public Enumeration empleadosSubordinados() 
	{
		return null;
	}
	
	public double getSalarios() 
	{		
		return this.salario;
	}	
	
	public String getDesc() 
	{		
		return "### " + super.toString();
	}
}
