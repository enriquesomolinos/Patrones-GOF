package Memento;

//Clase para manejar fechas con horas (DD/MM/AAAA/HO:MI)

import java.util.*;

class FechaHora
{
	//atributos
	private int año;
	private int mes;
	private int dia;
	private int hora;
	private int min;
	
	//constructores
	public FechaHora(int dia, int mes, int año, int hora, int min)
	{
		this.dia=dia;
		this.mes=mes;
		this.año=año;	
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
		this.año=Integer.parseInt(aa);	
		this.hora=Integer.parseInt(ho);	
		this.min=Integer.parseInt(mi);
	}	
	public FechaHora()
	{
		Calendar hoy = Calendar.getInstance();
		año = hoy.get(Calendar.YEAR) ;
		mes = hoy.get(Calendar.MONTH) + 1;
		dia = hoy.get(Calendar.DAY_OF_MONTH);		
		hora = hoy.get(Calendar.HOUR_OF_DAY);
		min = hoy.get(Calendar.MINUTE);
	}
	
	//métodos
	public String toString()
	{
		if (min<10) 
			return dia + "/" + mes+ "/" + año + "/" + hora + ":0" + min;
		else
			return dia + "/" + mes+ "/" + año + "/" + hora + ":" + min;
	}
	
	public int getAño()
	{
		return this.año;
	}

	public void setAño(int año)
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
