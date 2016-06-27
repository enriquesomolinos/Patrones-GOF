package Bridge;

//Abstracción
public class CensoAbst
{
	//referencia al implementador
	protected CensoImp imp;
	
	//ordena el censo
	public Object[] ordena() 
	{
		return imp.ordena();
	}
	
	//Asignamos un implementador concreto.
	public void setImplementador(CensoImp ci)
	{
		this.imp = ci;	
	} 
	
	public CensoImp getImplementador()
	{
		return this.imp;
	}    
}