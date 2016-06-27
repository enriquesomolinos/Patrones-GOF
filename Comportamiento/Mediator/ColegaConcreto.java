package Mediator;

public class ColegaConcreto extends Colega
{	
	public ColegaConcreto(Mediador mediador)
	{
		super(mediador);
	}
	
	public void enviar(String mensaje, int id)
	{
		this.getMediador().enviar(mensaje,id);
	}
	
	public void recibir(String mensaje)
	{
		System.out.println("# ColegaConcreto " + getId() + " ha recibido el mensaje:\n" + mensaje);	
	}	
}