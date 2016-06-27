package Prototype;
//Clase para manejar fechas (DD/MM/AAAA)

import java.util.*;

class Fecha2
{
	//atributos
	private int a�o;
	private int mes;
	private int dia;
	
	//constructores
	public Fecha2(int dia, int mes, int a�o)
	{
		this.dia=dia;
		this.mes=mes;
		this.a�o=a�o;	
	}
	public Fecha2(String cadenaFecha)
	{
		StringTokenizer st = new StringTokenizer( cadenaFecha,"/" );
        String dd = st.nextToken();
        String mm = st.nextToken();
		String aa = st.nextToken();        
        
		this.dia=Integer.parseInt(dd);
		this.mes=Integer.parseInt(mm);
		this.a�o=Integer.parseInt(aa);	
	}	
	public Fecha2()
	{
		Calendar hoy = Calendar.getInstance();
		a�o = hoy.get(Calendar.YEAR) ;
		mes = hoy.get(Calendar.MONTH) + 1 ;
		dia = hoy.get(Calendar.DAY_OF_MONTH) ;		
	}
	
	//m�todos
	public String toString()
	{
		return dia + "/" + mes+ "/" + a�o + " # codigo: " + this.hashCode();
	}
	
	public int getA�o()
	{
		return this.a�o;
	}

	public void setA�o(int a)
	{
		this.a�o = a�o;
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
