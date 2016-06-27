package Command;

//Implementa ComandoDeshacer. 
//Proporciona el comportamiento necesario para cambiar el lugar de una reunion

public class ComandoCambiarLocalizacion implements ComandoDeshacer
{
	private Reunion reunion; 				//referencia al receptor
	private String nuevaLocalizacion;		//cuando el usuario la cambie 
	private String antiguaLocalizacion;		//guardará la antigua localizacion
	
	public Reunion getReunion()
	{
		return this.reunion;	
	}	
	
	public void setReunion(Reunion reunion)
	{
		this.reunion = reunion;	
	}
		
	/*Cambia el lugar de la reunion por otro introducido por el usuario y 
	 *almacena el valor anterior de la reunion por si luego se quiere recuperar*/ 
	public void ejecutar(String param)
	{
		antiguaLocalizacion = reunion.getLocalizacion();
		nuevaLocalizacion = param;
		reunion.setLocalizacion(nuevaLocalizacion);	
	}
	
	//recupera el valor de la Reunion anterior al introducido por el usuario
	public void deshacer()
	{
		reunion.setLocalizacion(antiguaLocalizacion);	
	}
	
	/*recupera el valor introducido por el usuario después de que se 
	 *hubiera deshecho*/ 	
	public void rehacer()
	{
		reunion.setLocalizacion(nuevaLocalizacion);	
	}
}