package AbstractFactory;

import java.util.*;
import java.text.*;
public class PruebaLocale
{
	public static void main( String args[] )
	{			
		System.out.println( Locale.getDefault() );
		Locale local = new Locale("en","US"); 
		Date hoy = new Date();					
		String hoystr = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG,local).format(hoy);		
		System.out.println("Hoy: " + hoystr);		
	}

}
