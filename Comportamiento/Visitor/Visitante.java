package Visitor;

/*Interfaz Visitante. Define un método visitar para cada una de las clases 
 *concretas a visitar*/
public interface Visitante
{   
   	public double visitar(LlamadaMetropolitana metropoli);	
   	public double visitar(LlamadaProvincial prov);			
   	public double visitar(LlamadaInterprovincial intprov);	
} 
