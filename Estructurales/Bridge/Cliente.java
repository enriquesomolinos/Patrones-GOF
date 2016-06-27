package Bridge;

public class Cliente
{
	public static void main(String args[])
	{		
		//Fechas de nacimiento
		Fecha2 f1 = new Fecha2(15, 3, 1965);
		Fecha2 f2 = new Fecha2(05, 8, 1975);
		Fecha2 f3 = new Fecha2(25, 11, 1980);
		Fecha2 f4 = new Fecha2(27, 10, 1987);
		
		//Diversos objetos de tipo persona
		Persona obj1 = new Persona( "06634246S", "Javier Garc�a", f1, "calle1", "546551687" );
		Persona obj2 = new Persona( "65834916K", "Andr�s S�nchez", f2, "calle2", "445677524" );
		Persona obj3 = new Persona( "91635476F", "Mar�a Rubio", f3, "calle3", "956708762" );
		Persona obj4 = new Persona( "15664386T", "Carmen P�rez", f4, "calle4", "858789019" );
				
		//**** Censo1 ****
		CensoAbst abst1 = new CensoAbst();
		CensoImp imp1 = new CensoImp1();
		//Introducimos los objetos en el censo 1		
		imp1.altaPersona(obj1);		
		imp1.altaPersona(obj2);
		imp1.altaPersona(obj3);
		imp1.altaPersona(obj4);		
		//Establecemos el implementador
		abst1.setImplementador(imp1);
		//Ordenamos los objetos del array por el atributo Nombre		
		Object personasNom[] = abst1.ordena();		
		//Presentamos el censo por nombre
		System.out.println("\nPersonas ordenadas por Nombre:");
		for (int i=0; i<personasNom.length; i++)
			System.out.println(personasNom[i].toString());	
		
		//**** Censo2 ****
		CensoAbst abst2 = new CensoAbst();
		CensoImp imp2 = new CensoImp2();		
		//Introducimos los objetos en el censo 2	
		imp2.altaPersona(obj1);		
		imp2.altaPersona(obj2);
		imp2.altaPersona(obj3);
		imp2.altaPersona(obj4);
		//Establecemos el implementador
		abst2.setImplementador(imp2);
		//Ordenamos los objetos del array por el atributo DNI
		Object personasDni[] = abst2.ordena();		
		//Presentamos el censo por dni		
		System.out.println("\nPersonas ordenadas por DNI:");			
		for (int i=0; i<personasDni.length; i++)
			System.out.println(personasDni[i].toString());
				
		//Con abstracci�n refinada
		CensoAbst abst3 = new CensoAbstRef();
		abst3.setImplementador(imp2);
		//Ordenamos los objetos del array por el atributo DNI
		Object personasDniTfno[] = abst3.ordena();		
		//Presentamos los tel�fonos del censo ordenados por el dni		
		System.out.println("\nTel�fonos de las personas ordenadas por DNI:");			
		for (int i=0; i<personasDniTfno.length; i++)
			System.out.println(personasDniTfno[i].toString());		
   }
}