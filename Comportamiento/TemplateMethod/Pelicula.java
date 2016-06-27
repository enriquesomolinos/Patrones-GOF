package TemplateMethod;

/*Clase Pelicula, extiende de Producto. Representa un Producto de tipo película*/
public class Pelicula extends Producto
{  
	//además del atributo título de la clase padre se añaden los protagonistas y la duración
   	private String protagonistas;	
   	private int duracion;			
    
    //constructor
   	public Pelicula(String tit, String protas, int dur)
   	{
       this.setNombreTitulo(tit);	//método de la clase padre
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
   
    /*Implementación de los metodos abstractos de la clase padre.
   	 *Se muestran los datos de la película y el precio de su alquiler*/
  	public String getPresentacionProducto() 
   	{
       	return ("Película: " + this.getNombreTitulo() + "; protagonistas: " + 
       			this.getProtagonistas() + "; duración: " + this.getDuracion());
   	}
      	
   	public String getPrecio(int horas)
   	{
   		return "Precio del alquiler: " + horas * 0.5; 
   	}
}