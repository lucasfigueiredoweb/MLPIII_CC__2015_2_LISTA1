package Exercicio7;

public class VeiculoDePasseio extends Veiculo {
	
	private boolean arCondicionado;
	private int quantidadeDePortas;

	public VeiculoDePasseio(String placa, String marca, String modelo, int ano,
			long valorKmRodado, double kmInicial, double kmFinal,
			double valorDalocacao,boolean arCondicionado,int quantidadeDePortas) {
		super(placa, marca, modelo, ano, valorKmRodado, kmInicial, kmFinal,
				valorDalocacao);
		this.arCondicionado = arCondicionado;
		this.quantidadeDePortas = quantidadeDePortas;
	}

	public boolean isArCondicionado() {
		return arCondicionado;
	}

	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}

	public int getQuantidadeDePortas() {
		return quantidadeDePortas;
	}

	public void setQuantidadeDePortas(int quantidadeDePortas) {
		this.quantidadeDePortas = quantidadeDePortas;
	}

}
