package State;

/**
 * Implementa Estado. Compone una cadena con el nombre y los apellidos
 */

public class EstadoNombreApellidos implements Estado
{
	public String mostrarNombre(Nombre nom)
	{
		return nom.getNombre() + " " + nom.getApellidos();
	}
}