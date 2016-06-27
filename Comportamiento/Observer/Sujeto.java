package Observer;

public interface Sujeto
{
	//establece un valor al que monitorizar su cotización
	public void setValor(Valor v);
	
	//devuelve el valor que monitoriza
	public Valor getValor();	
	
	//añade un observador a la lista
	public void añadirObservador(Observador o);
	
	//elimina un observador de la lista
	public void eliminarObservador(Observador o);
	
	//notifica a todos los observadores de que se ha producido un cambio
	public void notificarObservadores();
}
