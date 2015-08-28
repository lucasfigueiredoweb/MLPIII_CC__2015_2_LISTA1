package Exercicio1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Diga o numero do produto:");
	String numero =  scan.nextLine();
	System.out.println("Diga a descrição do produto:");
	String desc = scan.nextLine();
	System.out.println("Diga a quantidade de produtos:");
	int qtd = scan.nextInt();
	System.out.println("Diga o preço do produto:");
	double preco = scan.nextDouble();
	
	Fatura fatura = new Fatura(numero,desc,qtd,preco);
	
	System.out.println("Valor da Fatura:"+fatura.getValorFatura());
	
	
	
	
	scan.close();
	
	}

}
