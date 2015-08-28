package Exercicio1;

public class Fatura {

	private String numero;
	private String descricao;
	private int qtdItens;
	private double preco;

	//Construtores
	public Fatura(String numero,String descricao,int qtdItens,double preco){
		this.setNumero(numero);
		this.setDescricao(descricao);
		this.setQtdItens(qtdItens);
		this.setPreco(preco);
	}
	
	//Getters e Setters
	public double getValorFatura() {
		double fatura = this.getQtdItens() * this.getPreco();

		if (fatura < 0)
			fatura = 0;
		return fatura;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQtdItens() {
		return qtdItens;
	}

	public void setQtdItens(int qtdItens) {
		this.qtdItens = qtdItens;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if(preco<0)
			this.preco = 0;
		else
			this.preco = preco;
	}

}
