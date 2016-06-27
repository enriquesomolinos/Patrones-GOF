package Prototype;
//Clase para manejar fechas (DD/MM/AAAA)

import java.util.*;

class Fecha2
{
	//atributos
	private int año;
	private int mes;
	private int dia;
	
	//constructores
	public Fecha2(int dia, int mes, int año)
	{
		this.dia=dia;
		this.mes=mes;
		this.año=año;	
	}
	public Fecha2(String cadenaFecha)
	{
		StringTokenizer st = new StringTokenizer( cadenaFecha,"/" );
        String dd = st.nextToken();
        String mm = st.nextToken();
		String aa = st.nextToken();        
        
		this.dia=Integer.parseInt(dd);
		this.mes=Integer.parseInt(mm);
		this.año=Integer.parseInt(aa);	
	}	
	public Fecha2()
	{
		Calendar hoy = Calendar.getInstance();
		año = hoy.get(Calendar.YEAR) ;
		mes = hoy.get(Calendar.MONTH) + 1 ;
		dia = hoy.get(Calendar.DAY_OF_MONTH) ;		
	}
	
	//métodos
	public String toString()
	{
		return dia + "/" + mes+ "/" + año + " # codigo: " + this.hashCode();
	}
	
	public int getAño()
	{
		return this.año;
	}

	public void setAño(int a)
	{
		this.año = año;
	}
	
	public int getDia()
	{
		return this.dia;
	}

	public void setDia(int dia)
	{
		this.dia = dia;
	}
	
	public int getMes()
	{
		return this.mes;
	}

	public void setMes(int mes)
	{
		this.mes = mes;
	}
}
