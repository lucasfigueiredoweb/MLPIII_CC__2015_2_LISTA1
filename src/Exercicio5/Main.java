package Exercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		int ano = 0, dia = 0, mes = 0;

		Data d = new Data(dia, mes, ano);

		System.out.println("Informe o ano:");
		d.setAno(ano = scan.nextInt());
		System.out.println("Informe o mes");
		d.setMes(mes = scan.nextInt());
		System.out.println("Informe o dia");
		d.setDia(dia = scan.nextInt());

		if (d.getAno() > 0)
			if (d.getMes() > 0 && d.getMes() < 12)
				if (d.getDia() > 0 && d.getDia() < 32)
					System.out.println(d.toString());
				else
					System.out.println("dia invalido");
			else
				System.out.println("mes invalido");
		else
			System.out.println("ano invalido");
	}
}
