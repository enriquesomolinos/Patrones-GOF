package ChainOfResponsibility;

public abstract class Manejador
{
	private Manejador sucesor;

	public void setSucesor(Manejador sucesor)
	{
		this.sucesor = sucesor;
	}

	public Manejador getSucesor()
	{
		return sucesor;
	}

	public abstract double calculaCosteEnvio(Paquete p);
}