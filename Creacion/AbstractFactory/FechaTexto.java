package AbstractFactory;

public abstract class FechaTexto
{
	private String dia;
	private String mes;
	private String a�o;
	
	public abstract String presentaFT();
	
	public String getA�o()
	{
		return this.a�o;
	}

	public void setA�o(String a)
	{
		this.a�o = a�o;
	}
	
	public String getDia()
	{
		return this.dia;
	}

	public void setDia(String dia)
	{
		this.dia = dia;
	}
	
	public String getMes()
	{
		return this.mes;
	}

	public void setMes(String mes)
	{
		this.mes = mes;
	}

}