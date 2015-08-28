package Exercicio4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int salario = 0;
		
		System.out.println("Diga a Entrada:");
		String entrada = scan.nextLine();

		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher = pattern.matcher(entrada);

		@SuppressWarnings("unused")
		int pos = 0;
		while (matcher.find()) {

			salario += Integer.parseInt(matcher.group());
			pos = matcher.end();
		}
		System.out.println(salario);

		scan.close();
	}

}
