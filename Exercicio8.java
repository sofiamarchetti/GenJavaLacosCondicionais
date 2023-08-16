package LacosDeDecisoes;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float numeroA,numeroB;
		int codigoop;
		float resultado;
				
		System.out.println("*Operações*");
		System.out.println("\n1 - Saldo");
		System.out.println("2 - Saque");
		System.out.println("3 - Depósito");
		System.out.println("\nDigite o 1º número:");
		numeroA = ler.nextFloat();
		System.out.println("\nDigite o 2º número:");
		numeroB = ler.nextFloat();
		System.out.println("\nOperação:");
		codigoop = ler.nextInt();

//		falta daqui pra baixo
		
		switch(codigoop) {
			case 1:
				resultado = numeroA + numeroB;
				System.out.println("\nResultado: "+resultado);
				break;
			case 2:
				resultado = numeroA - numeroB;
				System.out.println("\nResultado: "+resultado);
				break;
			case 3:
				resultado = numeroA * numeroB;
				System.out.println("\nResultado: "+resultado);
				break;
			case 4:
				resultado = numeroA / numeroB;
				System.out.println("\nResultado: "+resultado);
				break;
			default:
				System.out.println("\nOperação Inválida!");
		}
	}
}