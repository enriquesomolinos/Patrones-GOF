package Command;

//ampl�a la interfaz comando a�adiendo los m�todos deshacer y rehacer
public interface ComandoDeshacer extends Comando
{	
	public void deshacer();
	public void rehacer();	
}
