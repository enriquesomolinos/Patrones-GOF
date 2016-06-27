package Proxy;

public class Proxy implements Servidor
{
	private Servidor serv;
	
	public Proxy(Servidor serv)
	{
		this.serv = serv;
	}
	
	public void setServidor(Servidor serv)
	{
		this.serv = serv;
	}

	public Servidor getServidor()
	{		
		return serv;
	}

	public String subir(String nomFich)
	{		
		return "\n(Subiendo desde el proxy...)" + serv.subir(nomFich);
	}
	
	public Fichero bajar(String id)
	{
		return serv.bajar(id);
	}
	
	public String listado()
	{
		return "\n(Listando desde el proxy...)" +serv.listado();
	}
	
}
