package Decorator;

public class CuentaGeneral implements Cuenta
{
	private double saldo;
	private Cliente cliente;	
	private Fecha2 fecApertura;
		
	public CuentaGeneral(double saldoini, Cliente cliente)
	{
		this.saldo = saldoini;
		this.cliente = cliente;
		this.fecApertura = new Fecha2();
	}
	
	public double saldo()
	{
		return this.saldo;
	}
	
	public void ingresar(double cantidad)
	{
		this.saldo += cantidad;
	}
	
	public void retirar(double cantidad)
	{
		this.saldo -= cantidad;
	}	
	
	public Cliente getCliente()
	{
		return this.cliente;
	}
	
	public Fecha2 getFecApe()
	{
		return this.fecApertura;
	}
	
	public String toString()
	{
		return "\n### Información cuenta:\n Cliente: \n" + cliente.toString() 
				+ "\n Fecha apertura: " + this.fecApertura;
	}
	
	public void aplicaIntereses()
	{		
	}
}