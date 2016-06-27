package Prototype;
import java.util.*;

public class Persona implements Copiable
{
	private String dni;
	private String nombre;
	private Fecha2 fechaNac;
	private String direccion;
	private Vector tfnos;

	//constructor
	public Persona(String p_dni, String p_nombre, Fecha2 p_fecnac, String p_direccion, Vector p_tfnos)
	{
		dni = p_dni;
		nombre = p_nombre; 
		fechaNac = p_fecnac;
		direccion = p_direccion;
		tfnos = p_tfnos; 	
	}
	
	//métodos
	public String getDni()
	{
		return this.dni;
	}
	
	public void setDni(String dni)
	{
		this.dni = dni;
	}
	
	public String getNombre()
	{
		return this.nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}	

	public Fecha2 getFechaNac()
	{
		return this.fechaNac;
	}
	
	public void setFechaNac(Fecha2 fechaNac)
	{
		this.fechaNac = fechaNac;
	}	
	
	public String getDireccion()
	{
		return this.direccion;
	}

	public void setDireccion(String direccion)
	{
		this.direccion = direccion;
	}
	
	public Vector getTfnos()
	{
		return this.tfnos;
	}

	public void setTfnos(Vector tfnos)
	{
		this.tfnos = tfnos;
	}
	
	public String toString()
	{
		return dni + " " + nombre + " # codigo: " + this.hashCode();
	}	
	
	public Object copia()
	{
		return new Persona("0",nombre, fechaNac, direccion, tfnos)	;
	}
	
}
