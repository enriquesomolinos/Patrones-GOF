package Composite;

//Jefe con subordinados
import java.util.*;

public class Jefe extends Trabajador
{
	Vector subordinados;
	
	public Jefe(String puesto, float salario) 
	{
		super(puesto, salario);		
		subordinados = new Vector();
	}
	
	public void añadirSubordinado(Trabajador t) 
	{
		subordinados.addElement(t);
	}

	public void eliminarSubordinado(Trabajador t) 
	{
		subordinados.removeElement(t);
	}
	
	public Enumeration empleadosSubordinados() 
	{
		return subordinados.elements();
	}
	
	//salarios de sus subordinados
	public double getSalarios() 
	{
		double sum = salario; //el salario de este empleado
		//añadimos el salario de sus subordinados
		for(int i = 0; i < subordinados.size(); i++) 
		{
		   sum += ((Trabajador)subordinados.elementAt(i)).getSalarios();
		}
		return sum;
	}	
	
	//descripción de sus subordinados
	public String getDesc() 
	{
		String desc = this.toString(); //el puesto de este empleado
		//añadimos los puestos de sus subordinados
		for(int i = 0; i < subordinados.size(); i++) 
		{
		   desc += "\n\t### " + ((Trabajador)subordinados.elementAt(i)).getDesc();
		}
		return desc;
	}	
}
