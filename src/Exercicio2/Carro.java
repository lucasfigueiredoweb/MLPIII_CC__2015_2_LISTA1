package Exercicio2;

public class Carro {

	private boolean ligado;
	String cor;
	String modelo;
	int veloAtual;
	int veloMaxima;

	public Carro(String cor, String modelo, int veloMaxima) {
		this.setLigado(false);
		this.setCor(cor);
		this.setModelo(modelo);
		this.setVeloAtual(0);
		this.setVeloMaxima(veloMaxima);
	}

	// Metodos de ligar,desligar e acelerar
	public void ligar() {
		if (!this.isLigado()) {
			this.setLigado(true);
		} else
			System.out.println("Carro ja esta ligado!");
	}

	public void desligar() {
		if (this.isLigado() && veloAtual == 0) {
			this.setLigado(false);

		} else
			System.out.println("O carro ja esta desligado ou esta em movimento");
	}

	public void acelerar(int velocidade) {
		if (this.getVeloAtual() + velocidade < this.getVeloMaxima() && this.isLigado()) {
			this.setVeloAtual(this.getVeloAtual() + velocidade);
			System.out.println("Velocidade atual:" + this.getVeloAtual());
		} else if (this.getVeloAtual() + velocidade > this.getVeloMaxima()) {
			System.out.println("Velocidade atual ultrapassaria a velocidade maxima de " + this.getVeloMaxima()
					+ " portanto a velocidae atual sera igual a maxima");
			this.setVeloAtual(this.getVeloMaxima());
		} else if (!this.isLigado())
			System.out.println("O Carro esta Desligado!");
	}

	// Getters e Setters

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVeloAtual() {
		return veloAtual;
	}

	public void setVeloAtual(int veloAtual) {
		this.veloAtual = veloAtual;
	}

	public int getVeloMaxima() {
		return veloMaxima;
	}

	public void setVeloMaxima(int veloMaxima) {
		this.veloMaxima = veloMaxima;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

}
