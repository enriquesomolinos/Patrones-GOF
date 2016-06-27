package Builder;

public class Director
{
	public ICasa construyeCasa(boolean patio)
	{
		if (patio)
		{
			return new Chalet();
		}
		else
		{
			return new Apartamento();
		}		
	}
	 
}