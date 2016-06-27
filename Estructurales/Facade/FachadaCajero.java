package Facade;

/**
 * Simplifica el acceso a cada uno de los subsistemas 
 * de un sistema bancario a través del cajero. 
 */

public class FachadaCajero
{
	private ValidacionUsuario val = new ValidacionUsuario();
	private RetirarDinero ret = new RetirarDinero();
	private RecargaMovil rec = new RecargaMovil();

	public String sacarDinero()
	{
		return val.valida() + ret.retirar();		
	}
	public String recargaMovil()
	{
		return val.valida() + rec.recarga();		
	}
}