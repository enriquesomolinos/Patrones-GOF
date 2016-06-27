package TemplateMethod;

public class PruebaPatron
{
	public static void main(String[] args) 
   	{
   		//se crean productos concretos
    	Producto p1 = new Pelicula("Mar Adentro", "Javier Bardem, Belén Rueda", 100); 
		Producto p2 = new Pelicula("Torrente", "Santiago Segura, Gabino Diego", 90);     	        	
       	Producto j1 = new Juego("Half Life 2", "Acción", "Castellano");        
        Producto j2 = new Juego("Warcraft", "Estrategia", "Castellano");        
       
       	System.out.println("EJEMPLO DE PATRON METODO PLANTILLA");
      	System.out.println(" "); 
       	//se invoca al metodo plantilla con cada objeto Producto      
       	System.out.println("Mostrando " + p1.procesarInformacion(5));   
       	System.out.println("Mostrando " + j1.procesarInformacion(10));   
       	System.out.println("Mostrando " + p2.procesarInformacion(3));
		System.out.println("Mostrando " + j2.procesarInformacion(8));       	       
   }
}   