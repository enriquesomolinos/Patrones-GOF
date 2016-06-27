package AbstractFactory;

public abstract class FechaNum
{
	private int dia;
	private int mes;
	private int año;
	
	public abstract String presentaFN();
	
	public int getAño()
	{
		return this.año;
	}

	public void setAño(int a)
	{
		this.año = año;
	}
	
	public int getDia()
	{
		return this.dia;
	}

	public void setDia(int dia)
	{
		this.dia = dia;
	}
	
	public int getMes()
	{
		return this.mes;
	}

	public void setMes(int mes)
	{
		this.mes = mes;
	}

}