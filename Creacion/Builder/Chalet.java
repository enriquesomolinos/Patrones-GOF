package Builder;

import java.util.*;

public class Chalet implements ICasa
{	
	private boolean patio;
	private Hashtable habitaciones;
	public Chalet()
	{
		habitaciones = new Hashtable(); 
		Habitacion h = new Habitacion();
		h.setNombre("salón");
		habitaciones.put("1", h);
		h = new Habitacion();
		h.setNombre("dormitorio matrimonio");
		habitaciones.put("2", h);
		h = new Habitacion();
		h.setNombre("dormitorio niños 1");		
		habitaciones.put("3", h);
		h = new Habitacion();
		h.setNombre("dormitorio niños 2");		
		habitaciones.put("4", h);
		h = new Habitacion();
		h.setNombre("dormitorio invitados");		
		habitaciones.put("5", h);
		patio=true;		
	}
	public boolean getPatio()
	{
		return patio;
	}
	public int getNumHabitaciones()
	{
		return habitaciones.size();
	}
	public String getDescripcion()
	{
		Habitacion hb;
		String desc = "\nEste es un Chalet con "+ this.getNumHabitaciones() + " habitaciones:";
		for (Enumeration e = habitaciones.elements() ; e.hasMoreElements() ;) 
		{
        	hb = (Habitacion)e.nextElement();
        	desc += "\n\t" + hb.getNombre();
     	}
     	desc += "\nEste chalet tiene patio.";
		return desc;
	}

}