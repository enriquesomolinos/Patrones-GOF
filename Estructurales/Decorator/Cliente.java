package Decorator;

public class Cliente
{
	private String dni;
	private String nombre;
	private Fecha2 fechaNac;
	private String direccion;
	private String tfno;

	//constructor
	public Cliente(String p_dni, String p_nombre, Fecha2 p_fecnac, String p_direccion, String p_tfno)
	{
		dni = p_dni;
		nombre = p_nombre; 
		fechaNac = p_fecnac;
		direccion = p_direccion;
		tfno = p_tfno; 	
	}

	//métodos
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

	public Fecha2 getFechaNac()
	{
		return this.fechaNac;
	}
	
	public void setFechaNac(Fecha2 fechaNac)
	{
		this.fechaNac = fechaNac;
	}	
	
	public String getDireccion()
	{
		return this.direccion;
	}

	public void setDireccion(String direccion)
	{
		this.direccion = direccion;
	}
	
	public String getTfno()
	{
		return this.tfno;
	}

	public void setTfnos(String tfno)
	{
		this.tfno = tfno;
	}
	
	public String toString()
	{
		return dni + " " + nombre;
	}	
}
