package Interpreter;

//Relaciona un empleado con una empresa

public class EmpresayEmpleado
{
    private String empresa;
    private String empleado;
    
    //constructor
    public EmpresayEmpleado(String empresa, String empleado)
    {
        this.empresa = empresa;
        this.empleado = empleado;
    }
    
    //metodos get
    public String getEmpresa() 
    {
    	return this.empresa;
   	}
    
    public String getEmpleado() 
    {
    	return this.empleado;
    }
} 