package AbstractFactory;

import java.util.*;
import java.text.*;
public class USFechaTexto extends FechaTexto
{	
	public String presentaFT()
	{
		Locale local = new Locale("en","US"); 
		Date hoy = new Date();					
		String hoystr = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG,local).format(hoy);
		return hoystr;	
	}
	
}