package Singleton;
/*
 * Clase Singleton
 */

import java.util.*;

public class ContadorLogin 
{
	private Vector usuarios = new Vector();
	
	private static ContadorLogin instancia;
	
	private ContadorLogin() {} //constructor privado
	
	public static ContadorLogin getInstancia() {
		if (instancia == null) 
		{
		  instancia = new ContadorLogin();
		}
		return instancia;
	}
	
	public boolean devolverEstadoCuenta(String userId) 
	{
		if (usuarios.contains(userId)) 
		{
		    return true;
		}
		else 
		{
			usuarios.add(userId);
		  	return false;
		}
	}
	
	public void borrarLogin(String userId) 
	{
		usuarios.remove(userId);
	}

} //fin de la clase
