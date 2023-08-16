package LacosDeDecisoes;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		float numeroA,numeroB;
		int codigoop;
		float resultado;
				
		System.out.println("*Operações*");
		System.out.println("\n1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		System.out.println("\nDigite o 1º número:");
		numeroA = ler.nextFloat();
		System.out.println("\nDigite o 2º número:");
		numeroB = ler.nextFloat();
		System.out.println("\nOperação:");
		codigoop = ler.nextInt();
			
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