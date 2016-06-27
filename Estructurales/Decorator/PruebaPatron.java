package Decorator;

public class PruebaPatron
{
	public static void main( String args[] )
	{
		Fecha2 f1 = new Fecha2(15, 3, 1985);
		Cliente juan = new Cliente( "15664386T", "Juan", f1, "calle1", "915554499" );
		Fecha2 f2 = new Fecha2(10, 10, 1975);
		Cliente maria = new Cliente( "89773374F", "María", f2, "calle2", "915558811" );
		//creamos las cuentas generales
		Cuenta c1 = new CuentaGeneral(1000,juan);
		Cuenta c2 = new CuentaGeneral(20000,maria);
		
		//ahora las envolvemos para que sean del tipo cuenta que necesitemos
		//cuenta corriente con el número de la tarjeta de crédito
		Decorador cc = new CuentaCorriente(c1, "1111222233334444");		
		System.out.println ("\n\nCuenta corriente: " + cc.toString());
		System.out.println ("Su saldo actual es: " + cc.saldo());
		
		//cuenta a plazo con un interés del 3% y una duración de 2 años		
		Decorador cp = new CuentaPlazo(c2, 3, 2);				
		System.out.println ("\n\nCuenta a plazo: " + cp.toString());
		System.out.println ("Su saldo actual es: " + cp.saldo());				
		cp.aplicaIntereses();
		System.out.println ("Su saldo después del plazo será de: " + cp.saldo());
	}
}