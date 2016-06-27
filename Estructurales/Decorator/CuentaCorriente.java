package Decorator;

public class CuentaCorriente extends Decorador
{
	//tarjeta de crédito asociada a la cuenta corriente
	private String tarjetaCredito;
	
	public CuentaCorriente(Cuenta c, String tc)
	{
		super(c);		
		this.tarjetaCredito = tc;		
	}
			
	public String getTarjeta()
	{
		return this.tarjetaCredito;
	}
	
	public void aplicaIntereses()
	{
		double interes=0.5; //0.5% de interés para todas las cuentas corrientes
		double saldoActual = super.saldo();
		super.getCuenta().ingresar(saldoActual*(interes/100));			
	}
	
	public String toString()
	{
		return super.toString() + "\nTarjeta de Crédito: " + tarjetaCredito;
	}	
}