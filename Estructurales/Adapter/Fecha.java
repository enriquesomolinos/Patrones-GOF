package Adapter;

//Interface para manejar fechas en ES (DD/MM/AAAA)

interface Fecha
{
	public String toString();
	
	public int getA�o();
	
	public void setA�o(int a�o);
	
	public int getDia();
	
	public void setDia(int dia);
	
	public int getMes();
	
	public void setMes(int mes);
}
