package Command;

//Representa el receptor del patr�n.

public class Reunion
{
	private String motivo; 			//motivo de la reuni�n
	private String participantes; 	//gente que ir� a la reuni�n
	private String localizacion; 	//sitio en que se producira la reuni�n
	private FechaHora fecha; 		//fecha de la reuni�n
	
	public Reunion(String motivo, String participantes, String localizacion, FechaHora fecha)
	{
		this.motivo = motivo;
		this.participantes = participantes;
		this.localizacion = localizacion;
		this.fecha = fecha;		
	}
	
	public String getMotivo()
	{
		return this.motivo;
	}	
	
	public void setMotivo(String nuevo)
	{
		this.motivo = nuevo;
	}
	
	public String getParticipantes()
	{
		return this.participantes;
	}	

	public void setParticipantes(String nuevos)
	{
		this.participantes = nuevos;
	}
	
	public String getLocalizacion()
	{
		return this.localizacion;
	}	

	public void setLocalizacion(String nueva)
	{
		this.localizacion = nueva;
	}

	public FechaHora getFecha()
	{
		return this.fecha;
	}		

	public void setFecha(FechaHora nueva)
	{
		this.fecha = nueva;
	}	
	
	public String toString()
	{
		return "\n#### Reuni�n #### \n# " + motivo + " \n# " + participantes 
				+ " \n# " + localizacion + " \n# " + fecha.toString();	
	}
}