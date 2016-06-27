package Singleton;
public class TestSingleton
{	
	Singleton s1, s2;
	
	public TestSingleton() 
	{
		s1 = Singleton.getInstancia();
		s2 = Singleton.getInstancia();
	}
	
	public void test() 
	{
		System.out.print("s1: ");
		System.out.println(s1.hashCode());
		System.out.print("s2: ");
		System.out.println(s2.hashCode());
		System.out.println("--------------------COMPROBACION---------------\n" +
		                   "    s1 == s2      : " + (s1 == s2) + "\n");                    
	}
	
	public static void main(String[] args) 
	{
		TestSingleton prueba = new TestSingleton();
		prueba.test();
	}	
}
