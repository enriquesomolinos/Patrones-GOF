package Visitor;

/*Interfaz Visitante. Define un m�todo visitar para cada una de las clases 
 *concretas a visitar*/
public interface Visitante
{   
   	public double visitar(LlamadaMetropolitana metropoli);	
   	public double visitar(LlamadaProvincial prov);			
   	public double visitar(LlamadaInterprovincial intprov);	
} 
