package Memento;

//Clase para manejar fechas con horas (DD/MM/AAAA/HO:MI)

import java.util.*;

class FechaHora
{
	//atributos
	private int a�o;
	private int mes;
	private int dia;
	private int hora;
	private int min;
	
	//constructores
	public FechaHora(int dia, int mes, int a�o, int hora, int min)
	{
		this.dia=dia;
		this.mes=mes;
		this.a�o=a�o;	
		this.hora=hora;
		this.min=min;		
	}
	public FechaHora(String cadenaFecha)
	{
		StringTokenizer st = new StringTokenizer( cadenaFecha,"/:" );
        String dd = st.nextToken();
        String mm = st.nextToken();
		String aa = st.nextToken();        
        String ho = st.nextToken();        
        String mi = st.nextToken();        
        
		this.dia=Integer.parseInt(dd);
		this.mes=Integer.parseInt(mm);
		this.a�o=Integer.parseInt(aa);	
		this.hora=Integer.parseInt(ho);	
		this.min=Integer.parseInt(mi);
	}	
	public FechaHora()
	{
		Calendar hoy = Calendar.getInstance();
		a�o = hoy.get(Calendar.YEAR) ;
		mes = hoy.get(Calendar.MONTH) + 1;
		dia = hoy.get(Calendar.DAY_OF_MONTH);		
		hora = hoy.get(Calendar.HOUR_OF_DAY);
		min = hoy.get(Calendar.MINUTE);
	}
	
	//m�todos
	public String toString()
	{
		if (min<10) 
			return dia + "/" + mes+ "/" + a�o + "/" + hora + ":0" + min;
		else
			return dia + "/" + mes+ "/" + a�o + "/" + hora + ":" + min;
	}
	
	public int getA�o()
	{
		return this.a�o;
	}

	public void setA�o(int a�o)
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
	
	public int getHora()
	{
		return this.hora;
	}

	public void setHora(int hora)
	{
		this.hora = hora;
	}
	
	public int getMin()
	{
		return this.min;
	}

	public void setMin(int min)
	{
		this.min = min;
	}
	
}
