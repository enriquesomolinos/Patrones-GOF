package Composite;

//Trabajador genérico de una empresa
import java.util.*;

public abstract class Trabajador
{
	protected String puesto;
	protected double salario;	
	
	public Trabajador(String puesto, float salario) 
	{
		this.puesto = puesto;
		this.salario = salario;	
	}
				
	public String getPuesto() 
	{
		return this.puesto;
	}
	
	public void setPuesto(String nuevo)
	{
		this.puesto = nuevo;
	}

	public double getSalario() 
	{
		return this.salario;
	}
	
	public void setSalario(double nuevo)
	{
		this.salario = nuevo;
	}
	
	public String toString()
	{
		return "puesto: "+ this.puesto + " - Salario: " + this.salario;
	}
	
	public abstract void añadirSubordinado(Trabajador t); 
	
	public abstract void eliminarSubordinado(Trabajador t);
		
	public abstract Enumeration empleadosSubordinados();
		
	public abstract double getSalarios(); 
	
	public abstract String getDesc();
}
