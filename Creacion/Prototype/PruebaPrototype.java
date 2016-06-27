package Prototype;
/*********************************************************************
 * EJEMPLO DE PROTOTYPE PATTERN: copia()
 *********************************************************************/

import java.util.*;

public class PruebaPrototype
{
  Persona juan, luis;
  Vector tfnos = new Vector();

  public PruebaPrototype() 
  {
  	Fecha2 f1 = new Fecha2(15, 3, 1965);
    tfnos.add("918885566");
    tfnos.add("606997755");
    juan = new Persona( "15664386T", "Juan", f1, "calle", tfnos );
    luis = (Persona) juan.copia();
  }

  public void test() 
  {
    System.out.print("Juan: ");
    System.out.println(juan.toString());
    System.out.print("Luis: ");
    System.out.println(luis.toString());
    System.out.println("--------------------COPIA PROFUNDA---------------\n" +
                       "    juan == luis      : " + (juan == luis) + "\n" +
                       "    juan.equals(luis) : " + juan.equals(luis));

  }

  public static void main(String[] args) 
  {
    PruebaPrototype prueba = new PruebaPrototype();
    prueba.test();
  }

}
