package AbstractFactory;

import java.util.*;
import java.text.*;
public class USFechaNum extends FechaNum
{	
	public String presentaFN()
	{
		Locale local = new Locale("en","US"); 
		Date hoy = new Date();					
		String hoystr = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT,local).format(hoy);
		return hoystr;	
	}	
}