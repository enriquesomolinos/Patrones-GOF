package Adapter;

//Clase para manejar fechas en USA (MM,DD,AAAA)

import java.util.*;

class FechaUS
{
	//atributos
	private int year;
	private int month;
	private int day;
	
	//constructores
	public FechaUS(int month, int day, int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;	
	}
	public FechaUS(String date)
	{
		StringTokenizer st = new StringTokenizer( date,"," );        
        String mm = st.nextToken();
        String dd = st.nextToken();
		String aa = st.nextToken();        
        
		this.day=Integer.parseInt(dd);
		this.month=Integer.parseInt(mm);
		this.year=Integer.parseInt(aa);	
	}	
	
	//métodos
	public String toString()
	{
		return month + "," + day + "," + year;
	}
	
	public int getYear()
	{
		return this.year;
	}

	public void setYear(int year)
	{
		this.year = year;
	}
	
	public int getDay()
	{
		return this.day;
	}

	public void setDay(int day)
	{
		this.day = day;
	}
	
	public int getMonth()
	{
		return this.month;
	}

	public void setMonth(int month)
	{
		this.month = month;
	}
}
