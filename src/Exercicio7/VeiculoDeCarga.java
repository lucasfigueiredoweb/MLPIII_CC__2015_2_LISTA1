package Exercicio7;

public class VeiculoDeCarga extends Veiculo{
	
	private double capacidadeDeCarga;

	public VeiculoDeCarga(String placa, String marca, String modelo, int ano,
			long valorKmRodado, double kmInicial, double kmFinal,
			double valorDalocacao,double capacidadeDeCarga) {
		super(placa, marca, modelo, ano, valorKmRodado, kmInicial, kmFinal,
				valorDalocacao);
		this.capacidadeDeCarga = capacidadeDeCarga;
	}

	public double getCapacidadeDeCarga() {
		return capacidadeDeCarga;
	}

	public void setCapacidadeDeCarga(double capacidadeDeCarga) {
		this.capacidadeDeCarga = capacidadeDeCarga;
	}

	
		
	
}
