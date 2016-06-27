package Iterator;

public class Universitario
{
	private String dni;
	private String nombre;
	private String carrera;
	private String universidad;
	
	public Universitario(String dni, String nombre, String carrera, String universidad)
	{
		this.dni = dni;
		this.nombre = nombre;
		this.carrera = carrera;
		this.universidad = universidad;
	}
			
	public String getDni()
	{
		return this.dni;
	}
	
	public void setDni(String dni)
	{
		this.dni = dni;
	}
	
	public String getNombre()
	{
		return this.nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}	

	public String getCarrera()
	{
		return this.carrera;
	}

	public void setCarrera(String carrera)
	{
		this.carrera = carrera;
	}	
	
	public String getUniversidad()
	{
		return this.universidad;
	}

	public void setUniversidad(String universidad)
	{
		this.universidad = universidad;
	}	
		
	public String toString()
	{
		return dni + " " + nombre + " # Carrera: " + carrera + " # Universidad: " + universidad;
	}
}