package Memento;

/**
 * Crea un Recuerdo que contienen una instantanea 
 * de su estado interno actual. 
 * Usa el Reuerdo para restaurar su estado interno.
 */

public class Originador
{
	private Partida partida;
	
	public Partida getPartida()
	{
		return this.partida;
	}
	
	public void setPartida(Partida partida)
	{
		this.partida = partida;
	}

	public void setRecuerdo(Recuerdo recuerdo)
	{
		partida = recuerdo.getPartida();
	}

	public Recuerdo crearRecuerdo()
	{
		return new Recuerdo(partida);
	}
}