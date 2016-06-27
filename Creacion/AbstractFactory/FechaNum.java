package AbstractFactory;

public abstract class FechaNum
{
	private int dia;
	private int mes;
	private int a�o;
	
	public abstract String presentaFN();
	
	public int getA�o()
	{
		return this.a�o;
	}

	public void setA�o(int a)
	{
		this.a�o = a�o;
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