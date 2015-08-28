package Exercicio7;

public class Veiculo {

	private String placa;
	private String marca;
	private String modelo;
	private int ano;
	private long valorKmRodado;
	private double kmInicial;
	private double kmFinal;

	public Veiculo(String placa, String marca, String modelo, int ano,
			long valorKmRodado, double kmInicial, double kmFinal,
			double valorDalocacao) {
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.valorKmRodado = valorKmRodado;
		this.kmInicial = kmInicial;
		this.kmFinal = kmFinal;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getValorKmRodado() {
		return valorKmRodado;
	}

	public void setValorKmRodado(long valorKmRodado) {
		this.valorKmRodado = valorKmRodado;
	}

	public double getKmInicial() {
		return kmInicial;
	}

	public void setKmInicial(double kmInicial) {
		this.kmInicial = kmInicial;
	}

	public double getKmFinal() {
		return kmFinal;
	}

	public void setKmFinal(double kmFinal) {
		this.kmFinal = kmFinal;
	}

	public long getValorDalocacao(double kmInicial,double kmFinal,long valorKmRodado) {
		return (long) Math.abs(((kmInicial - kmFinal) * valorKmRodado));
	}

	public void setValorDalocacao(double valorDalocacao) {
	}

}
