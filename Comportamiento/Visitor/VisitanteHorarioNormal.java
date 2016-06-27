package Visitor;

public class VisitanteHorarioNormal implements Visitante
{
	public double visitar(LlamadaMetropolitana metropoli)
	{
		return metropoli.getDuracion() * 0.0240;
	}
	
   	public double visitar(LlamadaProvincial prov)
   	{
   		return prov.getDuracion() * 0.0384;
   	}
   	
   	public double visitar(LlamadaInterprovincial intprov)
   	{
   		return intprov.getDuracion() * 0.0645;
   	}
}