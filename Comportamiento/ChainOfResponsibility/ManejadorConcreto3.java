package ChainOfResponsibility;

public class ManejadorConcreto3 extends Manejador
{
	//resto de zonas
	public double calculaCosteEnvio(Paquete p)
	{
		return p.getPeso() * 1.5 + 8;		
	}
}