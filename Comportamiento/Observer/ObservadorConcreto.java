package Observer;

/**
 * Mantiene una referencia a un objeto SujetoConcreto
 * Implementa la interfaz Observador y define los métodos 
 * para responder a los mensajes recibidos del sujeto.
 */
 
public class ObservadorConcreto implements Observador
{
	private String nombre;				//nombre del observador
	private double precioVentaAccion;	//precio al que queremos vender
	private Sujeto sujeto;				//valor al que observamos
	private int numAcciones;			//cantidad de acciones
	
	public ObservadorConcreto(String nombre, double precio, Sujeto sujeto, int numAcciones)
	{
		this.nombre = nombre;
		this.precioVentaAccion = precio;
		this.sujeto = sujeto;
		this.numAcciones = numAcciones;
		sujeto.añadirObservador(this);
	}
	
	public void actualizar()
	{
		double cot = sujeto.getValor().getCotizacion();
		if ( cot >= precioVentaAccion)
		{
			double total = cot * numAcciones;
			System.out.println( "El observador "+ nombre +
								" a vendido sus " + numAcciones + 
								" acciones a " + total + " euros." );
			sujeto.eliminarObservador(this);
		}
		else
		{
			System.out.println( "El observador "+ nombre + " no vende sus acciones.");
		}
		
	}
}