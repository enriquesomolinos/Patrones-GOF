package TemplateMethod;

/*Clase Pelicula, extiende de Producto. Representa un Producto de tipo pel�cula*/
public class Pelicula extends Producto
{  
	//adem�s del atributo t�tulo de la clase padre se a�aden los protagonistas y la duraci�n
   	private String protagonistas;	
   	private int duracion;			
    
    //constructor
   	public Pelicula(String tit, String protas, int dur)
   	{
       this.setNombreTitulo(tit);	//m�todo de la clase padre
       this.protagonistas = protas;
   	   this.duracion = dur;
   	}    
   
   	
   	public void setProtagonistas(String protas) 
   	{
   		this.protagonistas = protas;
   	}
   	   	
   	public String getProtagonistas() 
   	{
   		return this.protagonistas;
   	}   
   	   	
   	public void setDuracion(int dur) 
   	{
   		this.duracion = dur;
   	}
   	   	
   	public int getDuracion() 
   	{
   		return this.duracion;
   	}     
   
    /*Implementaci�n de los metodos abstractos de la clase padre.
   	 *Se muestran los datos de la pel�cula y el precio de su alquiler*/
  	public String getPresentacionProducto() 
   	{
       	return ("Pel�cula: " + this.getNombreTitulo() + "; protagonistas: " + 
       			this.getProtagonistas() + "; duraci�n: " + this.getDuracion());
   	}
      	
   	public String getPrecio(int horas)
   	{
   		return "Precio del alquiler: " + horas * 0.5; 
   	}
}