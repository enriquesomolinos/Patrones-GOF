package TemplateMethod;

/* Clase Juego, extiende de Producto. Representa un Producto de tipo juego */
public class Juego extends Producto
{  
	//adem�s del atributo t�tulo de la clase padre se a�aden el g�nero y el idioma del juego
	private String genero;
	private String idioma;
	
	//constructor
   	public Juego(String titulo, String genero, String idioma)
   	{
   	    this.setNombreTitulo(titulo);	//m�todo de la clase padre
   	    this.genero = genero;
   	    this.idioma = idioma;
   	}     
   
   	public void setGenero(String gen) 
   	{
   		this.genero = gen;
   	}
   	   	
   	public String getGenero() 
   	{
   		return this.genero;
   	}   
   	
   	public void setIdioma(String id) 
   	{
   		this.idioma = id;
   	}
   	   	
   	public String getIdioma() 
   	{
   		return this.idioma;
   	}
   	
   	/*Implementaci�n de los m�todos abstractos de la clase padre.
   	 *Se muestran los datos del juego y el precio de su alquiler */
   	public String getPresentacionProducto() 
   	{
   	    return ("Juego: " + this.getNombreTitulo()+ "; g�nero: " + 
       			this.getGenero() + "; idioma: " + this.idioma);
   	}
   	
   	public String getPrecio(int horas)
   	{
   		return "Precio del alquiler: " + horas * 0.75; 
   	} 
}