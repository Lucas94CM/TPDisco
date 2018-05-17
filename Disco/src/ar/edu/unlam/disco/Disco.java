package ar.edu.unlam.disco;

public class Disco {
	
	private Double radioInterior;
	private Double radioExterior;
	private Double perimetroInterior;
	private Double perimetroExterior;
	private Double superficie;
	
	public Disco()
	{
		
	}
	
	public Disco(Double radioInterior, Double radioExterior, Double perimetroInterior, Double perimetroExterior, Double superficie)
	{
		this.radioInterior=radioInterior;
		this.radioExterior=radioExterior;
		this.perimetroInterior=perimetroInterior;
		this.perimetroExterior=perimetroExterior;
		this.superficie=superficie;
	}
	
	public void calcularPerimetroInterior()
	{
		perimetroInterior=this.radioInterior*Math.PI*2;
	}
	
	public void calcularPerimetroExterior()
	{
		perimetroExterior=this.radioExterior*Math.PI*2;
	}
	
	public void calcularSuperficie()
	{
		Double superficieCirculoExterior;
		Double superficieCirculoInterior;
		superficieCirculoExterior=Math.PI*this.radioExterior*this.radioExterior;
		superficieCirculoInterior=Math.PI*this.radioInterior*this.radioInterior;
		this.superficie=superficieCirculoExterior-superficieCirculoInterior;
	}
	
	public Double getRadioInterior()
	{
		return this.radioInterior;
	}
	
	public Double getRadioExterior()
	{
		return this.radioExterior;
	}
	
	public Double getPerimetroInterior()
	{
		return this.perimetroInterior;
	}
	
	public Double getPerimetroExterior()
	{
		return this.perimetroExterior;
	}
	
	public Double getSuperficie()
	{
		return this.superficie;
	}
	
	public void setRadioInterior(Double radioInterior)
	{
		this.radioInterior=radioInterior;
	}
	
	public void setRadioExterior(Double radioExterior)
	{
		this.radioExterior=radioExterior;
	}

}
