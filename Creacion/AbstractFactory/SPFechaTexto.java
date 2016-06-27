package AbstractFactory;

import java.util.*;
import java.text.*;
public class SPFechaTexto extends FechaTexto
{	
	public String presentaFT()
	{
		Locale local = new Locale("es","ES"); 
		Date hoy = new Date();					
		String hoystr = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG,local).format(hoy);
		return hoystr;	
	}
	
}