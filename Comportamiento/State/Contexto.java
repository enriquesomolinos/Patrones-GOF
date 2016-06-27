package State;

/**
 * Hace de intermediaria entre los dos estados de los que esta
 * compuesta la aplicaci�n
 */

public class Contexto
{
	private Estado estado; //estado actual 
	
	//m�todo setEstado. Permite cambiar el estado actual
   	public void setEstado(Estado estado)
   	{
       		this.estado = estado;
   	}
   
   	//Invoca al m�todo motrarNombre del estado que corresponda.
    //Se mostrara de una forma u otra seg�n sea el estado actual
   	public void mostrar(Nombre nombre) 
   	{
   	   	System.out.println(estado.mostrarNombre(nombre));
   	}
}