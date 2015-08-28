package Exercicio6;

public class FitaLancamento extends Fita {

	public FitaLancamento(String titulo, double preco) {
		super(titulo, preco);
	}

	@Override
	public void setPreco(double preco) {
		this.preco += (preco *0.2) ;
	}
}
