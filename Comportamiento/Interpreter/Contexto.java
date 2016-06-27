package Interpreter;

// Almacena los empleados, empresas y sus relaciones

import java.util.ArrayList;
import java.util.ListIterator;

public class Contexto
{  
   private ArrayList empresas = new ArrayList();			//los empresas 
   private ArrayList empleados = new ArrayList();			//los empleados
   private ArrayList empresasyempleados = new ArrayList();	//las relaciones
   
   //a�ade un empresa a la lista
   public void a�adirEmpresa(String empresa) 
   {
   		empresas.add(empresa);
   }
   
   //a�ade un empleado a la lista
   public void a�adirEmpleado(String empleado) 
   {
   		empleados.add(empleado);
   }
   
   //a�adimos una relacion entre empleado y empresa al array
   public void a�adirEmpresayEmpleado(EmpresayEmpleado empresayempleado) 
   {
   		empresasyempleados.add(empresayempleado);
   }
   
   //metodos get para los arrays
   public ArrayList getEmpresas() 
   {
   		return empresas;
   }
   
   public ArrayList getEmpleados() 
   {
   		return empleados;
   }  
   
   /* devuelve un array con los empleados que pertenecen a la empresa que se pasa
    * como par�metro */
   public ArrayList getEmpleadosPorEmpresa(String empresaEn)
   {
       ArrayList empleadosPorEmpresa = new ArrayList();
       EmpresayEmpleado tempempresayempleado;
       ListIterator iteradorEmpresasyEmpleados = empresasyempleados.listIterator();
       while (iteradorEmpresasyEmpleados.hasNext())
       {
           tempempresayempleado = (EmpresayEmpleado)iteradorEmpresasyEmpleados.next();
           if (empresaEn.equals(tempempresayempleado.getEmpresa()))
           {
               empleadosPorEmpresa.add(tempempresayempleado.getEmpleado());           
           }
       }
       return empleadosPorEmpresa;
   }
   
   /* devuelve un array con las empresas en las que ha trabajado el empleado que se
    * pasa como par�metro */
   public ArrayList getEmpresasPorEmpleado(String empleadoEn)
   {
       ArrayList empresasPorEmpleado = new ArrayList();
       EmpresayEmpleado tempempresayempleado;
       ListIterator iteradorEmpleadosyEmpresas = empresasyempleados.listIterator();
       while (iteradorEmpleadosyEmpresas.hasNext())
       {
           tempempresayempleado = (EmpresayEmpleado)iteradorEmpleadosyEmpresas.next();
           if (empleadoEn.equals(tempempresayempleado.getEmpleado()))
           {
               empresasPorEmpleado.add(tempempresayempleado.getEmpresa());           
           }
       }
       return empresasPorEmpleado;
   }   
}