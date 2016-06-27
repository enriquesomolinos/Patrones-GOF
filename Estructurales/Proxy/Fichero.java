package Proxy;

import java.io.*;

public class Fichero
{
	private String id;
	private String nombre;
	private Fecha2 fechaCrea;
	private File fichero;
	private long tamaño;	
	
	//contador único para el identificador del fichero
	private static int contador=0;
	
	//constructor
	public Fichero(String nombre)
	{
		this.id = Integer.toString(getContador());
		this.nombre = nombre; 
		this.fechaCrea = new Fecha2();
		this.fichero = new File(nombre);
		this.tamaño = fichero.length(); 	
	}

	//métodos
	private static int getContador()
	{
		return contador++;
	}
	
	public String getId()
	{
		return this.id;
	}
		
	public String getNombre()
	{
		return this.nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}	

	public Fecha2 getFechaCrea()
	{
		return this.fechaCrea;
	}	
		
	public File getFichero()
	{
		return this.fichero;
	}	
	
	public String toString()
	{
		return id + " " + nombre + " # " + tamaño;
	}	
}
