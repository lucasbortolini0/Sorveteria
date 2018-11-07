public class Sundae extends Sorvete {
	protected String calda;
	protected int precoDaCalda; 

	public Sundae(String nome, int custo, String calda, int precoDacalda) {
		super(nome,custo);
		// TODO Auto-generated constructor stub
		setCalda(calda);
		setPrecoDaCalda(precoDacalda);

	}

	public void setCalda(String calda) {
		this.calda = calda;
	}

	public void setPrecoDaCalda(int precoDaCalda) {
		this.precoDaCalda = precoDaCalda;
	}


	public String getCalda() {
		return calda;
	}

	public int getPrecoDaCalda() {
		return precoDaCalda;
	}


	public int getCusto(){
		return precoDaCalda + super.getCusto();

	}