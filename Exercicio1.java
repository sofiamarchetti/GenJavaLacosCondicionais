package LacosDeDecisoes;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		float numA,numB,numC,somaAB,op;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nEntre com o número A: ");
		numA = ler.nextFloat();
		System.out.println("\nEntre com o número B: ");
		numB = ler.nextFloat();
		System.out.println("\nEntre com o número C: ");
		numC = ler.nextFloat();
		
		somaAB = numA+numB;
		System.out.printf("\nSoma de A+B: %.2f",somaAB);
		
		if(somaAB>numC) {
			System.out.println("\nA soma de A+B é **maior** que o número C");	
		}
		else if(somaAB<numC) {
			System.out.println("\nA soma de A+B é **menor** que o número C");	
		}
		else if(somaAB == numC) {
			System.out.println("\nA soma de A+B é **igual** ao número C");	
		}
		else {
			System.out.println("\nNúmero inválido");
		}						
		}		
	}