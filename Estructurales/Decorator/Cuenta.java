package Decorator;

public interface Cuenta
{
	public double saldo();
	public void ingresar(double cantidad);
	public void retirar(double cantidad);	
	public Cliente getCliente();	
	public Fecha2 getFecApe();
	public String toString();	
	public void aplicaIntereses();
}