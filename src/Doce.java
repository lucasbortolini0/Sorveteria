
public class Doce extends ItemSobremesa {
	private double peso;
	private int precoPorQuilo;
	
	
	public Doce(String nome,double peso ,int  precoPorQuilo) {
		
		super(nome);
		this.peso = peso;
		this.precoPorQuilo = precoPorQuilo;
		
	}
	 

	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public int getPrecoPorQuilo() {
		return precoPorQuilo;
	}


	public void setPrecoPorQuilo(int precoPorQuilo) {
		this.precoPorQuilo = precoPorQuilo;
	}


	@Override
	public int getCusto() {
		return (int) (peso * precoPorQuilo); 
	}
	

	@Override
	public String toString() {
	  return String.format("%.2f g @ %s /kg\n%-25s %6s", getPeso(), 
	    Sorveteria.centavos2ReaisECentavos(precoPorQuilo), getNome(), Sorveteria.centavos2ReaisECentavos(getCusto()));
	}
	
}
