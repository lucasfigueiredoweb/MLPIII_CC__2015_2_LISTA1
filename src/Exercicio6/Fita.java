package Exercicio6;

public abstract class Fita {
	
	private String titulo;
	protected double preco;
	
	public Fita(String titulo, double preco) {
		this.titulo = titulo;
		this.preco = preco;
	}

	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
