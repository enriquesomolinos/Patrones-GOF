package Memento;

/**
 * Almacena el estado interno de un objeto Originador.
 */

public class Recuerdo
{
	private Partida partida = null;

	public Recuerdo(Partida partida)
	{
		this.partida = partida;
	}

	public Partida getPartida()
	{
		return partida;
	}

	public void setPartida(Partida partida)
	{
		this.partida = partida;
	}
}