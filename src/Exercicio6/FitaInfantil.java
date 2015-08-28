package Exercicio6;

public class FitaInfantil extends Fita {

	public FitaInfantil(String titulo, double preco) {
		super(titulo, preco);
	}

	@Override
	public void setPreco(double preco) {
		this.preco -= (preco * 0.4);
	}

}
