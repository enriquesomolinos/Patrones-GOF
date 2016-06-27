package TemplateMethod;

//Clase abstracta Producto
public abstract class Producto
{  
   private String titulo;//titulo del producto
   
   //este es el M�todo Plantilla. Llama al m�todo concreto de cada clase    
   public final String procesarInformacion(int horas)  
   {
       StringBuffer informacion = new StringBuffer("Informaci�n sobre el producto alquilado:\n");

       /*estos m�todos seran implementados por todas las clases hijas de Producto 
        *para mostrar la informaci�n de cada producto concreto*/       
       informacion.append(getPresentacionProducto());       
       informacion.append("\n"+getPrecio(horas));
       
       return informacion.toString();
   }  
   
   //m�todos get y set para todas las clases hijo
   public final void setNombreTitulo(String nomTit) 
   {
   	   this.titulo = nomTit;
   }
   public final String getNombreTitulo() 
   {
   	   return this.titulo;
   }
   
   //m�todos abstractos. Deben ser implementados por cada clase hija
   
   //presentaci�n del producto concreto
   public abstract String getPresentacionProducto();
   
   //devuelve el precio del alquiler del producto seg�n las horas de alquiler
   public abstract String getPrecio(int horas); 
}