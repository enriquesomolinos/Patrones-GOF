package AbstractFactory;

public abstract class FechaTexto
{
	private String dia;
	private String mes;
	private String año;
	
	public abstract String presentaFT();
	
	public String getAño()
	{
		return this.año;
	}

	public void setAño(String a)
	{
		this.año = año;
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