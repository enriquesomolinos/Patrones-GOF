package Visitor;

public class VisitanteHorarioReducido implements Visitante
{
	public double visitar(LlamadaMetropolitana metropoli)
	{
		return metropoli.getDuracion() * 0.0099;
	}
	
   	public double visitar(LlamadaProvincial prov)
   	{
   		return prov.getDuracion() * 0.0264;
   	}
   	
   	public double visitar(LlamadaInterprovincial intprov)
   	{
   		return intprov.getDuracion() * 0.0378;
   	}
}