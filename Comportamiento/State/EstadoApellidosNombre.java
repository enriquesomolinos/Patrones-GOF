package State;

/**
 * Implementa Estado. Compone una cadena con los apellidos y el nombre.
 */

public class EstadoApellidosNombre implements Estado
{
	public String mostrarNombre(Nombre nom)
	{
		return  nom.getApellidos() + ", " + nom.getNombre();
	}
}