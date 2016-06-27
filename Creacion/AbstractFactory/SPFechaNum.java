package AbstractFactory;

import java.util.*;
import java.text.*;
public class SPFechaNum extends FechaNum
{	
	public String presentaFN()
	{
		Locale local = new Locale("es","ES"); 
		Date hoy = new Date();					
		String hoystr = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT,local).format(hoy);
		return hoystr;	
	}
	
}