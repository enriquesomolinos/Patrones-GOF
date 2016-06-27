package Proxy;

import java.util.*;

public class ServidorFicheros implements Servidor
{
	//nombre del servidor
	private String nombre;
	private Hashtable ficheros;
	private Fichero fich;
	
	public ServidorFicheros(String nombre)
	{
		this.nombre = nombre;
		ficheros = new Hashtable();		
	}
	
	public String subir(String nomFich)
	{
		fich = new Fichero(nomFich);
		ficheros.put(fich.getId(), fich);		
		return "\nFichero subido correctamente.";				
	}
	
	public Fichero bajar(String id)
	{
		return (Fichero) ficheros.get(id);
	}
	
	public String listado()
	{
		String lis="\n### Listado del servidor: " + this.nombre + " ###";
		for (Enumeration e = ficheros.elements() ; e.hasMoreElements() ;) 
		{
        	fich = (Fichero)e.nextElement();
        	lis += "\n\t" + fich.toString();
     	}
     	return lis;
	}
		
}