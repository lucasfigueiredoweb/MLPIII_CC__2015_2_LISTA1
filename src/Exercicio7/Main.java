package Exercicio7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		String placa = null;
		String marca = null;
		String modelo = null;
		int ano = 0;
		long valorKmRodado = 0;
		long valorDalocacao = 0;
		double kmInicial = 0;
		double kmFinal = 0;
		boolean arCondicionado = false;
		int quantidadeDePortas = 0;
		String ar;

//		VeiculoDeCarga caminhao = new VeiculoDeCarga("XMTJ45", "Scannia",
//				"Carreta", 2005, 30000, 1000, 100, 0, 500);
//
//		VeiculoDePasseio carro = new VeiculoDePasseio("RJLT89", "Wolkswagen",
//				"Super Sport", 2014, 560, 890, 350, 0, true, 4);

		VeiculoDePasseio limozine = new VeiculoDePasseio(placa, marca, modelo, ano, valorKmRodado, kmInicial, kmFinal, valorDalocacao, arCondicionado, quantidadeDePortas);

//		System.out.println(caminhao.getValorDalocacao());
//		System.out.println(carro.getValorDalocacao());

		System.out.println("Informe a Placa Desejada:");
		limozine.setPlaca(placa = scan.nextLine());
		
		System.out.println("Informe a Marca Desejada:");
		limozine.setMarca(marca = scan.nextLine());
		
		System.out.println("Informe o modelo Desejado:");
		limozine.setModelo(modelo = scan.nextLine());
		
		System.out.println("Informe o ano Desejado");
		limozine.setAno(ano = scan.nextInt());
		
		System.out.println("Informe o valor em KM's rodados do veiculo :");
		limozine.setValorKmRodado(valorKmRodado = scan.nextLong());
		
		System.out.println("Informe a quilometragem inicial:");
		limozine.setKmInicial(kmInicial = scan.nextDouble());
		
		System.out.println("Informe a quilometragem final:");
		limozine.setKmFinal(kmFinal = scan.nextDouble());
		
		System.out.println("Deseja o Veiculo com AR condicionado?");
		ar = scan.next();
		if (ar.equals("s") || ar.equals("S"))
			limozine.setArCondicionado(true);
		else
			limozine.setArCondicionado(false);
		
		System.out.println("Informe a quantidade de portas Desejadas:");
		limozine.setQuantidadeDePortas(quantidadeDePortas = scan.nextInt());
		
		System.out.println("O valor de locação do seu veiculo é");
		System.out.println(limozine.getValorDalocacao(limozine.getKmInicial(), limozine.getKmFinal(), (long) limozine.getValorKmRodado()));

	}
}
