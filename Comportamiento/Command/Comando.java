package Command;

//interfaz comando. Modela el comportamiento gen�rico de los comandos
public interface Comando
{
	void setReunion( Reunion reunion );
	Reunion getReunion();
	void ejecutar(String param);
}