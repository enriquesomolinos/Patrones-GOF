package TemplateMethod;

//Clase abstracta Producto
public abstract class Producto
{  
   private String titulo;//titulo del producto
   
   //este es el Método Plantilla. Llama al método concreto de cada clase    
   public final String procesarInformacion(int horas)  
   {
       StringBuffer informacion = new StringBuffer("Información sobre el producto alquilado:\n");

       /*estos métodos seran implementados por todas las clases hijas de Producto 
        *para mostrar la información de cada producto concreto*/       
       informacion.append(getPresentacionProducto());       
       informacion.append("\n"+getPrecio(horas));
       
       return informacion.toString();
   }  
   
   //métodos get y set para todas las clases hijo
   public final void setNombreTitulo(String nomTit) 
   {
   	   this.titulo = nomTit;
   }
   public final String getNombreTitulo() 
   {
   	   return this.titulo;
   }
   
   //métodos abstractos. Deben ser implementados por cada clase hija
   
   //presentación del producto concreto
   public abstract String getPresentacionProducto();
   
   //devuelve el precio del alquiler del producto según las horas de alquiler
   public abstract String getPrecio(int horas); 
}