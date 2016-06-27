package ChainOfResponsibility;

public class ManejadorConcreto2 extends Manejador
{
	public double calculaCosteEnvio(Paquete p)
	{
		if(p.getDestino().equals("Comunidad Madrid"))
		{
			return p.getPeso() * 1.5 + 6;
		}
		else if (super.getSucesor() != null)
		{
			return getSucesor().calculaCosteEnvio(p);	
		}
		
		return 0;
		
	}
}