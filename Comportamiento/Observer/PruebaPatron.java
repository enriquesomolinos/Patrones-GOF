package Observer;

public class PruebaPatron
{
	public static void main( String args[] )
	{
		try
		{
			//valor
			Valor v1 = new Valor("Jazztel",1.25);
								
			//sujeto para monitorizar el valor
			Sujeto sujeto = new SujetoConcreto();
			sujeto.setValor(v1);
			
			//observadores
			Observador o1 = new ObservadorConcreto("o1",1.2,sujeto,200);
			Observador o2 = new ObservadorConcreto("o2",1.4,sujeto,400);
			
			//notificamos a los observadores para que actualicen
			System.out.println ("Notificamos...");
			sujeto.notificarObservadores();
			
			v1.setCotizacion(1.5); //cambiamos la cotización
			System.out.println ("Notificamos...");
			sujeto.notificarObservadores();						
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
	}
}