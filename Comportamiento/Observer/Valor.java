package Observer;

public class Valor
{
	private String titulo;
	private double cotizacion;
	
	public Valor(String t, double c)
	{
		this.titulo = t;
		this.cotizacion = c;
	}
	
	public String getTitulo()
	{
		return this.titulo;
	}
	
	public void setTitulo(String nuevo)
	{
		this.titulo = nuevo;
	}
	
	public double getCotizacion()
	{
		return this.cotizacion;
	}
	
	public void setCotizacion(double nuevo)
	{
		this.cotizacion = nuevo;
	}
	
	public String toString()
	{
		return "# Valor de "+ titulo + " cotiza a " + cotizacion;
	}
}