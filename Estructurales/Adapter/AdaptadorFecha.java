package Adapter;

//Clase para adaptar fechas USA (MM,DD,AAAA) a ES (DD/MM/AAAA)

import java.util.*;

class AdaptadorFecha implements Fecha
{
	
	//Adapta el objeto de tipo Fecha USA
	FechaUS fus;

	//constructor
	public AdaptadorFecha(FechaUS fus)
	{
		this.fus=fus;			
	}
	
	//m�todos
	public String toString()
	{
		StringTokenizer st = new StringTokenizer( fus.toString(),"," );
        String mm = st.nextToken();
        String dd = st.nextToken();        
		String aaaa = st.nextToken();        
        
		return dd + "/" + mm + "/" + aaaa;
	}
	
	public int getA�o()
	{
		return this.fus.getYear();
	}

	public void setA�o(int a�o)
	{
		this.fus.setYear(a�o);
	}
	
	public int getDia()
	{
		return this.fus.getDay();
	}

	public void setDia(int dia)
	{
		this.fus.setDay(dia);
	}
	
	public int getMes()
	{
		return this.fus.getMonth();
	}

	public void setMes(int mes)
	{
		this.fus.setMonth(mes);
	}
}
