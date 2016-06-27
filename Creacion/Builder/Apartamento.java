package Builder;

import java.util.*;

public class Apartamento implements ICasa
{	
	private boolean patio;
	private Hashtable habitaciones;
	public Apartamento()
	{
		habitaciones = new Hashtable(); 
		Habitacion h = new Habitacion();
		h.setNombre("salón");
		habitaciones.put("1", h);
		h = new Habitacion();
		h.setNombre("dormitorio matrimonio");
		habitaciones.put("2", h);
		h = new Habitacion();
		h.setNombre("dormitorio niños");
		habitaciones.put("3", h);
		patio=false;		
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
		String desc = "\nEste es un Apartamento con "+ this.getNumHabitaciones() + " habitaciones:";
		//Convertimos la tabla hash en un array de objetos
		Object habitacionesA[] = habitaciones.values().toArray();		
		for (int i=0; i<habitacionesA.length; i++)
		{
        	hb = (Habitacion)habitacionesA[i];        	
        	desc += "\n\t" + hb.getNombre();        	
     	}
     	desc += "\nEste apartamento no tiene patio.";
		return desc;
	}

}