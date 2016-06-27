package Adapter;

//Interface para manejar fechas en ES (DD/MM/AAAA)

interface Fecha
{
	public String toString();
	
	public int getAño();
	
	public void setAño(int año);
	
	public int getDia();
	
	public void setDia(int dia);
	
	public int getMes();
	
	public void setMes(int mes);
}
