package Exercicio2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Diga o modelo do carro:");
		String modelo = scan.nextLine();
		System.out.println("Diga a cor do carro:");
		String cor = scan.nextLine();
		System.out.println("Diga a velocidade maxima do carro:");
		int maxVelo = scan.nextInt();
		
		Carro carro = new Carro(cor,modelo,maxVelo);
		
		while(true){
			if(carro.isLigado())
				System.out.println("\nCarro Ligado!");
			else
				System.out.println("\nCarro Desligado!");
			System.out.println("\nVelocidade Atual:"+carro.getVeloAtual());
			System.out.println("Velocidade Maxima:"+carro.getVeloMaxima());
			System.out.println("\nEscolha 1 opção:");
			System.out.println("1 - Ligar Carro");
			System.out.println("2 - Desligar Carro");
			System.out.println("3 - Acelerar carro");
			System.out.println("4 - Sair");
			int op = scan.nextInt();
			
			switch (op){
			
			case 1: carro.ligar();
			break;
			case 2: carro.desligar();
			break;
			case 3:{
				System.out.println("Diga o valor para acelerar:");
				int acel = scan.nextInt();
				carro.acelerar(acel);
				break;
			}
			case 4: break;
			}
			
			if (op==4)
				break;
		}
		
		scan.close();
	}

}
