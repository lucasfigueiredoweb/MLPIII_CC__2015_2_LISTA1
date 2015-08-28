package Exercicio6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		String titulo = null;
		double precoinicial = 1.0;

		FitaLancamento fita1 = new FitaLancamento(titulo, precoinicial);
		FitaInfantil fita2 = new FitaInfantil(titulo, precoinicial);

		System.out.println("Informe a fita Desejada: 1 - FITA LANCAMENTO / 2 - FITA INFANTIL");
		String opcao = scan.nextLine();
		
		if (opcao.equals("1")) {
			System.out.println("Escolha o nome da fita");
			fita1.setTitulo(titulo = scan.nextLine());
			fita1.setPreco(precoinicial);
			System.out.println(fita1.getTitulo());
			System.out.println("R$ = " + fita1.getPreco());
		} else if (opcao.equals("2")) {
			System.out.println("Escolha o nome da fita");
			fita2.setTitulo(titulo = scan.nextLine());
			fita2.setPreco(precoinicial);
			System.out.println(fita2.getTitulo());
			System.out.println("R$ = " + fita2.getPreco());
		} else
			System.out.println("Fita nao encontrada!");
	}

}
